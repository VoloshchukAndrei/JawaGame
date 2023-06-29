public class Sniper extends Heroes {

    private int cartridge;
    public Sniper() {
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(100, 200));
        this.cartridge = Sniper.r.nextInt(5, 10);
    }

    public String getInfo() {
        return String.format("%s  Cartridge: %d",super.getInfo(), this.cartridge);
    }
}