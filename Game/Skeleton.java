import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Skeleton extends Actor
{
    private int value = 2;
    public Skeleton()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
    }
    public void act()
    {
        int rnd = Greenfoot.getRandomNumber(20);
        if(rnd == 0){
            if (getWorld().getObjects(Bob.class).isEmpty()) return; 
            Actor bob = (Actor)getWorld().getObjects(Bob.class).get(0); 
            turnTowards(bob.getX(), bob.getY()); 
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
