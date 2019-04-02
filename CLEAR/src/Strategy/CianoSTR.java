package Strategy;

public class CianoSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[46m" + " " + "\u001B[0m");
    }
}
