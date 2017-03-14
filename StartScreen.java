import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    GreenfootSound s = new GreenfootSound("music.wav");
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(980, 490, 1); 
        //prepare();
        prepare();
    }
    public void act(){
        s.play();    
    }

    public void prepare(){

        Start start = new Start();
        addObject(start,294,354);
        Instruction instruction = new Instruction();
        addObject(instruction,685,352);
    }

   
}
