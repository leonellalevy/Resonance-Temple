import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{
    private int points = 0;
    private int trials = 3;

    public static int jewels = FirstLevel.jewels;
    public static int lives= FirstLevel.lives;
    
    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public SecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        prepare();
        showJewels();
    }
    public void act(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) 
        {
            int x = mouse.getX();
            int y = mouse.getY();

            if (Greenfoot.mouseClicked(null)) {
                if (x > 612 && x < 637 && y > 647 && y < 671) {
                    showText("Are you sure about your answers?", 400, 400); 
                }
            }
        }
    }
    public void removeLives()
       {
          lives--;
          Greenfoot.playSound("hurtSound.wav");
          showLives();
          if( lives == 0 )
             {
                Greenfoot.setWorld (new Die());   
             }  
       }
    public void removeJewels()
       {
          jewels--;
          Greenfoot.playSound("Ding.wav");
          showJewels();
       }
    private void showLives()
       {
          showText("Lives:" + lives, 700, 25);    
       }
    private void showJewels()
       {
          showText("Jewels:" + jewels, 700, 50);    
       }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bob bob = new Bob();
        addObject(bob,50,151);
        Lever lever = new Lever();
        addObject(lever,200,175);
        Lever2 lever22 = new Lever2();
        addObject(lever22,310,175);
        Lever3 lever33 = new Lever3();
        addObject(lever33,420,175);
        Lever4 lever44 = new Lever4();
        addObject(lever44,530,175);
        Lever5 lever55 = new Lever5();
        addObject(lever55,640,175);
        Book book = new Book();
        addObject(book,411,525);
        removeObject(bob);
        Bob2 bob2 = new Bob2();
        addObject(bob2,138,177);
        bob2.setLocation(38,177);
        Button button = new Button();
        addObject(button,625,660);
    }
}
