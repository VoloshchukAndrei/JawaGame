public class Crossbowman extends Heroes {

    private int arrow;
    public Crossbowman() {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
                Crossbowman.r.nextInt(100, 200));
        this.arrow = Crossbowman.r.nextInt(5, 10);
    }

    public String getInfo() {
        return String.format("%s  Arrow: %d",super.getInfo(), this.arrow);
    }
}