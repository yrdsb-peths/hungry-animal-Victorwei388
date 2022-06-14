import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 300, 200);
        
        
    }
    
    public void createApple()
    {
        Fries fries = new Fries();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(fries, x, y);
    }
}
