import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class represents the bullet that goes out the gun
 * 
 * @author Leonella Levy Martel(inspired by Michael Kolling)
 * @version (13/12/2021)
 * 
**/
public class BulletGun extends SmoothMover
{
    private int life = 30;
    private int damage = 2;
    public BulletGun(Vector speed, int rotation)
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
