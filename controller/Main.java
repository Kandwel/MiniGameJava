package controller;/*
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
Создать абстрактный класс и иерархию наследников.
Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле.
Крестьянин = 0, маги=1, пехота=2, лучники=3.
В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой
из обеих комманд а с наименьшей в конце.
*/

import behavior.CoordXY;
import person.*;
import view.View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<PersonBase> greenPersons = new ArrayList<>();
    public static ArrayList<PersonBase> bluePersons = new ArrayList<>();
    public static ArrayList<PersonBase> allPersons = new ArrayList<>();

    public static void main(String[] args) {
        createTeam(greenPersons, 10, 0);
        createTeam(bluePersons, 10, 3);
        allPersons.addAll(bluePersons);
        allPersons.addAll(greenPersons);
//        all.sort(new PrioritySort());
        allPersons.sort((o1, o2) -> Integer.compare(o2.priority, o1.priority));

//        for (int i = 0; i < 30; i++) {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            View.view();
            for (PersonBase p : allPersons) {
//                System.out.print(p + " ходит. ");
                if (greenPersons.contains(p)) {
                    p.step(bluePersons, greenPersons);

                } else {
                    p.step(greenPersons, bluePersons);
                }
//                System.out.println();
            }
            in.nextLine();
            if (!isLiving(greenPersons))
            {
                System.out.println("Blue team wins!");
                break;
            }
            if (!isLiving(bluePersons))
            {
                System.out.println("Green wins!");
                break;
            }

        }

    }

    private static boolean isLiving(ArrayList<PersonBase> team)
    {
        for (PersonBase personBase : team) {
            if (personBase.getHealth() > 0)
                return true;
        }
        return false;
    }

    public static void createTeam(ArrayList<PersonBase> team, int num, int start)
    {
        Random rnd = new Random();
        int cy = 0;
        while (num-- > 0)
        {
            int n = start + rnd.nextInt(4);
            switch (n)
            {
                case 0:
                    team.add(new Crossbowman(fillName(), new CoordXY(9, cy)));
                    break;
                case 1:
                    team.add(new Spearman(fillName(), new CoordXY(9, cy)));
                    break;
                case 2:
                    team.add(new Wizard(fillName(), new CoordXY(9, cy)));
                    break;
                case 3:
                    team.add(new Peasant(fillName(), new CoordXY((3-start)*3, cy)));
                    break;
                case 4:
                    team.add(new Sniper(fillName(), new CoordXY(0, cy)));
                    break;
                case 5:
                    team.add(new Monk(fillName(), new CoordXY(0, cy)));
                    break;
                case 6:
                    team.add(new Robber(fillName(), new CoordXY(0, cy)));
                    break;
                default:
                    System.out.println("ERROR! Пересмотри алгоритм, ламер!");
            }
            cy++;
        }
    }

    private static String fillName()
    {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

}
/*
import java.util.ArrayList;
import java.util.Random;
import person.*;

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

        hollyTeam = teamCreator(22, 0);
        darkTeam = teamCreator(24, 3);

        System.out.println(hollyTeam);
        System.out.println();
        System.out.println(darkTeam);
    }

    public static ArrayList <PersonBase> hollyTeam;
    public static ArrayList <PersonBase> darkTeam;

    public static ArrayList <PersonBase> teamCreator(int val, int num)
    {
         ArrayList<PersonBase> team = new ArrayList<PersonBase>();
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



}
*/