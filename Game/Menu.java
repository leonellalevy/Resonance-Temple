import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class is the menu where you can see the instructions and start the game
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Menu extends World
{
    public static GreenfootSound music = new GreenfootSound("RealBobChanson.wav");
    /**
     * Constructor for objects of class MenuPage.
     * 
     */
    public Menu()
    {    
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_MENU.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
    }

    public void act()
    {
        music.playLoop();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) 
        {
            int x = mouse.getX();
            int y = mouse.getY();
            if (Greenfoot.mouseClicked(null)) {
                if (x > 315 && x < 690 && y > 222 && y < 300) {
                    World Level1 = new FirstLevel(3,0);
                    Greenfoot.setWorld (Level1); 
                }
                if (x > 315 && x < 690 && y > 385 && y < 460) {
                    Greenfoot.setWorld (new Instruction());
                }
            }
        }
    }
}
