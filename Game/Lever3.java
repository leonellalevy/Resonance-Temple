import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lever3 here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Lever3 extends Actor
{
    GreenfootImage LeverLeft = new GreenfootImage("LeverLeft.png");
    GreenfootImage LeverRight = new GreenfootImage("LeverRight.png");
    public Lever3()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
        LeverLeft.scale(LeverLeft.getWidth()*1/4, LeverLeft.getHeight()*1/4);
        LeverRight.scale(LeverRight.getWidth()*1/4, LeverRight.getHeight()*1/4);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("C")) {
            setImage(LeverRight);
            SecondLevel secondLevel= (SecondLevel)getWorld();
            secondLevel.pointLever();
        }
        else if (Greenfoot.isKeyDown("A")) {
            setImage(LeverLeft);
        }
    }
}
