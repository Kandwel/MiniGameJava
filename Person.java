// Абстрактный класс персонажа
public abstract class Person
{
    protected String name;              // имя
    protected String className;         // имя класса
    protected int health;               // здоровье
    protected int power;                // сила
    protected int age;                  // возраст
    protected int armor;                // броня
    protected int endurance;            // выносливость
    protected String weapon;            // оружие
    protected int gold;                 // золото
    protected Position position;        // позиция

    public Person(String name, String className, int health, int power, int age, int armor, int endurance, String weapon, int gold, int x, int y)
    {
        this.name = name;
        this.className = className;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        this.position = new Position(x, y);
    }

    @Override
    public String toString()
    {
        return "\n[" + className + " --> " + name + " (age: " + age + ")" + " Position(x: " + position.x + ", y: " + position.y + ")];";
    }
}