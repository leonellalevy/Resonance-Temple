import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction2 extends World
{

    /**
     * Constructor for objects of class Instruction2.
     * 
     */
    public Instruction2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage MenuPage2 = new GreenfootImage("instructions2.png");
        MenuPage2.scale (getWidth(), getHeight ());
        setBackground(MenuPage2);
        returnMenu();
        prepare();
    }
    private void returnMenu(){
        showText("Click '2' to return to continue",600,450);
        showText("LEVEL 2",400,25);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld (new Instruction3());
        }
    }
    
    private void prepare()
    {

    }
}
