import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends enemy
{
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = -3;

    public Car2(int direction)
    {
        GreenfootImage carWhite;
        carWhite = getImage();
        carWhite.mirrorHorizontally();
        speed = direction;
    }
    public void act() 
    {
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
