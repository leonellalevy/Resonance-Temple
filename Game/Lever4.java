import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lever4 extends Actor
{
    GreenfootImage LeverLeft = new GreenfootImage("LeverLeft.png");
    GreenfootImage LeverRight = new GreenfootImage("LeverRight.png");
    public Lever4()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
        LeverLeft.scale(LeverLeft.getWidth()*1/4, LeverLeft.getHeight()*1/4);
        LeverRight.scale(LeverRight.getWidth()*1/4, LeverRight.getHeight()*1/4);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("D")) {
            setImage(LeverRight);
        }
        else if (Greenfoot.isKeyDown("M")) {
            setImage(LeverLeft);
        }
    }
}
