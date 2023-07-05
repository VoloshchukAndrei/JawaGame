import java.util.ArrayList;

public class Crossbowman extends Heroes {

    private int arrow;

    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        this.hp = Crossbowman.r.nextInt(100, 200);
        this.arrow = Crossbowman.r.nextInt(50, 150);
    }

    public String getInformation() {
        return String.format("%s  Arrow: %d", super.getInformation(), this.arrow);
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