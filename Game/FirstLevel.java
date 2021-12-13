import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import greenfoot.World;

//https://resizeimage.net/#google_vignette
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    public static int lives;
    public static int jewels;
    /**
     * Constructor for objects of class Background.
     * 
     */
    public FirstLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
        lives = 3;
        jewels = 0;
        showLives();
        showJewels();
    }
    public void act(){
        int skeletons = getObjects(Skeleton.class).size();
        if (skeletons==0){
            showText("GOOD JOB, YOU WIN!   Click 'enter' to go the the second level",400,400);
            removeObjects(getObjects(null));
            Bob bob = new Bob(); 
            addObject(bob,411,377);
            if(Greenfoot.isKeyDown("Enter"))
            {
                World Level2 = new SecondLevel();
                Greenfoot.setWorld (Level2);
            }
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Skeleton skeleton = new Skeleton();
        addObject(skeleton,Greenfoot.getRandomNumber(800),80);
        Weapon weapon = new Weapon();
        addObject(weapon,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(800));
        Bob bob = new Bob();
        addObject(bob,411,377);
        Skeleton skeleton2 = new Skeleton();
        addObject(skeleton2,Greenfoot.getRandomNumber(800),108);
        Skeleton skeleton3 = new Skeleton();
        addObject(skeleton3,Greenfoot.getRandomNumber(800),688);
        Skeleton skeleton4 = new Skeleton();
        addObject(skeleton4,Greenfoot.getRandomNumber(800),555);
        Skeleton skeleton5 = new Skeleton();
        addObject(skeleton5,Greenfoot.getRandomNumber(800),706);
        Skeleton skeleton6 = new Skeleton();
        addObject(skeleton6,Greenfoot.getRandomNumber(800),178);
        GreenJewel greenJewel = new GreenJewel();
        addObject(greenJewel,185,93);
        GreenJewel greenJewel2 = new GreenJewel();
        addObject(greenJewel2,165,688);
        greenJewel2.setLocation(272,693);
        RedJewel redJewel = new RedJewel();
        addObject(redJewel,559,90);
        RedJewel redJewel2 = new RedJewel();
        addObject(redJewel2,483,580);
        BlueJewel blueJewel = new BlueJewel();
        addObject(blueJewel,90,360);
        BlueJewel blueJewel2 = new BlueJewel();
        addObject(blueJewel2,662,509);
        redJewel2.setLocation(566,649);
        blueJewel2.setLocation(741,402);
        redJewel.setLocation(545,131);
        blueJewel.setLocation(186,375);
        skeleton3.setLocation(144,696);
        skeleton5.setLocation(449,597);
        skeleton4.setLocation(691,485);
        skeleton6.setLocation(50,239);
        skeleton2.setLocation(407,143);
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
          jewels++;
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
}
