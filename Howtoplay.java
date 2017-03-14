import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howtoplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howtoplay extends World
{

    /**
     * Constructor for objects of class Howtoplay.
     * 
     */
    public Howtoplay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 868, 1); 
        prepare();
    }
    
    public void prepare(){
        Mainmenu mainmenu = new Mainmenu();
        addObject(mainmenu,72,45);
    }
}
