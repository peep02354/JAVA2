import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Level
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Easy()
    {
      
    }
    public void act()
    {
    if(Greenfoot.mouseClicked(this))
         {
        Greenfoot.setWorld(new City());
    }
    }    
}