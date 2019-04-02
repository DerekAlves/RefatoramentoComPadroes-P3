package Strategy;

public class AzulSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[44m" + " " + "\u001B[0m");
    }
}
