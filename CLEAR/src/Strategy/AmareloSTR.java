package Strategy;

public class AmareloSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[43m" + " " + "\u001B[0m");
    }
}
