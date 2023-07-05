import java.util.ArrayList;

public class Monk extends Heroes {

    private int ambrosia;
    public Monk(String name, int x, int y) {
        super(name, x, y);
        this.hp = Monk.r.nextInt(100, 200);
        this.ambrosia = Monk.r.nextInt(50, 150);
    }
    public String getInformation() {
        return String.format("%s  Ambrosia: %d",super.getInformation(), this.ambrosia);
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
