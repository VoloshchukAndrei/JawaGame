public class Monk extends Heroes {

    private int ambrosia;
    public Monk() {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(100, 200));
        this.ambrosia = Monk.r.nextInt(50, 150);
    }

    public String getInfo() {
        return String.format("%s  Ambrosia: %d",super.getInfo(), this.ambrosia);
    }
}
