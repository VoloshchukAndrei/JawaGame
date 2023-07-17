import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
public class Program {

    public static ArrayList<Heroes> team1 = new ArrayList<>();
    public static ArrayList<Heroes> team2 = new ArrayList<>();

    public static void main(String[] args) {
//        System.out.println("team1:");
//        Random rand = new Random();
//        int val = rand.nextInt(2);
//        int position = 0;
//        switch (val) {
//            case 0:
//                team1.add(new Magician(Names.Magician.getName(), 0, position));
//                team2.add(new Monk(Names.Monk.getName(), 5, position));
//                break;
//            case 1:
//                team1.add(new Monk(Names.Monk.getName(), 0, position));
//                team2.add(new Magician(Names.Magician.getName(), 5, position));
//                break;
//        }
//        position++;
//        val = rand.nextInt(2);
//        switch (val) {
//            case 0:
//                team1.add(new Archer(Names.Archer.getName(), 0, position));
//                team2.add(new Crossbowman(Names.Crossbowman.getName(), 5, position));
//                break;
//            case 1:
//                team1.add(new Crossbowman(Names.Crossbowman.getName(), 0, position));
//                team2.add(new Archer(Names.Archer.getName(), 5, position));
//                break;
//        }
//        position++;
//        val = rand.nextInt(2);
//        switch (val) {
//            case 0:
//                team1.add(new Robber(Names.Robber.getName(), 0, position));
//                team2.add(new Spearman(Names.Spearman.getName(), 5, position));
//                break;
//            case 1:
//                team1.add(new Spearman(Names.Spearman.getName(), 0, position));
//                team2.add(new Robber(Names.Robber.getName(), 5, position));
//                break;
//        }
//        position++;
//        val = rand.nextInt(2);
//        switch (val) {
//            case 0:
//                team1.add(new Peasant(Names.Peasant.getName(), 0, position));
//                team2.add(new Squire(Names.Squire.getName(), 5, position));
//                break;
//            case 1:
//                team1.add(new Squire(Names.Squire.getName(), 0, position));
//                team2.add(new Peasant(Names.Peasant.getName(), 5, position));
//                break;
//        }
//        for (int i = 0; i < 4; i++){
//            System.out.println(team1.get(i).getInfo());
//        }
//
//        System.out.println();
//        System.out.println("team2:");
//        for (int i = 0; i < 4; i++) {
//            System.out.println(team2.get(i).getInfo());
//        }
        int teamCount = 10;
        boolean sortedInitiative = false;

        int value = new Random().nextInt(2);
        switch (value) {
            case 0:
                team1.add(new Magician(Names.Magician.getName(), 1, 1));
                team1.add(new Peasant(Names.Peasant.getName(), 9, 1));
                team1.add(new Archer(Names.Archer.getName(), 3, 1));
                team1.add(new Robber(Names.Robber.getName(), 4, 1));
                team1.add(new Robber(Names.Robber.getName(), 5, 1));
                team1.add(new Robber(Names.Robber.getName(), 6, 1));
                team1.add(new Robber(Names.Robber.getName(), 7, 1));
                team1.add(new Archer(Names.Archer.getName(), 8, 1));
                team1.add(new Peasant(Names.Peasant.getName(), 2, 1));
                team1.add(new Magician(Names.Magician.getName(), 10, 1));

                team2.add(new Monk(Names.Monk.getName(), 1, 10));
                team2.add(new Squire(Names.Squire.getName(), 9, 10));
                team2.add(new Crossbowman(Names.Crossbowman.getName(), 3, 10));
                team2.add(new Spearman(Names.Spearman.getName(), 4, 10));
                team2.add(new Spearman(Names.Spearman.getName(), 5, 10));
                team2.add(new Spearman(Names.Spearman.getName(), 6, 10));
                team2.add(new Spearman(Names.Spearman.getName(), 7, 10));
                team2.add(new Crossbowman(Names.Crossbowman.getName(), 8, 10));
                team2.add(new Squire(Names.Squire.getName(), 2, 10));
                team2.add(new Monk(Names.Monk.getName(), 10, 10));
                break;
            case 1:
                team1.add(new Monk(Names.Monk.getName(), 1, 1));
                team1.add(new Squire(Names.Squire.getName(), 2, 1));
                team1.add(new Crossbowman(Names.Crossbowman.getName(), 3, 1));
                team1.add(new Spearman(Names.Spearman.getName(), 4, 1));
                team1.add(new Spearman(Names.Spearman.getName(), 5, 1));
                team1.add(new Spearman(Names.Spearman.getName(), 6, 1));
                team1.add(new Spearman(Names.Spearman.getName(), 7, 1));
                team1.add(new Crossbowman(Names.Crossbowman.getName(), 8, 1));
                team1.add(new Squire(Names.Squire.getName(), 9, 1));
                team1.add(new Monk(Names.Monk.getName(), 10, 1));

                team2.add(new Magician(Names.Magician.getName(), 1, 10));
                team2.add(new Peasant(Names.Peasant.getName(), 9, 10));
                team2.add(new Archer(Names.Archer.getName(), 3, 10));
                team2.add(new Robber(Names.Robber.getName(), 4, 10));
                team2.add(new Robber(Names.Robber.getName(), 5, 10));
                team2.add(new Robber(Names.Robber.getName(), 6, 10));
                team2.add(new Robber(Names.Robber.getName(), 7, 10));
                team2.add(new Archer(Names.Archer.getName(), 8, 10));
                team2.add(new Peasant(Names.Peasant.getName(), 2, 10));
                team2.add(new Magician(Names.Magician.getName(), 10, 10));
                break;
        }

        while(!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team1.size() - 1; i++) {
                if (team1.get(i).initiative < team1.get(i + 1).initiative) {
                    Collections.swap(team1, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        sortedInitiative = false;

        while(!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team2.size() - 1; i++) {
                if (team2.get(i).initiative < team2.get(i + 1).initiative) {
                    Collections.swap(team2, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        Scanner in = new Scanner(System.in);
        while (true) {

            View.view();
            in.nextLine();
            int init1 = 0;
            int init2 = 0;
            Heroes tmpTeam1 = team1.get(init1);
            Heroes tmpTeam2 = team2.get(init2);

            for (int i = 0; i < teamCount * 2; i++) {
                if ((tmpTeam1.initiative >= tmpTeam2.initiative && init1 < 10) || (tmpTeam1.initiative < tmpTeam2.initiative && init2 == 10)) {
                    tmpTeam1.step(team2, team1);
                    init1++;
                    if (init1 < 10) tmpTeam1 = team1.get(init1);
                } else {
                    tmpTeam2.step(team1, team2);
                    init2++;
                    if (init2 < 10) tmpTeam2 = team2.get(init2);
                }

                if (Heroes.teamDead(team1)) {
                    System.out.print("Team 2(Blue) win!");
                    break;
                }
                if (Heroes.teamDead(team2)) {
                    System.out.print("Team 1(Green) win!");
                    break;
                }
            }
        }
    }
}
