import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
//https://resizeimage.net/#google_vignette
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    private int lives;
    /**
     * Constructor for objects of class Background.
     * 
     */
    public FirstLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
        lives = 2;
        showLives();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Skeleton skeleton = new Skeleton();
        addObject(skeleton,114,80);
        Weapon weapon = new Weapon();
        addObject(weapon,89,211);
        Bob bob = new Bob();
        addObject(bob,411,377);
        Skeleton skeleton2 = new Skeleton();
        addObject(skeleton2,670,108);
        Skeleton skeleton3 = new Skeleton();
        addObject(skeleton3,702,688);
        Skeleton skeleton4 = new Skeleton();
        addObject(skeleton4,157,555);
        Skeleton skeleton5 = new Skeleton();
        addObject(skeleton5,431,706);
        Skeleton skeleton6 = new Skeleton();
        addObject(skeleton6,408,178);
    }

    public void removeLives()
       {
          lives--;
          showLives();
          if( lives == 0 )
             {
                Greenfoot.setWorld (new Die());   
             }  
       }
    private void showLives()
       {
          showText("Lives:" + lives, 700, 50);    
       }
}
