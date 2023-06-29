    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Heroes hero1Team1 = new Magician();
        Heroes hero2Team1 = new Sniper();
        Heroes hero3Team1 = new Robber();
        Heroes hero4Team1 = new Peasant();

        Heroes hero1Team2 = new Monk();
        Heroes hero2Team2 = new Crossbowman();
        Heroes hero3Team2 = new Spearman();
        Heroes hero4Team2 = new Peasant();

        System.out.println("team 1------");

        System.out.println(hero1Team1.getInfo());
        System.out.println(hero2Team1.getInfo());
        System.out.println(hero3Team1.getInfo());
        System.out.println(hero4Team1.getInfo());

        System.out.println("team 2------");

        System.out.println(hero1Team2.getInfo());
        System.out.println(hero2Team2.getInfo());
        System.out.println(hero3Team2.getInfo());
        System.out.println(hero4Team2.getInfo());

        System.out.println("Бой пехоты------");

        while (hero2Team1.hp != 0 && hero2Team2.hp != 0) {
            hero2Team1.Attack(hero2Team2);
            hero2Team2.Attack(hero2Team1);

            hero1Team1.healed(hero2Team1);
            hero1Team2.healed(hero2Team2);
        }
        System.out.println("------");

        if (hero2Team1.hp != 0) {
            System.out.println("WINNER TEAM 1: " + hero2Team1.getInfo());
        } else {
            System.out.println("WINNER TEAM 2: " + hero2Team2.getInfo());
        }

        System.out.println("Бой стрелков------");

        while (hero3Team1.hp != 0 && hero3Team2.hp != 0) {
            hero3Team1.Attack(hero3Team2);
            hero3Team2.Attack(hero3Team1);

            hero1Team1.healed(hero3Team1);
            hero1Team2.healed(hero3Team2);
        }
        System.out.println("------");

        if (hero3Team1.hp != 0) {
            System.out.println("WINNER TEAM 1: " + hero3Team1.getInfo());
        } else {
            System.out.println("WINNER TEAM 2: " + hero3Team2.getInfo());
        }
    }
}
