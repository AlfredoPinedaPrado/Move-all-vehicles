import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Boat extends Vehicle{
    private int w, h;

    public Boat(Dot dot, int speedX, int speedY, Color color){
        super(dot, speedX, speedY, color);
        w = 120;
        h = 150;
    }
    public Boat(int x, int y, int speedX, int speedY, Color color){
        super(x, y, speedX, speedY, color);
        w = 120;
        h = 135;
    }
    public void draw(Graphics g){
        Polygon triangle = new Polygon();
        Polygon triangulo = new Polygon();
        Polygon triangulodos = new Polygon();

        g.setColor(Color.BLACK);
        g.fillRect(getDot().getX() +35, getDot().getY() -50,w/19, h/2);
        g.setColor(this.getColor());
        g.fillRect(getDot().getX()+5 , getDot().getY() +10,w/2, h/3);
    
        
        triangle.addPoint (getDot().getX() +65, getDot().getY()-40);
        triangle.addPoint(getDot().getX() +40, getDot().getY()-30);
        triangle.addPoint(getDot().getX() +40, getDot().getY()-50);
        g.setColor(Color.WHITE);
        g.fillPolygon(triangle);
        
        triangulo.addPoint(getDot().getX()+85, getDot().getY()+10);
        triangulo.addPoint(getDot().getX()+65, getDot().getY()+55);
        triangulo.addPoint(getDot().getX()+65, getDot().getY()+10);
        g.setColor(this.getColor());
        g.fillPolygon(triangulo);
        
        triangulodos.addPoint(getDot().getX()-15, getDot().getY()+10);
        triangulodos.addPoint(getDot().getX()+5, getDot().getY()+55);
        triangulodos.addPoint(getDot().getX()+5, getDot().getY()+10);
        g.setColor(this.getColor());
        g.fillPolygon(triangulodos);
    
        g.setColor(Color.BLACK);
        g.fillOval(getDot().getX() + 10, getDot().getY()+20 ,h/10, h/11);
        g.fillOval(getDot().getX() + 50, getDot().getY()+20,h/10, h/11);
    
        g.setColor(Color.WHITE);
        g.fillOval(getDot().getX() + 11, getDot().getY()+21 ,h/15, h/16);
        g.fillOval(getDot().getX() + 51, getDot().getY()+21,h/15, h/16);
    }
    
}   
