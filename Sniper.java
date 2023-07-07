import java.util.ArrayList;

public class Sniper extends Heroes {

    private int cartridge;
    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.hp = Sniper.r.nextInt(100, 200);
        this.cartridge = Sniper.r.nextInt(5, 10);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Cartridge: %d", super.getInfo(), this.cartridge);
    }

//        Heroes tmp = nearest(units);
//        System.out.println(tmp.name + " " + coordinates.countDistance(tmp.coordinates));
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if (hp == 0 || cartridge == 0) {
            return;
        }
        Attack(nearest(unitsEnemys));
//        if(unitsAllies.contains(Peasant.class)){
//            return;
//        }
        cartridge--;
        System.out.println(getInfo());
    }
}