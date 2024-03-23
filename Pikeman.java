// Копейщик
public class Pikeman extends Person {
    public Pikeman(String name, int x, int y)
    {
        super(name, "Копьеносец", 80, 30, 35, 30, 50,"Pike", 20, x, y);
    }

    public void attack(Person person)
    {
        person.health -= this.power;
    }
}