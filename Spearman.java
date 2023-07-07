import java.util.ArrayList;

public class Spearman extends Heroes {

    private int force;
    public Spearman(String name, int x, int y) {
        super(name, x, y);
        this.hp = Spearman.r.nextInt(100, 200);
        this.force = Spearman.r.nextInt(50, 150);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Force: %d", super.getInfo(), this.force);
    }

    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        Heroes tmp = nearest(unitsEnemys);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}