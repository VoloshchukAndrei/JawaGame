public class Spearman extends Heroes {

    private int force;
    public Spearman() {
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(100, 200));
        this.force = Spearman.r.nextInt(120, 170);
    }

    public String getInfo() {
        return String.format("%s  Force: %d",super.getInfo(), this.force);
    }
}