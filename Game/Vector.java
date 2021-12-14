/**
 * Write a description of class Vector here.
 * 
 * @author Leonella Levy Martel(inspired by Michael Kolling)
 * @version (13/12/2021)
 */
public final class Vector  
{
    double dx;
    double dy;
    int direction;
    double length;
    
    /**
     * Create a new, neutral vector.
     */
    public Vector()
    {
    }

    public Vector(int direction, double length)
    {
        this.length = length;
        this.direction = direction;
        updateCartesian();
    }

    public Vector(double dx, double dy)
    {
        this.dx = dx;
        this.dy = dy;
        updatePolar();
    }

    public void setDirection(int direction) 
    {
        this.direction = direction;
        updateCartesian();
    }
    
    public void add(Vector other) 
    {
        dx += other.dx;
        dy += other.dy;
        updatePolar();
    }

    public void setLength(double length) 
    {
        this.length = length;
        updateCartesian();
    }

    public void scale(double factor) 
    {
        length = length * factor;
        updateCartesian();
    }
    
    public void setNeutral() 
    {
        dx = 0.0;
        dy = 0.0;
        length = 0.0;
        direction = 0;
    }

    public void revertHorizontal() 
    {
        dx = -dx;
        updatePolar();
    }

    public void revertVertical() 
    {
        dy = -dy;
        updatePolar();
    }

    public double getX() 
    {
        return dx;
    }

    public double getY() 
    {
        return  dy;
    }

    public int getDirection() 
    {
        return direction;
    }

    public double getLength() 
    {
        return length;
    }

    private void updatePolar() 
    {
        this.direction = (int) Math.toDegrees(Math.atan2(dy, dx));
        this.length = Math.sqrt(dx*dx+dy*dy);
    }   
    
    private void updateCartesian() 
    {
        dx = length * Math.cos(Math.toRadians(direction));
        dy = length * Math.sin(Math.toRadians(direction));   
    }
    
    public Vector copy()
    {
        Vector copy = new Vector();
        copy.dx = dx;
        copy.dy = dy;
        copy.direction = direction;
        copy.length = length;
        return copy;
    }
}
