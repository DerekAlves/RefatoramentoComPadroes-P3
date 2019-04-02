package Strategy;

import java.util.HashMap;
import java.util.Map;

public class Str
{
    public static Map<String, ColorStrategy> strat = new HashMap<String, ColorStrategy>();


    static
    {
        strat.put("0", new BrancoSTR());
        strat.put("1", new RoxoSTR());
        strat.put("6", new VerdeSTR());
        strat.put("9", new AzulSTR());
        strat.put("10", new AmareloSTR());
        strat.put("100", new VermelhoSTR());
        strat.put("15", new VermelhoSTR());
        strat.put("2", new CianoSTR());
    }

    public ColorStrategy qCor(String option)
    {
        return strat.get(option);
    }
}
