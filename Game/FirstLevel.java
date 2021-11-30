import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
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
        super(600, 400, 1); 
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
        Snake snake = new Snake();
        addObject(snake,114,80);
        Snake snake2 = new Snake();
        addObject(snake2,431,77);
        Snake snake3 = new Snake();
        addObject(snake3,122,323);
        Snake snake4 = new Snake();
        addObject(snake4,421,318);
        Weapon weapon = new Weapon();
        addObject(weapon,189,208);
        Bob bob = new Bob();
        addObject(bob,291,197);
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
    private void noObject()
        {
            
        }
    private void showLives()
       {
          showText("Lives:" + lives, 490, 30);    
       }
}
