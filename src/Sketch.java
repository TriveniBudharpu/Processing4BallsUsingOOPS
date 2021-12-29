import processing.core.PApplet;
import java.util.ArrayList;

public class Sketch extends PApplet{
    public static final int width=640;
    public static final int height=400;
    public ArrayList<Ball> listOfBalls=new ArrayList<Ball>(4);
    public void settings()
    {
        super.settings();
        size(width,height);
    }
    public void setup()
    {
        listOfBalls.add(new Ball(this,0,height/5,1,10));
        listOfBalls.add(new Ball(this,0,(2*height)/5,2,10));
        listOfBalls.add(new Ball(this,0,(3*height)/5,3,10));
        listOfBalls.add(new Ball(this,0,(4*height)/5,4,10));

    }
   public void draw()
    {
        for (Ball ball:listOfBalls) {
            ball.drawBall();
        }
    }
}
