import java.util.ArrayList;

public interface InGameInterface {

    void step(ArrayList<Heroes> unitsEnemys, ArrayList<Heroes> unitsAllies);

    String getInfo();
}
