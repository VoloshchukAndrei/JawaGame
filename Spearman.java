import java.util.ArrayList;

public class Spearman extends Heroes {

    public Spearman(String name, int x, int y) {
        super(name, x, y);
        hp = Spearman.r.nextInt(90, 100);
        force = Spearman.r.nextInt(800, 900);
        attackRange = 1;
    }
    @Override
    public String getInfo() {
        return String.format("%s  Force: %d", super.getInfo(), force);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (force == 0) {
            return;
        }
        if (coordinates.countDistance(nearest(unitsEnemys).coordinates) <= attackRange) {
            Attack(nearest(unitsEnemys));
            force = force - Heroes.r.nextInt(5, 15);
            if (force <= 0) {
                force = 0;
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