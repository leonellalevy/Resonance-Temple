import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skeleton2 extends Actor
{
    private int value = 2;
    /**
     * Act - do whatever the Skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Skeleton2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
    }
    public void act()
    {
        int rnd = Greenfoot.getRandomNumber(20);
        if(rnd == 0){
            if (getWorld().getObjects(Bob3.class).isEmpty()) return; 
            Actor bob3 = (Actor)getWorld().getObjects(Bob3.class).get(0); 
            turnTowards(bob3.getX(), bob3.getY()); 
        } else if(rnd==1) {
            turn(45);
        } else{
        move(5/2);
        }
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
