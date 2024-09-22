
package Elementos;

import java.awt.Graphics;

public class Cababilities extends Elemento{

    //Creación de variables.
    private int x=0, y=0;
    private String name, value;
    private static final int r=75;

    //Constrcutor.
    public Cababilities(int x, int y, String name, String value) {
        super();
        this.x=x;
        this.y=y;
        this.name = name;
        this.value = value;
    }
    
    //Métodos.
    @Override
    public void DibFigura(Graphics g)//Método para crear la figura.
    {   
        int [] xs = {this.x,this.x-r/2,this.x-r/4,this.x+r/4,this.x+r/2};
        int [] ys = {this.y-r/2,this.y,this.y+r/2,this.y+r/2,this.y};
        
        g.setColor(java.awt.Color.ORANGE);
        g.fillPolygon(xs, ys, 5);
        g.setColor(java.awt.Color.BLACK);
        g.drawString(this.name, this.x, this.y);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }
}
