package Strategy;

public class VerdeSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[42m" + " " + "\u001B[0m");
    }
}
