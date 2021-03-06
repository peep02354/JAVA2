import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car4 extends enemy
{
    /**
     * Act - do whatever the Car4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed;
    public Car4(int direction)
    {
        speed = direction;
    }
    public void act() 
    {
       setLocation (getX() + speed, getY());
        if (atWorldEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10)
            return true;
        if(getY() < 10 || getY() > getWorld().getHeight() - 10)
            return true;
        else
            return false;
    }

}
