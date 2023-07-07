import java.util.ArrayList;

public class Crossbowman extends Heroes {

    private int arrow;

    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        this.hp = Crossbowman.r.nextInt(100, 200);
        this.arrow = Crossbowman.r.nextInt(50, 150);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Arrow: %d", super.getInfo(), this.arrow);
    }

    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if (hp == 0 || arrow == 0) {
            return;
        }
        Attack(nearest(unitsEnemys));
//        if(unitsAllies.contains(Peasant.class)){
//             return;
//        }
        arrow--;
        System.out.println(getInfo());

    }
}