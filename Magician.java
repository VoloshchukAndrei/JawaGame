public class Magician extends Heroes {

    private int mana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.mana = Magician.r.nextInt(50, 150);
    }
    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
