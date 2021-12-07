import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book extends Actor
{
    /**
     * Act - do whatever the Book wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Book()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*4, image.getHeight()*4);
    }
    public void act()
    {
        // Add your action code here.
    }
}
