package Units;
// Разбойник
public class Robber  extends Person {
    public Robber (String name, int x, int y)
    {
        super(name, "Разбойник", 100, 10, 23, 20, 40, "knife", 50, x, y);
    }

    public void attack(Person person)
    {
        person.health -= this.power;
    }

    public void stealGold(int val)
    {
        this.gold += val;
    }


}