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
        move(2);
        if (getWorld().getObjects(Bob3.class).isEmpty()) return; 
        Actor bob3 = (Actor)getWorld().getObjects(Bob3.class).get(0); 
        turnTowards(bob3.getX(), bob3.getY()); 
        killSkeleton();
    }
        public void killSkeleton()
    {
        if (isTouching(BulletGun.class))
        {
            value--;
            removeTouching(BulletGun.class);
            if(value==0){
               Greenfoot.setWorld (new Win());
            }
        }
    }
    
}
