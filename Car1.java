import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1 extends enemy
{
    /**
     * Act - do whatever the Car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;
    public Car1(int direction)
    {
        speed = direction;
    }
    public void act() 
    {
        // Add your action code here.
        setLocation (getX() + speed, getY());
        if (atWorldEdge() == true)
        {
            removeMe();
        }
    }
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    private void removeMe()
    {
        World w = getWorld();
        w.removeObject(this);
    }
}
