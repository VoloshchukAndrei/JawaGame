import java.util.ArrayList;

public class Robber extends Heroes {

    private int endurance;
    public Robber(String name, int x, int y) {
        super(name, x, y);
        this.hp = Robber.r.nextInt(100, 200);
        this.endurance = Robber.r.nextInt(50, 150);
    }
    public String getInformation() {
        return String.format("%s  Endurance: %d",super.getInformation(), this.endurance);
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
