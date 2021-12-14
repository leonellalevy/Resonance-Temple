import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class shows a lever in level 2
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Lever extends Actor
{
    GreenfootImage LeverLeft = new GreenfootImage("LeverLeft.png");
    GreenfootImage LeverRight = new GreenfootImage("LeverRight.png");
    public Lever()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
        LeverLeft.scale(LeverLeft.getWidth()*1/4, LeverLeft.getHeight()*1/4);
        LeverRight.scale(LeverRight.getWidth()*1/4, LeverRight.getHeight()*1/4);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("B")) {
            setImage(LeverRight);
        }
        else if (Greenfoot.isKeyDown("Z")) {
            setImage(LeverLeft);
            SecondLevel secondLevel= (SecondLevel)getWorld();
            secondLevel.pointLever();
        }
    }
}
