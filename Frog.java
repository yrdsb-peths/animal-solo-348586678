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
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    String facing = "right";
    
    /**
     * Constructor 
     */
    public Frog()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
            idleRight[i].scale(50,50);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/frog_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(50,50);
        }
        //initial frog image
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateFrog()
    {
        if (facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
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
            facing = "left";
        } else if (Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
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
