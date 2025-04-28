import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Frog frog = new Frog();
        addObject(frog, 100, 200);
    }
}
