package Strategy;

public class RoxoSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[45m" + " " + "\u001B[0m");
    }
}
