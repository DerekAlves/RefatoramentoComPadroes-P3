package Command;

import projetop1.Veiculos;

import java.util.HashMap;
import java.util.Map;

public class Commander
{
    public static Map<String, Command> commander = new HashMap<String, Command>();

    static
    {
        commander.put("1", new CimaCMD());
        commander.put("2", new BaixoCMD());
        commander.put("3", new EsquerdaCMD());
        commander.put("4", new DireitaCMD());
    }

    public Command command(String cmd)
    {
       return commander.get(cmd);
    }

}
