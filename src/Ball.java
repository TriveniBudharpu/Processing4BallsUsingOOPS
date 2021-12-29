import processing.core.PApplet;

public class Ball {
    private PApplet sketch;
    private int x;
    private  int y;
    private int radius;
    private int speed;
    public Ball(PApplet sketch,int x,int y,int speed,int radius)
    {
        this.x=x;
        this.y=y;
        this.sketch=sketch;
        this.speed=speed;
        this.radius=radius;
    }
    public void incrementX()
    {
        this.x=this.x+speed;
    }
    public void drawBall()
    {
        sketch.ellipse(x,y,radius,radius);
        incrementX();
    }
}
