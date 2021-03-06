import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class allows you to kill your enemy
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Weapon extends SmoothMover
{
    public Weapon()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/10, image.getHeight()*1/10);
    }
    public void act()
    {
        if (isTouching(Bob.class)){
            getWorld().removeObject(this);
        }
    }
}
