public class Peasant extends Heroes {

    private int resources;

    public Peasant() {
        super(String.format("Hero_Peasant #%d", ++Peasant.number),
                Peasant.r.nextInt(100, 200));
        this.resources = Peasant.r.nextInt(100, 150);
    }

    public String getInfo() {
        return String.format("%s  Cartridge: %d", super.getInfo(), this.resources);
    }
}
