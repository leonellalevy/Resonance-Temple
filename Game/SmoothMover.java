import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class allows to have velocity of this game
 * 
 * @author Leonella Levy Martel(inspired by Michael Kolling)
 * @version (13/12/2021)
 */
public abstract class SmoothMover extends Actor
{
    private Vector velocity;
    
    private double exactX;
    private double exactY;
    
    public SmoothMover()
    {
        this(new Vector());
    }
    public SmoothMover(Vector velocity)
    {
        this.velocity = velocity;
    }
    
    public void move() 
    {
        exactX = exactX + velocity.getX();
        exactY = exactY + velocity.getY();
        if (exactX >= getWorld().getWidth()) {
            exactX = 0;
        }
        if (exactX < 0) {
            exactX = getWorld().getWidth() - 1;
        }
        if (exactY >= getWorld().getHeight()) {
            exactY = 0;
        }
        if (exactY < 0) {
            exactY = getWorld().getHeight() - 1;
        }
        super.setLocation((int) exactX, (int) exactY);
    }
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) x, (int) y);
    }
    
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    public double getExactX() 
    {
        return exactX;
    }

    public double getExactY() 
    {
        return exactY;
    }

    public void addToVelocity(Vector boost) 
    {
        velocity.add(boost);
    }
 
    public void accelerate(double factor)
    {
        velocity.scale(factor);
        if (velocity.getLength() < 0.15) 
        {
            velocity.setNeutral();
        }
    }
    
    public double getSpeed()
    {
        return velocity.getLength();
    }
    
    public void invertHorizontalVelocity()
    {
        velocity.revertHorizontal();
    }
    
    public void invertVerticalVelocity()
    {
        velocity.revertVertical();
    }
    
    public Vector getVelocity() 
    {
        return velocity.copy();
    }
}
