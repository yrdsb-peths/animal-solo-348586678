import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the bug, the enemy of our frog .
 * 
 * @author (Kian) 
 * @version (April 28th)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x  = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        //remove bug and deaw game over when apple hits the bottom
        MyWorld world = (MyWorld getWorld();
        if(getY() <= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        
    }
}
