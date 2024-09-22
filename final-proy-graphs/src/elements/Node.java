
package elements;

import java.awt.*;

public class Node{
    
    //Creación de variables.
    private int id;
    private Point p;
    private String name;
    private int FoS;
    private static int r = 75;

    //Constrcutor.
    public Node(Point p, String name, int fos) {
        this.p = p;
        this.name = name;
        this.FoS = fos;
    }
    
    //Métodos.
    public void DibFigura(Graphics g)//Método para crear la figura.
    {
        g.setColor(java.awt.Color.YELLOW);
        if (FoS == 1) {
            g.setColor(java.awt.Color.CYAN);
        }
        g.fillOval(this.p.x-r/2, this.p.y-r/2, r, r);
        g.setColor(java.awt.Color.BLACK);
        g.drawString(this.name, this.p.x, this.p.y);
    }
    
    public Point getPoint() {
        return this.p;
    }

    public void setPos(Point p) {
        this.p = p;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFoS(int FoS) {
        this.FoS = FoS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoS() {
        return FoS;
    }
}
