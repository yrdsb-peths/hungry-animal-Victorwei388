import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author Victor 
 * @version June
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
    }
    
    public void eat()
    {
        if(isTouching(Fries.class))
        {
            removeTouching(Fries.class);
            // MyWorld world = (MyWorld) getWorld();
            // world.createFries();
            // world.increaseScore();
        }
    }
}
