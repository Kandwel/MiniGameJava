package Units;
// Крестьянин
public class Peasant extends Person {

    private int arrowsNum;
    boolean inGame = true;

    public Peasant (String name, int x, int y)
    {
        super(name, "Крестьянин", 20, 1, 24, 0, 20, "nothing", 20, x, y);
    }

    public void giveArrows(int val)
    {
        this.arrowsNum -= val;
        if (!isInGame())
        {
            inGame = false;
        }
    }

    public boolean isInGame()
    {
        return this.arrowsNum == 0 ? false : true;
    }


}