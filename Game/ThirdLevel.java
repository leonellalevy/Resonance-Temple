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
    public int timer;
    /**
     * Constructor for objects of class ThirdLevel.
     * 
     */
    public ThirdLevel()
    {    
        super(800, 800, 1);
        timer =2000;
        prepare();
    }
    public void act(){
        timer--;
        showText(""+timer, 50, 50);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Weapon2 weapon22 = new Weapon2();
        addObject(weapon22,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(800));
        Bob3 bob3 = new Bob3();
        addObject(bob3,430,322);
        bob3.setLocation(413,401);
        Skeleton2 skeleton2 = new Skeleton2();
        addObject(skeleton2,637,141);
        Skeleton2 skeleton22 = new Skeleton2();
        addObject(skeleton22,160,139);
        Skeleton2 skeleton23 = new Skeleton2();
        addObject(skeleton23,156,627);
        Skeleton2 skeleton24 = new Skeleton2();
        addObject(skeleton24,643,357);
        Skeleton2 skeleton25 = new Skeleton2();
        addObject(skeleton25,617,740);
        Skeleton2 skeleton26 = new Skeleton2();
        addObject(skeleton26,617,501);
        skeleton23.setLocation(158,594);
        skeleton26.setLocation(642,483);
        skeleton24.setLocation(146,358);
        skeleton2.setLocation(639,228);
        skeleton24.setLocation(154,301);
        skeleton22.setLocation(146,63);
        skeleton2.setLocation(644,182);
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
