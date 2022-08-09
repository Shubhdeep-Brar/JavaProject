package Problem2.Transformers;

import java.util.ArrayList;

public interface Rules {

    public void additionalTransformerList(ArrayList<Autobot> auto, ArrayList<Decepticon> dect);

    public void specialRules(ArrayList<Autobot> auto, ArrayList<Decepticon> dect);

    public void StrengthAndCourage(ArrayList<Autobot> auto, ArrayList<Decepticon> dect);

    public void skill(ArrayList<Autobot> auto, ArrayList<Decepticon> dect);

    public void overallRating(ArrayList<Autobot> auto, ArrayList<Decepticon> dect);

    public void winningTeam();

    public void survivingMembers();



}
