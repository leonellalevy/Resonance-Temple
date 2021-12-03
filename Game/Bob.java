import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob extends SmoothMover
{
    GreenfootImage ActorRight = new GreenfootImage("Explore2.png");
    GreenfootImage ActorLeft = new GreenfootImage("ExploreLeft.png");
    GreenfootImage ActorWeapon = new GreenfootImage("boy2.png");
    
    private static final int gunReloadTime = 5; 
    private int reloadDelayCount; 
    
    boolean isImageSet = false;
    private int rotation = 0;
    /**
     * Act - do whatever the Bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bob()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/7, image.getHeight()*1/7);
        ActorRight.scale(ActorRight.getWidth()*1/7, ActorRight.getHeight()*1/7);
        ActorLeft.scale(ActorLeft.getWidth()*1/7, ActorLeft.getHeight()*1/7);
        setImage(image);
        reloadDelayCount = 5;
        addToVelocity(new Vector(13, 0.7));
    }
    public void act()
    {
        shift();
        if (isTouching(Weapon.class)){
            changeimage(ActorWeapon);
        }
        reloadDelayCount++;
    }
    private void changeimage(GreenfootImage Image)
    {
        setImage(Image);
        isImageSet = true;
    }
    private void shift()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
            rotation =270;
        }
        else if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
            rotation = 90;
        }
        else if (Greenfoot.isKeyDown("right")) {
            setImage(ActorRight);
            setLocation(getX() + 3, getY());
            rotation = 0;
        }
        else if (Greenfoot.isKeyDown("left")) {
            setImage(ActorLeft);
            setLocation(getX() - 3, getY());
            rotation = 180;
        }
        if(isTouching(Skeleton.class))
        {
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeLives();
            removeTouching(Skeleton.class);
        }
                if (Greenfoot.isKeyDown("space") && isImageSet)
        {
            fire(rotation);
        }  
    }
    private void fire(int rotation)
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            Bullet bullet = new Bullet (getVelocity(), rotation);
            getWorld().addObject (bullet, getX(), getY());
            bullet.move ();
            reloadDelayCount = 0;
        }
    }
}
