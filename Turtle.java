import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = -1;
    public Turtle(int direction)
    {
        GreenfootImage barrel; 
        barrel = getImage();
        
        setImage(barrel);
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
