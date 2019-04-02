package Command;

import projetop1.Veiculos;

public class BaixoCMD implements Command
{
    public void move(Veiculos vehic)
    {
        vehic.setX( vehic.getX() == 28 ? vehic.getX() - 27 : vehic.getX() + 1 );
    }
}
