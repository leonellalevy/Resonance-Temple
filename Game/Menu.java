import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        super(600, 400, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_MENU.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);

        prepare();
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
                if (x > 240 && x < 517 && y > 150 && y < 200) {
                    Greenfoot.setWorld (new FirstLevel());
                }
                if (x > 240 && x < 517 && y > 256 && y < 307) {
                    Greenfoot.setWorld (new Instruction());
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
