package Problem2.Transformers;

public class Transformer {

    protected String name;
    protected String type;
    protected int strength;
    protected int intelligence;
    protected int speed;
    protected int endurance;
    protected int rank;
    protected int courage;
    protected int firepower;
    protected int skill;

    public Transformer(String name, String type, int strength, int intelligence, int speed, int endurance,
                       int rank, int courage, int firepower, int skill){
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.endurance = endurance;
        this.rank = rank;
        this.courage = courage;
        this.firepower = firepower;
        this.skill = skill;

    }
    public int getOverallRating(){
        return this.strength + this.intelligence + this.speed + this.endurance + this.firepower;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getRank() {
        return rank;
    }

    public int getCourage() {
        return courage;
    }

    public int getFirepower() {
        return firepower;
    }

    public int getSkill() {
        return skill;
    }


}
