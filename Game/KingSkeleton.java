import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KingSkeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KingSkeleton extends Actor
{
    private int value = 10;
    public KingSkeleton(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/2, image.getHeight()*1/2);
    }
    public void act()
    {
        if (getWorld().getObjects(Bob.class).isEmpty()) return; 
        Actor bob = (Actor)getWorld().getObjects(Bob.class).get(0); 
        turnTowards(bob.getX(), bob.getY()); 
        move(3/2);
        killSkeleton();
    }
        public void killSkeleton()
    {
        if (isTouching(BulletGun.class))
        {
            value--;
            removeTouching(BulletGun.class);
            if(value==0){
               getWorld().removeObject(this); 
               Greenfoot.playSound("diesound.wav");
            }
        }
    }
    
}
