import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wood1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wood01 extends Actor
{
    /**
     * Act - do whatever the Wood1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public Wood01(int direction)
    {
        GreenfootImage wood1; 
        wood1 = getImage();
        
        setImage(wood1);
        speed = direction;
    }
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+speed, getY());
        if (getX()<5 || getX()>845)
        getWorld().removeObject(this);
        
    }  
    public int getSpeed()
    {
        return speed;
    }
}
