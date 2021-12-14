import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 *This class shows the instructions of the first level.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Instruction extends World
{
    public Instruction()
    {   
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_INSTRUCTIONS.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
    }
    private void returnMenu(){
        showText("Click on '1' to return to continue",292,491);
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
