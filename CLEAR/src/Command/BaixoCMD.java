package Command;

import projetop1.Veiculos;

public class BaixoCMD implements Command
{
    public void move(Veiculos vehic)
    {

        vehic.setX( vehic.getX() == 28 ? vehic.getX() - 27 : vehic.getX() + 1 );//INLINE METHOD PARA SUBSTITUIR O SMELL ABAIXO

        /*if (x == 28){//SMELL
            x -= 27;
        } else {
            x +=1;
        }*/
    }
}
