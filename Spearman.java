import java.util.ArrayList;

public class Spearman extends Heroes {

    private int force;
    public Spearman(String name, int x, int y) {
        super(name, x, y);
        this.hp = Spearman.r.nextInt(100, 200);
        this.force = Spearman.r.nextInt(50, 150);
    }
    public String getInformation() {
        return String.format("%s  Force: %d",super.getInformation(), this.force);
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public void step(ArrayList<Heroes> units) {
        Heroes tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}