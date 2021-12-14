import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is shown when the main character dies. The player can start the game again
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Die extends World
{
    /**
     * Constructor for objects of class Die.
     * 
     */
    public Die()
    {    
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_END.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);

    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) 
        {
            int x = mouse.getX();
            int y = mouse.getY();

            if (Greenfoot.mouseClicked(null)) {
                if (x > 223 && x < 746 && y > 270 && y < 371) {
                    Greenfoot.setWorld (new FirstLevel(3,0));
                }
            }
        }
    }

}
