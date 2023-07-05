import java.util.ArrayList;

public class Sniper extends Heroes {

    private int cartridge;
    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.hp = Sniper.r.nextInt(100, 200);
        this.cartridge = Sniper.r.nextInt(50, 150);
    }
    public String getInformation() {
        return String.format("%s  Cartridge: %d",super.getInformation(), this.cartridge);
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