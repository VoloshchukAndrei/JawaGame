import java.util.ArrayList;
import java.util.Random;

public abstract class Heroes implements InGameInterface {
    protected String name, state;
    protected int hp, ambrosia, mana, arrow, bolt, endurance, force, attackRange, initiative;
    protected static Random r;
    protected static int number;

    Coordinates coordinates;

    static {
        Heroes.number = 0;
        Heroes.r = new Random();
    }
    public Heroes(String name, int x, int y) {
        this.name = name;
        this.state = "stand";
        coordinates = new Coordinates(x, y);
    }
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s x: %d y: %d", name, hp, getClass().getSimpleName(), coordinates.x, coordinates.y);
    }
    public Heroes nearest(ArrayList<Heroes> units) {
        double nearestDistance = Double.MAX_VALUE;
        Heroes nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if(coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                if (nearestEnemy.hp != 0) {
                    nearestDistance = coordinates.countDistance(units.get(i).coordinates);
                }
            }
        }
        return nearestEnemy;
    }
    public void Healed(Heroes target) {
        int cure = Heroes.r.nextInt(5, 15);
        target.GetСure(cure);
    }
    public void GetСure(int cure) {
        if (hp !=0 && hp + cure < 200) {
            hp += cure;
        }
        else {
            if (hp == 0){
                hp = 0;
            }
            else{
                hp = 100;
            }
        }
    }
    public Heroes Treatment(ArrayList<Heroes> unitsAllies) {
        double treatmentChoice = Double.MAX_VALUE;
        Heroes treatmentAllies = null;
        for (int i = 0; i < unitsAllies.size(); i++) {
            if(unitsAllies.get(i).hp < treatmentChoice) {
                treatmentAllies = unitsAllies.get(i);
                if (treatmentAllies.hp != 0) {
                    treatmentChoice = unitsAllies.get(i).hp;
                }
            }
        }
        return treatmentAllies;
    }
    public void GetDamage(int damage) {
        if (hp - damage > 0) {
            hp -= damage;
        }
        else {
            hp = 0;
        }
    }
    public void Attack(Heroes target) {
        int damage = Heroes.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
    public void move(Coordinates targetPosition, ArrayList<Heroes> unitsAllies) {
        if (!coordinates.containsByPos(coordinates.newPosition(targetPosition, unitsAllies), unitsAllies)) {
                coordinates = coordinates.newPosition(targetPosition, unitsAllies);
        }
    }
    public static boolean teamDead(ArrayList<Heroes> units) {
        for (Heroes unit : units) {
            if (unit.hp != 0) {
                return false;
            }
        }
        return true;
    }
}
