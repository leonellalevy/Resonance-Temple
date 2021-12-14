import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ThirdLevel here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class ThirdLevel extends World
{
    public int jewels;
    public int lives;
    public int timer;
    public ThirdLevel(int lives, int jewels)
    {    
        super(800, 800, 1);
        this.jewels=jewels;
        this.lives=lives;
        timer =3000;
        showJewels();
        showLives();
        prepare();
    }
    public void act(){
        timer--;
        showText("Timer: "+timer, 100, 50);
        diamond();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) 
        {
            int x = mouse.getX();
            int y = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (x > 63 && x < 99 && y > 715 && y < 751) {
                     while( jewels > 0 )
                    {
                        removeJewels();  
                    }  
                }
            }
        }
    }
    private void diamond(){
        showText("Lives = Jewels, Press on the red button with your mouse!", 400, 200);
    }
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
        Button2 button2 = new Button2();
        addObject(button2,86,716);
        button2.setLocation(81,733);
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
          addLives();
          Greenfoot.playSound("Ding.wav");
          showJewels();
       }
    private void addLives()
       {
          lives++;
          showLives();
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
