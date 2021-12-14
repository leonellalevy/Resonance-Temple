import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class shows the instructions of the third level.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Instruction3 extends World
{
    public Instruction3()
    {    
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("instructions3.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
    }
    private void returnMenu(){
        showText("Click on '3' to return to Menu Page",292,491);
        showText("LEVEL 3",400,25);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("3"))
        {
            Greenfoot.setWorld (new Menu());
        }
    }
}
