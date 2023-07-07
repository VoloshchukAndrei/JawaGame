import java.util.ArrayList;

public class Magician extends Heroes {

    private int mana;

    public Magician(String name, int x, int y) {
        super(name, x, y);
        this.hp = Magician.r.nextInt(100, 200);
        this.mana = Magician.r.nextInt(50, 150);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }

    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        Heroes tmp = nearest(unitsEnemys);
        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    }
}
