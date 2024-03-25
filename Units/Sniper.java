package Units;
// Снайпер
public class Sniper extends Person {

    private int arrowsNum;
    boolean inGame = true;

    public Sniper(String name, int x, int y)
    {
        super(name, "Снайпер", 60, 40, 40, 20, 40, "gun",40, x, y);
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