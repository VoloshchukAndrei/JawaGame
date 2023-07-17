import java.util.ArrayList;

public class Crossbowman extends Heroes {
     public Crossbowman(String name, int x, int y) {
         super(name, x, y);
        hp = Crossbowman.r.nextInt(90, 100);
        bolt = Crossbowman.r.nextInt(5, 10);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Bolt: %d", super.getInfo(), bolt);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (bolt == 0) {
            return;
        }
        Attack(nearest(unitsEnemys));
        bolt--;
        System.out.println(getInfo());
    }
}