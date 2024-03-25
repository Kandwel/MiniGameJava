package Units;

// Арбалетчик
public class Crossbowman extends Person {

    private int arrowsNum;
    boolean inGame = true;

    public Crossbowman(String name, int x, int y)
    {
        super(name, "Арболетчик", 60, 40, 30, 20, 30, "Crossbow", 40, x, y);
    }

    public void attack(Person person)
    {
        person.health -= this.power;
    }

    public boolean isInGame()
    {
        return this.arrowsNum == 0 ? false : true;
    }
}