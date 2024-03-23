// Абстрактный класс персонажа
public abstract class Person
{
    protected String name;              // имя
    protected int health;               // здоровье
    protected int power;                // сила
    protected int age;                  // возраст
    protected int armor;                // броня
    protected int endurance;            // выносливость
    protected String weapon;               // оружие
    protected int gold;                 // золото

    public Person(String name, int health, int power, int age, int armor, int endurance, String weapon, int gold)
    {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
    }

    @Override
    public String toString()
    {
        return name;
    }
}