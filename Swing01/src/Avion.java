import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
//import java.awt.Polygon;

public class Avion extends Vehicle{
    private int w, h;

    public Avion(Dot dot, int speedX, int speedY, Color color){
        super(dot, speedX, speedY, color);
        w = 100;
        h = 100;
    }
    public Avion(int x, int y, int speedX, int speedY, Color color){
        super(x, y, speedX, speedY, color);
        w = 100;
        h = 100;
    }
    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillOval(getDot().getX(), getDot().getY(),w/2,h/9);
        g.setColor(Color.BLUE);
        g.fillOval(getDot().getX()+15, getDot().getY()-10,w/9,h/3);
        g.setColor(Color.WHITE);
        g.fillOval(getDot().getX()+40, getDot().getY()-7,w/10,h/6);    
    }
    
}