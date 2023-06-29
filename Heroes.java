import java.util.Random;

public class Heroes {

    protected String name;
    protected int hp;
    protected static Random r;
    protected static int number;

    static {
        Heroes.number = 0;
        Heroes.r = new Random();
    }
    public Heroes(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public Heroes() {
        this(String.format("Hero_Name #%d", ++Heroes.number),
                Heroes.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(Heroes target) {
        int cure = Heroes.r.nextInt(5, 15);
        target.GetСure(cure);
    }

    public void GetСure(int cure) {
        if (this.hp !=0 && this.hp + cure < 200) {
            this.hp += cure;
        }
        else {
            if (this.hp == 0){
                this.hp = 0;
            }
            else{
                this.hp = 200;
            }
        }
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else {
            this.hp = 0;
        }
    }

    public void Attack(Heroes target) {
        int damage = Heroes.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
}
