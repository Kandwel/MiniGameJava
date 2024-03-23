// Монах
public class Monk extends Person {

    private int mana;
    private int healVal;
    private int healPrice;

    public Monk(String name, int x, int y)
    {
        super(name, "Монах", 60, 40, 45, 20, 30, "gun", 40, x, y);
        this.mana = 15;
        this.healPrice = 1;
    }

    public void heal(Person person)
    {
        person.health += this.healVal;
        this.mana -= price("heal");
    }

    public void heal()
    {
        super.health += this.healVal;
        this.mana -= price("heal");
    }

    private  int price(String action)
    {
        if (action == "heal")
        {
            return healPrice;
        }
        return 0;
    }
}