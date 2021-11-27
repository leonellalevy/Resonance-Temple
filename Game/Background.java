import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private int lives;
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        lives = 3;
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
        HunterBob hunterBob = new HunterBob();
        addObject(hunterBob,297,204);
        Weapon weapon = new Weapon();
        addObject(weapon,189,208);
    }

    public void removeLives()
       {
          lives--;
          showLives();
          if( lives == 0 )
             {
             Greenfoot.stop();    
             }  
       }
    private void showLives()
       {
          showText("Lives:" + lives, 490, 30);    
       }
}
