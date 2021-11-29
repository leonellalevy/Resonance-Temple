import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    private int value = 2;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int rnd = Greenfoot.getRandomNumber(20);
        if(rnd == 0){
            if (getWorld().getObjects(HunterBob.class).isEmpty()) return; 
            Actor bob = (Actor)getWorld().getObjects(HunterBob.class).get(0); 
            turnTowards(bob.getX(), bob.getY()); 
        } else if(rnd==1) {
            turn(45);
        } else{
        move(2);
    }
    killSnake();
}
public void killSnake()
{ 
    {
        if (isTouching(Bullet.class))
        {
            value--;
        }
        if (value == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
}
