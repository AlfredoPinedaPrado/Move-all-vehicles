import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;


public class MyCanvas extends JPanel implements KeyListener,ActionListener{
    Point pSun = new Point(Config.WINDOW_W/2, Config.WINDOW_H/2);  
    Dot pDot = new Dot(Config.WINDOW_W/2, Config.WINDOW_H/2);  
        ArrayList<Boat> bote = new ArrayList<Boat>();
        ArrayList<Car> cars = new ArrayList<Car>();
        ArrayList<Avion> avion = new ArrayList<Avion>();
        ArrayList<Ovni> ovni = new ArrayList<Ovni>();


    public MyCanvas () {
        setPreferredSize(new Dimension(Config.WINDOW_W,Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(60, this);
        timer.start();
        bote.add(new Boat(0,155,01,00,Config.COLOR_BOTE));
        bote.add(new Boat(355,160,-1,0,Config.COLOR_BROWN));
        bote.add(new Boat(355,175,-3,0,Config.COLOR_BARCO3));
        cars.add(new Car (355, 227,-2, 0, Config.COLOR_CARRO2));
        cars.add(new Car (80, 247, 1, 0, Config.COLOR_CARRO1));
        cars.add(new Car (-50, 247, 1, 0, Config.COLOR_CARRO3));
        ovni.add(new Ovni(10,200,2,-1,Config.COLOR_BG));
        ovni.add(new Ovni(0,10,5,0,Config.COLOR_BG));
        ovni.add(new Ovni(10,20,5,2,Config.COLOR_BG));
        avion.add(new Avion(370,20,-4,1,Config.COLOR_MAR));
        avion.add(new Avion(370,60,-4,0,Config.COLOR_AVION3));
        avion.add(new Avion(370,100,-4,-1,Config.COLOR_AVION2));

    }
    @Override //Siempre va existir este metodo 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Paintbrush paintBrush = new Paintbrush(g);
        
        paintBrush.drawSky();
        
        paintBrush.drawMountains(15,120,100,40,180,120);
        paintBrush.drawMountains(180,120,250,40,350,120);
        paintBrush.drawMountains(100,120,175,40,250,100);
//        paintBrush.drawMountains(200,175,350,50,400,175);
        paintBrush.drawTree(200,50);
        paintBrush.drawTree(100,20);
        paintBrush.drawTree(300,40);
    //    paintBrush.drawTree(50,110);
    //    paintBrush.drawTree(360,100);
    //    paintBrush.drawTree(140,75); 

     // paintBrush.drawSun(pSun);
        
        //Tarea
    /*    paintBrush.drawBoat(190,180,190,200,210,190);
        paintBrush.drawBoat(217,235, 217, 280, 240, 235);
        paintBrush.drawBoat(167,235,167,280,140,235);*/
        paintBrush.drawMar();
        paintBrush.drawCarretera();
        for(Boat c : bote){
            c.move();
            c.draw(g);
        }
        for(Car c : cars){
            c.move();
            c.draw(g);
        }
        for(Avion c : avion){
            c.move();
            c.draw(g);
        }
        for(Ovni c : ovni){
            c.move();
            c.draw(g);
        }
    }

    @Override 
    public void keyPressed(KeyEvent event){

        int key = event.getKeyCode(); 
        if(key == KeyEvent.VK_RIGHT){
            pDot.setX(pDot.getX()+5);
        }

        if(key == KeyEvent.VK_LEFT){
            pDot.setX(pDot.getX()-5);
        }

    }
  
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}