import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bob2 here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Bob2 extends SmoothMover
{
    GreenfootImage ActorRight = new GreenfootImage("Explore2.png");
    GreenfootImage ActorLeft = new GreenfootImage("ExploreLeft.png");
    
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
    }
    private void shift()
    {
        moveA();
        if(isTouching(Lever.class))
        {
            getWorld().showText("Question 1",410,250);
            getWorld().addObject(new Question1(), 400, 500);
        }
        else if(isTouching(Lever2.class))
        {
            getWorld().showText("Question 2",410,250);
            getWorld().addObject(new Question2(), 400, 500);
        }
        else if(isTouching(Lever3.class))
        {
            getWorld().showText("Question 3",410,250);
            getWorld().addObject(new Question3(), 400, 500);
        }
        else if(isTouching(Lever4.class))
        {
            getWorld().showText("Question 4",410,250);
            getWorld().addObject(new Question4(), 400, 500);
        }
        else if(isTouching(Lever5.class))
        {
            getWorld().showText("Question 5",410,250);
            getWorld().addObject(new Question5(), 400, 500);
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
            setImage(ActorRight);
            setLocation(getX() -3, getY());
        }
    }
}
