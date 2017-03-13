import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Scorecount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorecount extends Score
{
    /**
     * Act - do whatever the Scorecount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
    public Scorecount(){
        GreenfootImage img = new GreenfootImage("0",25,Color.WHITE,Color.BLACK);
        setImage(img);
    }
    
    public void act() 
    {
        
    }    
}
