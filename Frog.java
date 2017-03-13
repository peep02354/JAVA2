import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    
    int score;
    int cnt = 5;
    int time = 120;
    public Frog() {
        getImage().scale(40, 40);
        
        score=0;
    }
    public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
            setLocation (getX() + 2, getY());
        else if (Greenfoot.isKeyDown("up"))
            setLocation (getX(), getY() - 3);
        else if (Greenfoot.isKeyDown("down"))
            setLocation (getX(), getY() + 3);
        else if (Greenfoot.isKeyDown("left"))
            setLocation (getX() - 2, getY());
        if (onWood01()==true)
            moveOnWood();
        if (onWood2()==true)
            moveOnWood2();    
        if (onTurtle()==true)
            moveOnTurtle();
        getWorld().showText("Score : "+score,55,836);
        getWorld().showText("time : "+time,795,836);
        Timer();
        death();
        survive();
    }
    
    public boolean onTurtle()
    {
        if (getIntersectingObjects(Turtle.class).size()>0)
            return true;
        else
            return false;
    }
    public void moveOnWood()
    {
        Wood01 wddd1 = (Wood01)getIntersectingObjects(Wood01.class).get(0);
        setLocation(getX()+wddd1.getSpeed(), getY());
    }
    public void moveOnWood2()
    {
        Wood2 wddd2 = (Wood2)getIntersectingObjects(Wood2.class).get(0);
        setLocation(getX()+wddd2.getSpeed(), getY());
    }
    public void moveOnTurtle()
    {
        Turtle trtl = (Turtle)getIntersectingObjects(Turtle.class).get(0);
        setLocation(getX()+trtl.getSpeed(), getY());
    }

    public boolean onWood01()
    {
        if (getIntersectingObjects(Wood01.class).size()>0)
            return true;
        else
            return false;
    }
    public boolean onWood2()
    {
        if (getIntersectingObjects(Wood2.class).size()>0)
            return true;
        else
            return false;
    }
    public void death()
    {
        if(isTouching(enemy.class)){
        setLocation(434,778);
    }
    if (getY() <= 382 && getY() >= 72 && onWood01() == false && onTurtle() == false &&  onWood2() == false)
        {
            
            setLocation(434,778);
            
        }
    }
    public void survive()
    {
        if(isTouching(Lotus.class)){
           score++;
        setLocation(434,778);
        
    }
}
    public void Timer(){
        if (cnt%time==0) {
            time--;
            
        }
        if (time==0){
            Greenfoot.setWorld(new End());
        }
            
        else cnt++;
    }
}
