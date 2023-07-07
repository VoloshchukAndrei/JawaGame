import java.util.Random;

import java.util.ArrayList;

public abstract class Heroes implements InGameInterface {

    protected String name;
    protected int hp;
    protected static Random r;
    protected static int number;
    Coordinates coordinates;

    static {
        Heroes.number = 0;
        Heroes.r = new Random();
    }
    public Heroes(String name, int x, int y) {
        this.name = name;
        coordinates = new Coordinates(x, y);
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s x: %d y: %d", this.name, this.hp, this.getClass().getSimpleName(), coordinates.x, coordinates.y);
    }

    public Heroes nearest(ArrayList<Heroes> units) {
        double nearestDistance = Double.MAX_VALUE;
        Heroes nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if(coordinates.countDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.countDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }

//    @Override
//    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
//    }

//    public String getInformation() {
//        return String.format("Name: %s  Hp: %d  Type: %s",
//                this.name, this.hp, this.getClass().getSimpleName());
//    }

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
