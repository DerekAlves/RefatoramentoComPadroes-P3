
package projetop1;

import Command.Command;
import Command.Commander;

public class Veiculos {

    private  int x;
    private  int y;
    private  int tam;
    public Command cmd;
    private  double vel;
    private  String cor;

    public Veiculos(int x, int y, int tam, double vel, int dir, String cor)
    {
        Commander comma = new Commander();
        Command cm = comma.command(Integer.toString(dir));

        this.x = x;
        this.y = y;
        this.cor = cor;
        this.tam = tam;
        this.vel = vel;
        this.cmd = cm;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) { this.x = x; }

    public int getY() {
        return y;
    }
    public void setY(int y) { this.y = y; }

    public int getTam() {
        return tam;
    }

    public double getVel() {
        return vel;
    }

    public String getCor() {
        return cor;
    }
}
        
    
    
  

