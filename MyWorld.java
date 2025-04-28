import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Frog frog = new Frog();
        addObject(frog, 300, 200);
        
        createBug();
    }
    
    /**
     * Create a new apple at a random place at the top of the world
     */
    public void createBug()
    {
        Bug bug = new Bug();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bug, x, y);
    }
}
