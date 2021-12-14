import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton2 here.
 * 
 * @author Leonella Levy Martel
 * @version (13/12/2021)
 */
public class Skeleton2 extends Actor
{
    private int value = 2;
    public Skeleton2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*1/4, image.getHeight()*1/4);
    }
    public void act()
    {
        int i;
        int skeletons = getWorld().getObjects(Skeleton2.class).size();
        for(i=6; i > skeletons ; i--) {
            getWorld().addObject(new Skeleton2(),Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(800));
            if(i==0){
                i=6;
            } 
        }
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
