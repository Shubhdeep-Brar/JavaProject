package Problem2.Transformers;

import java.util.ArrayList;
import java.util.Collections;
import static Problem2.Transformers.BattleRules.AutobotWinners;
import static Problem2.Transformers.BattleRules.DecepticonWinners;

public class  Problem2Driver extends BattleRules {

    public static void main(String[] args) {

        // Please alter the values of any Sample instance 3
        //Sample Instance 1
        System.out.println("==========Sample 1==========");
        ArrayList<Autobot> Autobots = new ArrayList<>();

        Autobots.add(new Autobot("Afterburner", "A", 7, 6, 6, 6, 5, 9, 7, 7));
        Autobots.add(new Autobot("Air Raid", "A", 5, 7, 9, 7, 5, 10, 8, 7));

        ArrayList<Decepticon> Decepticons = new ArrayList<>();

        Decepticons.add(new Decepticon("Barrage", "D", 3, 8, 3, 7, 5, 10, 9, 8));
        Decepticons.add(new Decepticon("Bombshell", "D", 5, 8, 4, 5, 6, 5, 6, 9));
        Decepticons.add(new Decepticon("Cutthroat", "D", 8, 4, 4, 9, 5, 8, 7, 7));
        Decepticons.add(new Decepticon("Abominus", "D", 10, 1, 3, 10, 5, 10, 8, 4));


        // Below functions sort on the basis of rank.
        Collections.sort(Autobots, new RankSorting());
        Collections.sort(Decepticons, new RankSortingDecepticon());


        BattleRules sample1 = new BattleRules();
        sample1.specialRules(Autobots,Decepticons);
        sample1.additionalTransformerList(Autobots, Decepticons); // stored additional transformer to display value of surviving members of loosing team.
        sample1.StrengthAndCourage(Autobots, Decepticons);
        sample1.skill(Autobots, Decepticons);
        sample1.overallRating(Autobots, Decepticons);
        sample1.winningTeam();
        sample1.survivingMembers();
        BattleRules.AutobotWinners = new ArrayList<>();
        BattleRules.DecepticonWinners = new ArrayList<>();
        BattleRules.additionalTransformer=new ArrayList<>();
        System.out.println("\n");


        // Sample Instance 2
        System.out.println("==========Sample 2==========");
        ArrayList<Decepticon> DecepticonSample2 = new ArrayList<>();
        DecepticonSample2.add(new Decepticon("Soundwave","D",8,9,2,6,7,5,6,10));
        DecepticonSample2.add(new Decepticon("Cliffjumper","D",8,9,2,6,7,5,6,10));

        ArrayList<Autobot> AutobotsSample2 = new ArrayList<>();
        AutobotsSample2.add(new Autobot("Bluestreak","A",6,6,7,9,5,2,9,7));
        AutobotsSample2.add(new Autobot("Hubcap","A",4,4,4,4,4,4,4,4));


        // Below functions sort on the basis of rank.
        Collections.sort(AutobotsSample2, new RankSorting());
        Collections.sort(DecepticonSample2, new RankSortingDecepticon());

        BattleRules sample2 = new BattleRules();
        sample2.specialRules(AutobotsSample2,DecepticonSample2);
        sample2.additionalTransformerList(AutobotsSample2, DecepticonSample2);
        sample2.StrengthAndCourage(AutobotsSample2, DecepticonSample2);
        sample2.skill(AutobotsSample2, DecepticonSample2);
        sample2.overallRating(AutobotsSample2, DecepticonSample2);
        sample2.winningTeam();
        sample2.survivingMembers();
        BattleRules.AutobotWinners = new ArrayList<>();
        BattleRules.DecepticonWinners = new ArrayList<>();
        BattleRules.additionalTransformer=new ArrayList<>();
        System.out.println("\n");

        //Sample Instance 3
        System.out.println("==========Sample 3===========");
        ArrayList<Decepticon> DecepticonSample3 = new ArrayList<>();
        Decepticon a1= new Decepticon("Soundwave","D",8,9,2,6,7,5,6,10);
        Decepticon a2= new Decepticon("Cliffjumper","D",8,9,3,5,3,4,8,10);

        DecepticonSample3.add(a1);
        DecepticonSample3.add(a2);

        ArrayList<Autobot> AutobotsSample3 = new ArrayList<>();

        Autobot b1 = new Autobot("Bluestreak","A",6,6,7,9,5,2,9,7);
        AutobotsSample3.add(b1);

        BattleRules sample3 = new BattleRules();
        sample3.specialRules(AutobotsSample3,DecepticonSample3);
        sample3.additionalTransformerList(AutobotsSample3, DecepticonSample3);
        sample3.StrengthAndCourage(AutobotsSample3, DecepticonSample3);
        sample3.skill(AutobotsSample3, DecepticonSample3);
        sample3.overallRating(AutobotsSample3, DecepticonSample3);
        sample3.winningTeam();
        sample3.survivingMembers();
        BattleRules.AutobotWinners = new ArrayList<>();
        BattleRules.DecepticonWinners = new ArrayList<>();
        BattleRules.additionalTransformer=new ArrayList<>();
        System.out.println("\n");

        System.out.println("==========Sample 4==========");
        ArrayList<Decepticon> DecepticonSample4 = new ArrayList<>();
        DecepticonSample4.add(new Decepticon("Soundwave","D",8,9,2,6,8,5,6,10));
        DecepticonSample4.add(new Decepticon("Predaking","D",8,9,2,6,9,5,6,10));

        ArrayList<Autobot> AutobotsSample4 = new ArrayList<>();
        //AutobotsSample4.add(new Autobot("Bluestreak","A",6,6,7,9,6,2,9,7));
        AutobotsSample4.add(new Autobot("Optimus Prime","A",4,4,4,4,3,4,4,4));


        // Below functions sort on the basis of rank.
        Collections.sort(AutobotsSample4, new RankSorting());
        Collections.sort(DecepticonSample4, new RankSortingDecepticon());

        BattleRules sample4 = new BattleRules();
        sample4.specialRules(AutobotsSample4,DecepticonSample4);
        sample4.additionalTransformerList(AutobotsSample4, DecepticonSample4);
        sample4.StrengthAndCourage(AutobotsSample4, DecepticonSample4);
        sample4.skill(AutobotsSample4, DecepticonSample4);
        sample4.overallRating(AutobotsSample4, DecepticonSample4);
        sample4.winningTeam();
        sample4.survivingMembers();
        BattleRules.AutobotWinners = new ArrayList<>();
        BattleRules.DecepticonWinners = new ArrayList<>();
        BattleRules.additionalTransformer=new ArrayList<>();
        System.out.println("\n");


    }
}


