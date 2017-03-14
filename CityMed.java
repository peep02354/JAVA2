import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CityMed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityMed extends World
{

   private Frog myFrog;
    private int counter;
    
    Score score = new Score();
    Time time = new Time();
    public CityMed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 868, 1);
        addObject(new Time(), 795, 837);    
        prepare();
        setPaintOrder(Frog.class);
    }
    

    public void prepare(){

        Frog frog = new Frog();
        addObject(frog,451,774);
        frog.setLocation(434,778);
        Lotus lotus = new Lotus();
        addObject(lotus,774,69);
        lotus.setLocation(769,69);
        Lotus lotus2 = new Lotus();
        addObject(lotus2,603,75);
        lotus2.setLocation(598,72);
        Lotus lotus3 = new Lotus();
        addObject(lotus3,428,72);
        Lotus lotus4 = new Lotus();
        addObject(lotus4,252,66);
        lotus4.setLocation(252,72);
        Lotus lotus5 = new Lotus();
        addObject(lotus5,80,76);
        Score score = new Score();
        addObject(score,30,850);
        score.setLocation(28,836);
        score.setLocation(28,828);
        score.setLocation(55,836);
        Restart restart = new Restart();
        addObject(restart,298,844);
        Mainmenu mainmenu = new Mainmenu();
        addObject(mainmenu,522,846);
        restart.setLocation(306,835);
        mainmenu.setLocation(519,837);
        restart.setLocation(316,834);
        mainmenu.setLocation(516,835);
    }


    public void act(){
        counter++;
        placeWood01(4, 240, 20, 200);
        placeCar1(-2, 90, 812, 723);
        placeCar2(-3, 150, 818, 608);
        placeCar3(-3, 90, 818, 608);
        placeCar4(3, 90, 33, 550);
        placeCar5(2, 200, 33, 664);
        placeCar6(5, 100, 33, 491);
        placeTurtle(-2, 250, 827, 382);
        placeWood2(5, 300, 74, 323);
        placeTurtle(-2, 240, 827, 259);
        placeTurtle(-5, 250, 827, 132);
    }
    public void placeWood01(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Wood01(constructor), x, y);

        }
    }
    public void placeWood2(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Wood2(constructor), x, y);

        }
    }
    public void placeCar1(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Car1(constructor), x, y);

        }
    }
    public void placeCar2(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Car2(constructor), x, y);

        }
    }
    public void placeCar3(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Car3(constructor), x, y);

        }
    }
    public void placeCar4(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Car4(constructor), x, y);

        }
    }
    public void placeCar5(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Car5(constructor), x, y);

        }
    }
    public void placeCar6(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Car6(constructor), x, y);

        }
    }
    public void placeTurtle(int constructor, int delay, int x, int y)
    {
        if (counter%delay==0)
        {    
            addObject (new Turtle(constructor), x, y);

        }
    }
}
