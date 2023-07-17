import java.util.ArrayList;
 class Magician extends Heroes {

    public Magician(String name, int x, int y) {
        super(name, x, y);
        hp = Magician.r.nextInt(70, 100);
        mana = Magician.r.nextInt(50, 60);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), mana);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (mana == 0) {
            return;
        }
        Healed(Treatment(unitsAllies));
        mana = mana - Heroes.r.nextInt(5, 15);
        if (mana <= 0) {
            mana = 0;
        }
        System.out.println(getInfo());
    }
}
