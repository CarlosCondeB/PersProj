
package Elementos;

import java.awt.Graphics;

public class Roles extends Elemento{
    
    //Creación de variables.
    private int x=0, y=0;
    private String name, value;
    private static final int r=75;

    //Constrcutor.
    public Roles(int x, int y, String name, String value) {
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
        g.setColor(java.awt.Color.CYAN);
        g.fillOval(this.x-r/2, this.y-r/2, r, r);
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
