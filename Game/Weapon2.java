import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon2 extends SmoothMover
{
    /**
     * Act - do whatever the Weapon2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Weapon2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/10, image.getHeight()*1/10);
    }
    public void act()
    {
        if (isTouching(Bob3.class)){
            getWorld().removeObject(this);
        }
    }
}
