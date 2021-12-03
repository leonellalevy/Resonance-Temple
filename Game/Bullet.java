import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends SmoothMover
{
    private int life = 30;
    private int damage = 2;
    public Bullet()
    {
    }
    public Bullet(Vector speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        addToVelocity(new Vector(rotation, 15));
    }
        public void act()
    {
        if(life <= 0) {
            getWorld().removeObject(this);
        } 
        else {
            life--;
            move();
        }
    }
}

