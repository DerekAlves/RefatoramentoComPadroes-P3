package Strategy;

public class BrancoSTR implements ColorStrategy
{
    public void print()
    {
        System.out.print("\u001B[47m" + " " + "\u001B[0m");
    }

}
