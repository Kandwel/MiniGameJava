package person;

import behavior.CoordXY;

/**
 * Класс Колдун
 */
public class Wizard extends MagicianBase {

    private static final int HEALTH = 600;
    private static final int POWER = 40;
    private static final int AGILITY = 10;
    private static final int DEFENCE = 0;
    private static final int DISTANCE = 8;
    private static final int MANA = 100;

    /**
     * Создание экземпляра Колдуна
     *
     * @param name имя
     */
    public Wizard(String name, CoordXY pos)
    {
        super(name, 1, HEALTH, POWER, AGILITY, DEFENCE, DISTANCE, MANA, pos);
    }


    @Override
    public String toString()
    {
        return String.format("[Волшебник] %s, ❤️=%d, \uD83D\uDD25=%d, %s", name, health, mana, position.toString());
    }

    @Override
    public String getInfo() {
        return "Волшебник";
    }
}
