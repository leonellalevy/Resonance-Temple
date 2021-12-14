import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button use in second level
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Button extends Actor
{
    public Button(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
    }
}
