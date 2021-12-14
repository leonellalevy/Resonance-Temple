import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Instruction here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Instruction extends World
{
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_INSTRUCTIONS.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
    }
    private void returnMenu(){
        showText("Click '1' to return to continue",292,491);
        showText("LEVEL 1",400,25);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld (new Instruction2());
        }
    }
}
