import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
//import java.awt.Polygon;

public class Ovni extends Vehicle{
    private int w, h;

    public Ovni(Dot dot, int speedX, int speedY, Color color){
        super(dot, speedX, speedY, color);
        w = 100;
        h = 100;
    }
    public Ovni(int x, int y, int speedX, int speedY, Color color){
        super(x, y, speedX, speedY, color);
        w = 100;
        h = 100;
    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(getDot().getX()+12, getDot().getY()-8,w/4,h/7);
        g.setColor(Color.BLACK);
        g.fillOval(getDot().getX(), getDot().getY(),w/2,h/4);
        g.setColor(Color.YELLOW);
        g.fillOval(getDot().getX()+3, getDot().getY()+8,w/14,h/14);
        g.setColor(Color.WHITE);
        g.fillOval(getDot().getX()+12, getDot().getY()+12,w/14,h/14);
        g.setColor(Color.YELLOW);
        g.fillOval(getDot().getX()+21, getDot().getY()+14,w/14,h/14);
        g.setColor(Color.WHITE);
        g.fillOval(getDot().getX()+30, getDot().getY()+12,w/14,h/14);
        g.setColor(Color.YELLOW);
        g.fillOval(getDot().getX()+39, getDot().getY()+8,w/14,h/14);
        g.setColor(Color.GRAY);
        g.fillOval(getDot().getX()+17, getDot().getY()-5,w/7,h/9);        
                
        
    }
    
}