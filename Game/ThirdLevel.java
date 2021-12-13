import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevel extends World
{
    public static int jewels = SecondLevel.jewels;
    public static int lives = SecondLevel.lives;
    /**
     * Constructor for objects of class ThirdLevel.
     * 
     */
    public ThirdLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bob bob = new Bob();
        addObject(bob,406,391);
        Weapon weapon = new Weapon();
        addObject(weapon,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(800));
        Skeleton skeleton = new Skeleton();
        addObject(skeleton,139,145);
        Skeleton skeleton2 = new Skeleton();
        addObject(skeleton2,657,175);
        skeleton.setLocation(144,93);
        skeleton2.setLocation(665,215);
        Skeleton skeleton3 = new Skeleton();
        addObject(skeleton3,122,304);
        skeleton3.setLocation(167,354);
        Skeleton skeleton4 = new Skeleton();
        addObject(skeleton4,673,553);
        skeleton4.setLocation(653,508);
        Skeleton skeleton5 = new Skeleton();
        addObject(skeleton5,186,566);
        skeleton5.setLocation(187,610);
        Skeleton skeleton6 = new Skeleton();
        addObject(skeleton6,643,692);
        skeleton4.setLocation(620,471);
        skeleton3.setLocation(148,280);
        skeleton5.setLocation(174,571);
        skeleton2.setLocation(674,201);
        skeleton.setLocation(146,47);
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
    private void showLives()
       {
          showText("Lives:" + lives, 700, 25);    
       }
}
