import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The frog, our hero or main character.
 * 
 * @author (Kian) 
 * @version April 28th
*/
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        } else if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        // remove the bug if the frog eats it
        removeTouching(Bug.class);
    }
}
