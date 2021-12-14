import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class is when the player win the game
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Win extends World
{
    private int timer;
    public Win()
    {    
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("GAME_WIN.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
        timer=0;
    }
    public void act()
    {
        timer++;
        if (timer<10){
            Greenfoot.playSound("YES.mp3");
        }
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld (new Credits());
        }
    }
        private void returnMenu(){
        showText("Click 'enter' to see the credits",600,491);
    }
}
