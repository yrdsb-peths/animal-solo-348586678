import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * The frog, our hero or main character.
 * 
 * @author (Kian) 
 * @version April 28th
*/
public class Frog extends Actor
{
    public void myFrog()
    {
        setImage("frog.png");
    }
    
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[5];
    
    /**
     * Constructor 
     */
    public Frog()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateFrog()
    {
        setImage(idle[imageIndex]);
        imageIndex = imageIndex + 1 % idle.length;
    }
    
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        myFrog();
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        } else if (Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        // remove the bug if the frog eats it
        eat();
        animateFrog();
    }
    
    
    
    public void eat()
    {
        if(isTouching(Bug.class)){
            removeTouching(Bug.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBug();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
