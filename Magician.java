import java.util.ArrayList;

public class Magician extends Heroes {

    private int mana;

    public Magician(String name, int x, int y) {
        super(name, x, y);
        this.hp = Magician.r.nextInt(100, 200);
        this.mana = Magician.r.nextInt(50, 150);
    }
    public String getInformation() {
        return String.format("%s  Mana: %d",super.getInformation(), this.mana);
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
