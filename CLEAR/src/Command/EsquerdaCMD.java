package Command;

import projetop1.Veiculos;

public class EsquerdaCMD implements Command
{
    public void move(Veiculos vehic)
    {
        vehic.setY( vehic.getY() == 1 ? vehic.getY() + 57 : vehic.getY() - 1 );
    }
}
