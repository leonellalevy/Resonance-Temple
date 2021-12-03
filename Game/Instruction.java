import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{

    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_INSTRUCTIONS.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
        prepare();
    }

    private void returnMenu(){
        showText("Click 'enter' to return to the main menu",292,491);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld (new Menu());
        }
    }
    
    private void prepare()
    {

    }
}
