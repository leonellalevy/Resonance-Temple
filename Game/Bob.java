import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob extends Actor
{
    GreenfootImage ActorWeapon = new GreenfootImage("boy1.png");
    boolean isImageSet = false;
    /**
     * Act - do whatever the Bob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        shoot();
        if (isTouching(Weapon.class)){
            changeimage(ActorWeapon);
        }
    }
    private void changeimage(GreenfootImage Image)
    {
        setImage(Image); 
        isImageSet = true;
    }
    private void move()
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
    }
    private void shoot()
    {
        if (Greenfoot.isKeyDown("space") && isImageSet)
        {
            fire();
        }
    }
    private void fire()
    {
        
    }
}
