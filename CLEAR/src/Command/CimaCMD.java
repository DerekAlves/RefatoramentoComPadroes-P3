package Command;

import projetop1.Veiculos;

public class CimaCMD implements Command
{

    public void move(Veiculos vehic)
    {
        vehic.setX( vehic.getX() == 1 ? vehic.getX() + 27 : vehic.getX() - 1 );
    }

}
