import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Book2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book2 extends Actor
{
    /**
     * Act - do whatever the Book2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Font textFont = new Font ("TimesRoman", Font.BOLD,12);
    public Book2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*2, image.getHeight()*2);
    }
    public void act()
    {
        // Add your action code here.
    }
}
