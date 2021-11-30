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

        prepare();
    }

    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) 
        {
            int x = mouse.getX();
            int y = mouse.getY();

            if (Greenfoot.mouseClicked(null)) {
                if (x > 168 && x < 567 && y > 180 && y < 250) {
                    Greenfoot.setWorld (new FirstLevel());
                }
            }
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
