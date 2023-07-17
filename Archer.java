import java.util.ArrayList;

public class Archer extends Heroes {
    public Archer(String name, int x, int y) {
        super(name, x, y);
        hp = Archer.r.nextInt(90, 100);
        arrow = Archer.r.nextInt(5, 10);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Arrow: %d", super.getInfo(), arrow);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (arrow == 0) {
            return;
        }
        Attack(nearest(unitsEnemys));
        arrow--;
        System.out.println(getInfo());
    }
}