import java.util.ArrayList;
import java.util.Random;

public class Peasant extends Heroes {
    private int resources;
    public Peasant(String name, int x, int y) {
        super(name, x, y);
        hp = Peasant.r.nextInt(40, 70);
        resources = Peasant.r.nextInt(40, 50);
    }
    @Override
    public String getInfo() {
        return String.format("%s  Resources: %d", super.getInfo(), resources);
    }
    @Override
    public void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies) {
        if ((hp == 0)) {
            return;
        }
        if (resources == 0) {
            resources = 0;
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
                    resources--;
                    return;
                }
                else {
                    if ((unit.name.equals("Francis") && unit.hp != 0)) {
                        unit.ambrosia = unit.ambrosia + 5;
                        resources--;
                        return;
                    }
                    else {
                        if (unit.name.equals("Rience") && unit.hp != 0) {
                            unit.arrow = unit.arrow + 1;
                            resources--;
                            return;
                        } else {
                            if ((unit.name.equals("A.O'Sullivan") && unit.hp != 0)) {
                                unit.bolt = unit.bolt + 1;
                                resources--;
                                return;
                            }
                            else {
                                if (unit.name.equals("Bayaz") && unit.hp != 0) {
                                    unit.endurance = unit.endurance + 5;
                                    resources--;
                                    return;
                                }
                                else {
                                    if ((unit.name.equals("Falkor") && unit.hp != 0)){
                                        unit.force = unit.force + 5;
                                        resources--;
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
                    resources--;
                    return;
                } else {
                    if ((unit.name.equals("A.O'Sullivan") && unit.hp != 0)) {
                        unit.bolt = unit.bolt + 1;
                        resources--;
                        return;
                    }
                    else {
                        if (unit.name.equals("Bayaz") && unit.hp != 0) {
                            unit.endurance = unit.endurance + 5;
                            resources--;
                            return;
                        }
                        else {
                            if ((unit.name.equals("Falkor") && unit.hp != 0)){
                                unit.force = unit.force + 5;
                                resources--;
                                return;
                            }
                            else {
                                if (unit.name.equals("Hedin") && unit.hp != 0) {
                                    unit.mana = unit.mana + 5;
                                    resources--;
                                    return;
                                }
                                else {
                                    if ((unit.name.equals("Francis") && unit.hp != 0)) {
                                        unit.ambrosia = unit.ambrosia + 5;
                                        resources--;
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
                    resources--;
                    return;
                }
                else {
                    if ((unit.name.equals("Falkor") && unit.hp != 0)){
                        unit.force = unit.force + 5;
                        resources--;
                        return;
                    }
                    else {
                        if (unit.name.equals("Hedin") && unit.hp != 0) {
                            unit.mana = unit.mana + 5;
                            resources--;
                            return;
                        }
                        else {
                            if ((unit.name.equals("Francis") && unit.hp != 0)) {
                                unit.ambrosia = unit.ambrosia + 5;
                                resources--;
                                return;
                            }
                            else {
                                if (unit.name.equals("Rience") && unit.hp != 0) {
                                    unit.arrow = unit.arrow + 1;
                                    resources--;
                                    return;
                                } else {
                                    if ((unit.name.equals("A.O'Sullivan") && unit.hp != 0)) {
                                        unit.bolt = unit.bolt + 1;
                                        resources--;
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
