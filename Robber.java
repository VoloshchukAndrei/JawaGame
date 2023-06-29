public class Robber extends Heroes {

    private int endurance;
    public Robber() {
        super(String.format("Hero_Robber #%d", ++Robber.number),
                Robber.r.nextInt(100, 200));
        this.endurance = Robber.r.nextInt(150, 200);
    }

    public String getInfo() {
        return String.format("%s  Endurance: %d",super.getInfo(), this.endurance);
    }
}
