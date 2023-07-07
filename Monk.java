import java.util.ArrayList;

public class Monk extends Heroes {

    private int ambrosia;
    public Monk(String name, int x, int y) {
        super(name, x, y);
        this.hp = Monk.r.nextInt(100, 200);
        this.ambrosia = Monk.r.nextInt(50, 150);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Ambrosia: %d", super.getInfo(), this.ambrosia);
    }

    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        Heroes tmp = nearest(unitsEnemys);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
