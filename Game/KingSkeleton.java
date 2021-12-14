import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the final enemy of the main character, it can kills Bob
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
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
        move(3/2);
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
