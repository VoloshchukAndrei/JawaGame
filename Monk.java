import java.util.ArrayList;

public class Monk extends Heroes {
    public Monk(String name, int x, int y) {
        super(name, x, y);
        hp = Monk.r.nextInt(75, 100);
        ambrosia = Monk.r.nextInt(50, 60);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Ambrosia: %d", super.getInfo(), ambrosia);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (ambrosia == 0) {
            if (coordinates.countDistance(nearest(unitsEnemys).coordinates) <= attackRange) {
                Attack(nearest(unitsEnemys));
                state = "Attack";
                System.out.println(getInfo());
            }
            else {
                move(nearest(unitsEnemys).coordinates, unitsAllies);
                state = "Moving";
            }
            return;
        }
        Healed(Treatment(unitsAllies));
        ambrosia = ambrosia - Heroes.r.nextInt(5, 15);
        if (ambrosia <= 0) {
            ambrosia = 0;
        }
        System.out.println(getInfo());
    }
}
