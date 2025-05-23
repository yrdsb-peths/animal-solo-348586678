import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    public MyWorld() {
        super(600, 400, 1, false);
        
        setBackground("images/background grass.png");
        //create frog
        Frog frog = new Frog();
        addObject(frog, 300, 300);
        
        //create label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createBug();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if (score % 5 == 0)
        {
            level += 1;
        }
    }

    
    
    /**
     * Create a new apple at a random place at the top of the world
     */
    public void createBug()
    {
        Bug bug = new Bug();
        bug.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(bug, x, y);
    }
}
