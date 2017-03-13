import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mainmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mainmenu extends Actor
{
    /**
     * Act - do whatever the Mainmenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
    public void act() 
    {
       if( Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new StartScreen());
        Greenfoot.playSound("sound.wav");
    }
    }
    
    
        
    
}
