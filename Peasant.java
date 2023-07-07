import java.util.ArrayList;

public class Peasant extends Heroes {

    private int resources;

    public Peasant(String name, int x, int y) {
        super(name, x, y);
        this.hp = Peasant.r.nextInt(100, 200);
        this.resources = Peasant.r.nextInt(50, 150);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Resources: %d", super.getInfo(), this.resources);
    }

    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        Heroes tmp = nearest(unitsEnemys);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
