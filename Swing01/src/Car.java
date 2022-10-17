import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
//import java.awt.Polygon;

public class Car extends Vehicle{
    private int w, h;

    public Car(Dot dot, int speedX, int speedY, Color color){
        super(dot, speedX, speedY, color);
        w = 90;
        h = 35;
    }
    public Car(int x, int y, int speedX, int speedY, Color color){
        super(x, y, speedX, speedY, color);
        w = 90;
        h = 35;
    }
    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        g.setColor(Color.WHITE);
        double x1 = w, x2 = w;
        double y = h;
        x1 *= 0.1; x2 *= 0.7;
        y *= 0.8;
        g.fillOval(getDot().getX() + (int)x1, getDot().getY() + (int)y, h/2, h/2);
        g.fillOval(getDot().getX() + (int)x2, getDot().getY() + (int)y, h/2, h/2);
        g.setColor(Color.GRAY);
        g.fillOval(getDot().getX() + (int)x1+3, getDot().getY() + (int)y+4, h/3, h/3);
        g.fillOval(getDot().getX() + (int)x2+3, getDot().getY() + (int)y+4, h/3, h/3);
    
        
        Polygon trianguloCarro1 = new Polygon();
        Polygon trianguloCarro2 = new Polygon();
        
        trianguloCarro1.addPoint (getDot().getX()+12, getDot().getY());
        trianguloCarro1.addPoint(getDot().getX() +32, getDot().getY()-24);
        trianguloCarro1.addPoint(getDot().getX()+32, getDot().getY());
        g.setColor(this.getColor());
        g.fillPolygon(trianguloCarro1);
        
        trianguloCarro2.addPoint (getDot().getX() +78, getDot().getY());
        trianguloCarro2.addPoint(getDot().getX() +58, getDot().getY()-24);
        trianguloCarro2.addPoint(getDot().getX() +58, getDot().getY());
        g.setColor(this.getColor());
        g.fillPolygon(trianguloCarro2);
        
        g.setColor(this.getColor());
        g.fillRect(getDot().getX()+32, getDot().getY()-23, w/4+4, h/2+14);
    }
    
}