package Problem2.Transformers;

import java.util.Comparator;

public class Autobot extends Transformer{

    public Autobot(String name, String type, int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        super(name, type, strength, intelligence, speed, endurance, rank, courage, firepower, skill);
    }

    @Override
    public String toString() {
        return "["+this.name + "," + this.type + "," + this.strength + "," + this.intelligence + "," + this.speed + "," + this.endurance + "," + this.rank + "," + this.courage + "," + this.firepower + "," + this.skill+"]";
    }
}
class RankSorting implements Comparator<Autobot> {
    @Override
    public int compare(Autobot a, Autobot b) {

        return b.rank - a.rank;
    }
}
