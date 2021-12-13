import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bob2 extends SmoothMover
{
    GreenfootImage ActorRight = new GreenfootImage("Explore2.png");
    GreenfootImage ActorLeft = new GreenfootImage("ExploreLeft.png");
    GreenfootImage ActorWeaponRight = new GreenfootImage("CharWithGunRight.png");
    GreenfootImage ActorWeaponLeft = new GreenfootImage("CharWithGunLeft.png");
    public Bob2(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/7, image.getHeight()*1/7);
        
        ActorRight.scale(ActorRight.getWidth()*1/7, ActorRight.getHeight()*1/7);
        ActorLeft.scale(ActorLeft.getWidth()*1/7, ActorLeft.getHeight()*1/7);
        setImage(image);
    }
    public void act()
    {
        shift();
        lookForDiamonds();
    }
    private void shift()
    {
        moveA();
        if(isTouching(Lever.class))
        {
            getWorld().showText("Question 1",410,250);
            getWorld().showText("Press on key 'B' or key 'Z'",410,650);
        }
        else if(isTouching(Lever2.class))
        {
            getWorld().showText("Question 2",410,250);
            getWorld().showText("Press on key 'H' or key 'L'",410,650);
        }
        else if(isTouching(Lever3.class))
        {
            getWorld().showText("Question 3",410,250);
            getWorld().showText("Press on key 'C' or key 'A'",410,650);
        }
        else if(isTouching(Lever4.class))
        {
            getWorld().showText("Question 4",410,250);
            getWorld().showText("Press on key 'D' or key 'M'",410,650);
        }
        else if(isTouching(Lever5.class))
        {
            getWorld().showText("Question 5",410,250);
            getWorld().showText("Press on key 'P' or key 'E'",410,650);
        }
    }
    private void moveA(){
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
        }
        else if (Greenfoot.isKeyDown("down")) {
             setLocation(getX(), getY() + 3);
        }
        else if (Greenfoot.isKeyDown("right")) {
            setImage(ActorRight);
            setLocation(getX() + 3, getY());
        }
        else if (Greenfoot.isKeyDown("left")) {
            setImage(ActorLeft);
            setLocation(getX() - 3, getY());
        }
    }
    public void lookForDiamonds(){
        if (isTouching(BlueJewel.class)){
            removeTouching(BlueJewel.class);
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeJewels();
        }    
        if (isTouching(GreenJewel.class)){
            removeTouching(GreenJewel.class);
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeJewels();
        }
        if (isTouching(RedJewel.class)){
            removeTouching(RedJewel.class);
            FirstLevel firstLevel= (FirstLevel)getWorld();
            firstLevel.removeJewels();
        }
    }
}
