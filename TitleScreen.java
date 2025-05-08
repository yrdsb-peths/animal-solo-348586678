import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen.
 * 
 * @author (Kian) 
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Frog", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);   
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Frog frog = new Frog();
        addObject(frog,485,112);
        Label label = new Label ("Use \u2190 and \u2192 to move", 40);
        addObject(label, 220, 257);
        label.setLocation(297, 243);
        label.setLocation(305,240);
        Label label2 = new Label("Press <space> to start", 40);
        addObject(label2, 249,331);
        label2.setLocation(278,261);
    }
}
