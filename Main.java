import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        /*
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
        */
        hollyTeam = teamCreator(22, 0);
        darkTeam = teamCreator(24, 3);

        System.out.println(hollyTeam);
        System.out.println();
        System.out.println(darkTeam);
    }

    public static ArrayList <Person> hollyTeam;
    public static ArrayList <Person> darkTeam;

    public static ArrayList <Person> teamCreator(int val, int num)
    {
         ArrayList<Person> team = new ArrayList<Person>();
         int teamCount = 10;
         for (int i = 0; i < teamCount; i++)
         {
             switch (new Random().nextInt(4) + num)
             {
                 case 0:
                     team.add(new Pikeman(fillName(), 0, i));
                     break;
                 case 1:
                     team.add(new Wizard(fillName(), 0, i));
                     break;
                 case 2:
                     team.add(new Crossbowman(fillName(), 0, i));
                     break;
                 case 3:
                     team.add(new Peasant(fillName(), num * 3, i));
                     break;
                 case 4:
                     team.add(new Sniper(fillName(), 9, i));
                     break;
                 case 5:
                     team.add(new Monk(fillName(), 9, i));
                     break;
                 case 6:
                     team.add(new Robber(fillName(), 9, i));
                     break;
             }
         }
         return team;
    }

    private static String fillName()
    {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

}