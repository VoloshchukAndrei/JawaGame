import java.util.ArrayList;

public class Peasant extends Heroes {

    private int resources;

    public Peasant(String name, int x, int y) {
        super(name, x, y);
        this.hp = Peasant.r.nextInt(100, 200);
        this.resources = Peasant.r.nextInt(50, 150);
    }
    public String getInformation() {
        return String.format("%s  Resources: %d",super.getInformation(), this.resources);
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
