import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {    
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_WIN.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);

        prepare();
        returnMenu();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld (new Menu());
        }
    }
        private void returnMenu(){
        showText("Click 'enter' to return to the main menu",600,491);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
}
