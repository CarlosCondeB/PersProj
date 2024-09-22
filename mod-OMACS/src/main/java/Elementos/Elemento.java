
package Elementos;

import java.awt.Graphics;

public abstract class Elemento {
    
    public Elemento(){
    }
    
    public abstract void DibFigura(Graphics g);
    public abstract void setX(int x);
    public abstract void setY(int y);
    public abstract int getX();
    public abstract int getY();
    public abstract String getName();
    public abstract String getValue();
    public abstract void setValue(String value);

}
