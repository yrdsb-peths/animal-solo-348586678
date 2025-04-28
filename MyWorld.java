import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Frog frog = new Frog();
        addObject(frog, 300, 200);
        
        Bug bug = new Bug();
        addObject(bug, 300, 0);
    }
}
