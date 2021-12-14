import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Credits extends World
{
    public Credits()
    {    
        super(800, 600, 1); 
        GreenfootImage MenuPage = new GreenfootImage("FINAL_CREDITS.png");
        MenuPage.scale (getWidth(), getHeight ());
        setBackground(MenuPage);
        returnMenu();
        prepare();
    }

    private void returnMenu(){
        showText("Click on 'space' to return ",500,500);
        showText("to the main menu ",500,530);
        showText("and Manh Thang Tran, the idea's proposer!",550,252);
        showText("MIT LICENSE",720,50);
    }    

    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld (new Menu());
        }
    }
    
    private void prepare()
    {
        BlueJewel blueJewel = new BlueJewel();
        addObject(blueJewel,303,252);
        BlueJewel blueJewel2 = new BlueJewel();
        addObject(blueJewel2,739,531);
        BlueJewel blueJewel3 = new BlueJewel();
        addObject(blueJewel3,712,84);
        BlueJewel blueJewel4 = new BlueJewel();
        addObject(blueJewel4,76,53);
        BlueJewel blueJewel5 = new BlueJewel();
        addObject(blueJewel5,377,555);
        GreenJewel greenJewel = new GreenJewel();
        addObject(greenJewel,133,104);
        GreenJewel greenJewel2 = new GreenJewel();
        addObject(greenJewel2,192,408);
        GreenJewel greenJewel3 = new GreenJewel();
        addObject(greenJewel3,583,93);
        GreenJewel greenJewel4 = new GreenJewel();
        addObject(greenJewel4,732,380);
        GreenJewel greenJewel5 = new GreenJewel();
        addObject(greenJewel5,439,194);
        RedJewel redJewel = new RedJewel();
        addObject(redJewel,16,422);
        RedJewel redJewel2 = new RedJewel();
        addObject(redJewel2,530,399);
        RedJewel redJewel3 = new RedJewel();
        addObject(redJewel3,710,568);
        RedJewel redJewel4 = new RedJewel();
        addObject(redJewel4,659,114);
        RedJewel redJewel5 = new RedJewel();
        addObject(redJewel5,192,38);
    }
}
