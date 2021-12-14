import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction2 here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Instruction2 extends World
{
    public Instruction2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage MenuPage2 = new GreenfootImage("instructions2.png");
        MenuPage2.scale (getWidth(), getHeight ());
        setBackground(MenuPage2);
        returnMenu();
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
}
