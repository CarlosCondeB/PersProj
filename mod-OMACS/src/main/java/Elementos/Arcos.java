
package Elementos;

import java.awt.*;

public class Arcos{

    //Creación de variables.
    private int x1, y1, x2, y2, n;
    private String value;

    //Constrcutor.
    public Arcos(int n, int x1, int y1, int x2, int y2, String value) {
        this.n = n;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.value = value;
    }
    
    //Métodos.
    public void DibRelacion(Graphics g){//Método para crear la figura.
        Graphics2D g2d = (Graphics2D)g;
        
        //Medida del dash.
        float guiones [] = {10,7};
        float singuiones [] = {100,0};
        
        //Tipo de relación.
        switch (n) {
            case 1:
                g2d.setStroke(new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,singuiones,1));
                g2d.setColor(Color.BLACK);
                g2d.drawLine(this.x1, this.y1, this.x2, this.y2);
                g.drawString(this.value, this.x1+(this.x2-this.x1)/2+5, this.y1+(this.y2-this.y1)/2+2);
                break;
            case 2:
                g2d.setStroke(new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,guiones,1));
                g2d.setColor(Color.BLACK);
                g2d.drawLine(this.x1, this.y1, this.x2, this.y2);
                break;
            default:
                g2d.setStroke(new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,0,singuiones,1));
                g2d.setColor(Color.BLACK);
                g2d.drawLine(this.x1, this.y1, this.x2, this.y2);
                break;
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getN() {
        return n;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}