
package projetop1;

import Command.Command;
import Command.Commander;

abstract public class Veiculos {

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
    public void setX(int x) { this.x = x; }//ADICIONADO PARA O COMMAND

    public int getY() {
        return y;
    }
    public void setY(int y) { this.y = y; }//ADICIONADO PARA O COMMAND

    public int getTam() {
        return tam;
    }

    public double getVel() {
        return vel;
    }

    public String getCor() {
        return cor;
    }
    
    /*void Direcao(){
        Random random = new Random();
        this.dir=random.nextInt(4);
    }*/
    

    
     /*void move() { INTERFACE COMMAND
        if (dir == 1) {
            Cima();
        } else if (dir == 2) {
            Baixo();
        } else if (dir == 3) {
            Esquerda();
        } else if (dir == 4) {
            Direita();
        }
     }*/

    /*void Cima() { SUBSTITUÍDO POR COMMAND
        if(x == 1){ // SUBSTITUIDO POR INLINE METHOD
            x += 27;
        }
        else{
            x -= 1;
        }

    }

    void Baixo() {SUBSTITUÍDO POR COMMAND
        if (x == 28){SUBSTITUIDO POR INLINE METHOD
            x -= 27;
        } else {
            x +=1;
        }
    }

    void Esquerda() {SUBSTITUÍDO POR COMMAND
        if (y == 1){SUBSTITUIDO POR INLINE METHOD
            y += 57; 
        } else {
            y -= 1;
        }
    }

    void Direita() {SUBSTITUÍDO POR COMMAND
        if (y == 58){SUBSTITUIDO POR INLINE METHOD
            y -= 57;
        } else {
            y += 1;
        }
    }*/
}
        
    
    
  

