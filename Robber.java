import java.util.ArrayList;

public class Robber extends Heroes {

    private int endurance;
    public Robber(String name, int x, int y) {
        super(name, x, y);
        this.hp = Robber.r.nextInt(100, 200);
        this.endurance = Robber.r.nextInt(50, 150);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Endurance: %d", super.getInfo(), this.endurance);
    }

    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        Heroes tmp = nearest(unitsEnemys);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
