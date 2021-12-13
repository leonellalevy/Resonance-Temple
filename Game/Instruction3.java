import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction3 extends World
{

    /**
     * Constructor for objects of class Instruction3.
     * 
     */
    public Instruction3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("instructions3.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
        prepare();
    }
    private void returnMenu(){
        showText("Click '3' to return to Menu Page",292,491);
        showText("LEVEL 3",400,25);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("3"))
        {
            Greenfoot.setWorld (new Menu());
        }
    }
    
    private void prepare()
    {

    }
}
