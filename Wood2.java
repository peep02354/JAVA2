import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wood2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wood2 extends Actor
{
    /**
     * Act - do whatever the Wood2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -1;
    public Wood2(int direction)
    {
        GreenfootImage wood2; 
        wood2 = getImage();
        
        setImage(wood2);
        speed = direction;
    }
    public void act() 
    {
        setLocation(getX()+speed, getY());
        if (getX()<5 || getX()>845)
        getWorld().removeObject(this);
    }
    public int getSpeed()
    {
        return speed;
    }
}
