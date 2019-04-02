package Strategy;

public class VermelhoSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[41m" + " " + "\u001B[0m");
    }
}
