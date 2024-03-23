public class Main {
    public static void main(String[] args)
    {
        Robber robber = new Robber("Persi", 23);
        Peasant peasant = new Peasant("Hrist", 25);
        Sniper sniper = new Sniper("Deadshot", 35);
        Wizard wizard = new Wizard("Ange", 20);
        Pikeman pikeman = new Pikeman("Serg", 36);
        Crossbowman crossbowman = new Crossbowman("Green Arrow", 24);
        Monk monk = new Monk("Pavel", 54);

        System.out.println(robber);
        System.out.println(peasant);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(pikeman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}