package Command;

import projetop1.Veiculos;

public class DireitaCMD implements Command
{
    public void move(Veiculos vehic)
    {

        vehic.setY( vehic.getY() == 58 ? vehic.getX() - 57 : vehic.getX() + 1 );
    }

}
