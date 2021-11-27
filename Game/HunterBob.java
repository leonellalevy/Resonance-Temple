import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HunterBob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HunterBob extends SmoothMover
{
    GreenfootImage ActorWeapon = new GreenfootImage("boy1.png");
    boolean isImageSet = false;
    
    private static final int gunReloadTime = 5;         // The minimum delay between firing the gun.
    private int reloadDelayCount;               // How long ago we fired the gun the last time.

    /**
     * Act - do whatever the Bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HunterBob()
    {
        reloadDelayCount = 5;
        addToVelocity(new Vector(13, 0.7));
    }
    public void act()
    {
        shift();
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
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 3, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 3, getY());
        }
        if(isTouching(Snake.class))
        {
            Background background= (Background)getWorld();
            background.removeLives();
            removeTouching(Snake.class);
        }
        if (Greenfoot.isKeyDown("space") && isImageSet)
        {
            fire();
        }
    }
    private void fire()
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            Bullet bullet = new Bullet (getVelocity(), getRotation());
            getWorld().addObject (bullet, getX(), getY());
            bullet.move ();
            reloadDelayCount = 0;
        }
    }
}
