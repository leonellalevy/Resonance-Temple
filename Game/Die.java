import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Die here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Die extends World
{

    /**
     * Constructor for objects of class Die.
     * 
     */
    public Die()
    {    
        super(600, 400, 1); 
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
                if (x > 242 && x < 517 && y > 150 && y < 200) {
                    Greenfoot.setWorld (new Background());
                }
            }
        }
    }
}
