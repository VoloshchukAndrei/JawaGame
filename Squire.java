import java.util.ArrayList;
import java.util.Random;

public class Squire extends Heroes {
    private int weapon;
    public Squire(String name, int x, int y) {
        super(name, x, y);
        hp = Squire.r.nextInt(50, 70);
        weapon = Squire.r.nextInt(60, 110);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Weapon: %d", super.getInfo(), weapon);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (weapon == 0) {
            if (coordinates.countDistance(nearest(unitsEnemys).coordinates) <= attackRange) {
                Attack(nearest(unitsEnemys));
                state = "Attack";
                System.out.println(getInfo());
            }
            else {
                move(nearest(unitsEnemys).coordinates, unitsAllies);
                state = "Moving";
            }
            return;
        }
        Random rand = new Random();
        int val = rand.nextInt(3);
        switch (val) {
            case 0: for (Heroes unit : unitsAllies) {
                    if (unit.name.equals("Hedin") && unit.hp != 0) {
                        unit.mana = unit.mana + 5;
                        weapon--;
                        return;
                    }
                    else {
                        if ((unit.name.equals("Francis") && unit.hp != 0)) {
                            unit.ambrosia = unit.ambrosia + 5;
                            weapon--;
                            return;
                        }
                        else {
                            if (unit.name.equals("Rience") && unit.hp != 0) {
                                unit.arrow = unit.arrow + 1;
                                weapon--;
                                return;
                            } else {
                                if ((unit.name.equals("A.O'Sullivan") && unit.hp != 0)) {
                                    unit.bolt = unit.bolt + 1;
                                    weapon--;
                                    return;
                                }
                                else {
                                    if (unit.name.equals("Bayaz") && unit.hp != 0) {
                                        unit.endurance = unit.endurance + 5;
                                        weapon--;
                                        return;
                                    }
                                    else {
                                        if ((unit.name.equals("Falkor") && unit.hp != 0)){
                                            unit.force = unit.force + 5;
                                            weapon--;
                                            return;

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            break;
            case 1: for (Heroes unit : unitsAllies) {
                if (unit.name.equals("Rience") && unit.hp != 0) {
                    unit.arrow = unit.arrow + 1;
                    weapon--;
                    return;
                }
                else {
                    if ((unit.name.equals("A.O'Sullivan") && unit.hp != 0)) {
                        unit.bolt = unit.bolt + 1;
                        weapon--;
                        return;
                    }
                    else {
                        if (unit.name.equals("Bayaz") && unit.hp != 0) {
                            unit.endurance = unit.endurance + 5;
                            weapon--;
                            return;
                        }
                        else {
                            if ((unit.name.equals("Falkor") && unit.hp != 0)){
                                unit.force = unit.force + 5;
                                weapon--;
                                return;
                            }
                            else {
                                if (unit.name.equals("Hedin") && unit.hp != 0) {
                                    unit.mana = unit.mana + 5;
                                    weapon--;
                                    return;
                                }
                                else {
                                    if ((unit.name.equals("Francis") && unit.hp != 0)) {
                                        unit.ambrosia = unit.ambrosia + 5;
                                        weapon--;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            break;
            case 2: for (Heroes unit : unitsAllies) {
                if (unit.name.equals("Bayaz") && unit.hp != 0) {
                    unit.endurance = unit.endurance + 5;
                    weapon--;
                    return;
                }
                else {
                    if ((unit.name.equals("Falkor") && unit.hp != 0)){
                        unit.force = unit.force + 5;
                        weapon--;
                        return;
                    }
                    else {
                        if (unit.name.equals("Hedin") && unit.hp != 0) {
                            unit.mana = unit.mana + 5;
                            weapon--;
                            return;
                        }
                        else {
                            if ((unit.name.equals("Francis") && unit.hp != 0)) {
                                unit.ambrosia = unit.ambrosia + 5;
                                weapon--;
                                return;
                            }
                            else {
                                if (unit.name.equals("Rience") && unit.hp != 0) {
                                    unit.arrow = unit.arrow + 1;
                                    weapon--;
                                    return;
                                }
                                else {
                                    if ((unit.name.equals("A.O'Sullivan") && unit.hp != 0)) {
                                        unit.bolt = unit.bolt + 1;
                                        weapon--;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            break;
        }
        System.out.println(getInfo());
    }
}
