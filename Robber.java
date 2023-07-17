import java.util.ArrayList;

public class Robber extends Heroes {

    public Robber(String name, int x, int y) {
        super(name, x, y);
        hp = Robber.r.nextInt(90, 100);
        endurance = Robber.r.nextInt(800, 900);
        attackRange = 1;
    }
    @Override
    public String getInfo() {
        return String.format("%s  Endurance: %d", super.getInfo(), endurance);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (endurance == 0) {
            return;
        }
        if (coordinates.countDistance(nearest(unitsEnemys).coordinates) <= attackRange) {
            Attack(nearest(unitsEnemys));
            endurance = endurance - Heroes.r.nextInt(5, 15);
            if (endurance <= 0) {
                endurance = 0;
            }
            state = "Attack";
            System.out.println(getInfo());
        }
        else {
            move(nearest(unitsEnemys).coordinates, unitsAllies);
            state = "Moving";
        }
    }
}
