
package elements;

import java.awt.*;
import java.awt.geom.*;

public class Arco{

    //Creación de variables.
    private Point p1, p2;
    private Point p3 = new Point(0,0);
    double rot;
    Node nodoOrigen, nodoFinal;
    private int value;

    //Constrcutor.
    public Arco(Point p1, Point p2, int value, Node nodoOrigen, Node nodoFinal) {
        this.p1 = p1;
        this.p2 = p2;
        this.value = value;
        this.nodoOrigen = nodoOrigen;
        this.nodoFinal = nodoFinal;
    }
    
    public Arco(Point p1, Point p2, int value) {
        this.p1 = p1;
        this.p2 = p2;
        this.value = value;
    }
    
    //Métodos.
    public void DibRelacion(Graphics g){//Método para crear la figura.
        Graphics2D g2d = (Graphics2D)g;
        
        angleBetween(this.p2, this.p1);
        
        Line2D line = new Line2D.Double(this.p1, this.p3);
        g2d.setColor(Color.BLACK);
        g2d.draw(line);
        
        int x = this.p1.x+(this.p2.x-this.p1.x)/2+5;
        int y = this.p1.y+(this.p2.y-this.p1.y)/2+2;
        
        g2d.drawString(Integer.toString(this.value), x, y);
        
        g2d.setColor(Color.BLACK);
        ArrowHead arrowHead = new ArrowHead();
        AffineTransform at = AffineTransform.getTranslateInstance(
                        this.p3.x - (arrowHead.getBounds2D().getWidth() / 2d), 
                        this.p3.y);
        at.rotate(this.rot-Math.toRadians(90.0), arrowHead.getBounds2D().getCenterX(), 0);
        arrowHead.transform(at);
        g2d.draw(arrowHead);
    }
    
    private void angleBetween(Point2D from, Point2D to) {
        double x = from.getX();
        double y = from.getY();

        // This is the difference between the anchor point
        // and the mouse.  Its important that this is done
        // within the local coordinate space of the component,
        // this means either the MouseMotionListener needs to
        // be registered to the component itself (preferably)
        // or the mouse coordinates need to be converted into
        // local coordinate space
        double deltaX = to.getX() - x;
        double deltaY = to.getY() - y;

        // Calculate the angle...
        // This is our "0" or start angle..
        //double rotation = -Math.atan(delta);
        this.rot = -Math.atan2(deltaX, deltaY);
        this.rot = Math.toRadians(Math.toDegrees(this.rot)+180) - Math.toRadians(90.0);
        
        x = (75/2)*Math.cos(this.rot);
        y = (75/2)*Math.sin(this.rot);
        
        this.p3.setLocation(this.p2.x+x, this.p2.y+y);
    }

    public int getValue() {
        return value;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNodoOrigen() {
        return nodoOrigen;
    }

    public Node getNodoFinal() {
        return nodoFinal;
    }
}