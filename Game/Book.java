import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Book here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Book extends Actor
{
    public Book()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*4, image.getHeight()*4);
    }
}
