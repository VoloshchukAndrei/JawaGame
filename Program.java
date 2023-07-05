    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Heroes hero1Team1 = new Magician(Names.Magician.getName(), 0, 1);
        Heroes hero2Team1 = new Sniper(Names.Sniper.getName(), 0, 3);
        Heroes hero3Team1 = new Robber(Names.Robber.getName(), 0, 5);
        Heroes hero4Team1 = new Peasant(Names.Peasant.getName(), 0, 7);

        Heroes hero1Team2 = new Monk(Names.Monk.getName(), 0, 2);
        Heroes hero2Team2 = new Crossbowman(Names.Crossbowman.getName(), 0, 4);
        Heroes hero3Team2 = new Spearman(Names.Spearman.getName(), 0, 6);
        Heroes hero4Team2 = new Peasant(Names.Peasant.getName(), 0, 7);

        System.out.println("team 1------");

        System.out.println(hero1Team1.getInformation());
        System.out.println(hero2Team1.getInformation());
        System.out.println(hero3Team1.getInformation());
        System.out.println(hero4Team1.getInformation());
        System.out.println();

        System.out.println("team 2------");

        System.out.println(hero1Team2.getInformation());
        System.out.println(hero2Team2.getInformation());
        System.out.println(hero3Team2.getInformation());
        System.out.println(hero4Team2.getInformation());
        System.out.println();

        System.out.println("Бой пехоты------");

        while (hero2Team1.hp != 0 && hero2Team2.hp != 0) {
            hero2Team1.Attack(hero2Team2);
            hero2Team2.Attack(hero2Team1);

            hero1Team1.healed(hero2Team1);
            hero1Team2.healed(hero2Team2);
        }

        if (hero2Team1.hp != 0) {
            System.out.println("WINNER TEAM 1: " + hero2Team1.getInformation());
        } else {
            System.out.println("WINNER TEAM 2: " + hero2Team2.getInformation());
        }
        System.out.println();

        System.out.println("Бой стрелков------");

        while (hero3Team1.hp != 0 && hero3Team2.hp != 0) {
            hero3Team1.Attack(hero3Team2);
            hero3Team2.Attack(hero3Team1);

            hero1Team1.healed(hero3Team1);
            hero1Team2.healed(hero3Team2);
        }

        if (hero3Team1.hp != 0) {
            System.out.println("WINNER TEAM 1: " + hero3Team1.getInformation());
        } else {
            System.out.println("WINNER TEAM 2: " + hero3Team2.getInformation());
        }

        // Расстановка на карте.Location on the map (Случайные герои)
        ArrayList<Heroes> list = new ArrayList<>();
        list.add(new Magician(Names.Magician.getName(), 0, 1));
        list.add(new Monk(Names.Monk.getName(), 0, 2));
        list.add(new Sniper(Names.Sniper.getName(), 0, 3));
        list.add(new Crossbowman(Names.Crossbowman.getName(), 0, 4));
        list.add(new Robber(Names.Robber.getName(), 0, 5));
        list.add(new Spearman(Names.Spearman.getName(), 0, 6));
        list.add(new Peasant(Names.Peasant.getName(), 0, 7));
        // list.forEach(n-> System.out.println(n.getInfo()));

        System.out.println();
        System.out.println("team1:");
        int teamCount = 4;
        Random rand = new Random();
        ArrayList<Heroes> team1 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team1.add(new Magician(Names.Magician.getName(), 0, val + 1));
                    break;
                case 1:
                    team1.add(new Sniper(Names.Sniper.getName(), 0, val + 1));
                    break;
                case 2:
                    team1.add(new Robber(Names.Robber.getName(), 0, val + 1));
                    break;
                case 3:
                    team1.add(new Peasant(Names.Peasant.getName(), 0, val + 1));
            }
            System.out.println(team1.get(i).getInfo());
        }
        System.out.println();
        System.out.println("team2:");
        ArrayList<Heroes> team2 = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team2.add(new Monk(Names.Monk.getName(), 5, val + 1));
                    break;
                case 1:
                    team2.add(new Crossbowman(Names.Crossbowman.getName(), 5, val + 1));
                    break;
                case 2:
                    team2.add(new Spearman(Names.Spearman.getName(), 5, val + 1));
                    break;
                case 3:
                    team2.add(new Peasant(Names.Peasant.getName(), 5, val + 1));
            }
            System.out.println(team2.get(i).getInfo());
        }
        System.out.println();
        System.out.println("Ближайший противник: ");
        team1.forEach(n -> n.step(team2));
    }
}
