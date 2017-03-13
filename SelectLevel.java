import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{

    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 568, 1); 
        prepare();
    }
    

    public void prepare(){
        Easy easy = new Easy();
        addObject(easy,416,244);
        easy.setLocation(271,133);
        Medium medium = new Medium();
        addObject(medium,276,271);
        medium.setLocation(270,269);
        Hard hard = new Hard();
        addObject(hard,278,422);
        hard.setLocation(271,422);
    }
}
