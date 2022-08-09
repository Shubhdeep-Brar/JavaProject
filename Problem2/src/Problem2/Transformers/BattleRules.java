package Problem2.Transformers;

import java.util.ArrayList;

public class BattleRules implements Rules {

    static ArrayList<Autobot> AutobotWinners = new ArrayList<>();
    static ArrayList<Decepticon> DecepticonWinners = new ArrayList<>();
    static ArrayList<Transformer> additionalTransformer = new ArrayList<>();

    // ensuring there are same number of members in each team to arrange the battle. Adding additional member from Decepticon or Autobot to new array list.
    @Override
    public void additionalTransformerList(ArrayList<Autobot> auto, ArrayList<Decepticon> dect) {

        while (dect.size() > auto.size()) {
            additionalTransformer.add(dect.get(dect.size() - 1));
            dect.remove(dect.size() - 1);
        }
        while (auto.size() > dect.size()) {
            additionalTransformer.add(auto.get(auto.size() - 1));
            auto.remove(auto.size() - 1);
        }

    }

    @Override
    public void specialRules(ArrayList<Autobot> auto, ArrayList<Decepticon> dect) {
        for (int i = 0; i < Math.min(auto.size(), dect.size()); i++) {
            if (auto.get(i).getName().equals("Optimus Prime") && dect.get(i).getName().equals("Predaking")) {
                AutobotWinners = new ArrayList<>();
                DecepticonWinners = new ArrayList<>();
                System.out.println("Draw");

            }
            if(auto.get(i).getName()=="Optimus Prime"){
                AutobotWinners.add(auto.get(i));

            }
            if(dect.get(i).getName()=="Predaking"){
                DecepticonWinners.add(dect.get(i));
            }



        }
    }
// This method calculates the number of battles and finds winners and loosers based on Courage and Strength.

        public void StrengthAndCourage (ArrayList < Autobot > auto, ArrayList < Decepticon > dect){
            int noOfBattles = 0;
            for (int i = 0; i < Math.min(auto.size(), dect.size()); i++) {
                if ((auto.get(i).getCourage() - dect.get(i).getCourage()) >= 4 && (auto.get(i).getStrength() - dect.get(i).getStrength()) >= 3) {
                    AutobotWinners.add(auto.get(i));
                    auto.remove(i);
                    dect.remove(i);

                } else if ((dect.get(i).getCourage() - auto.get(i).getCourage()) >= 4 && (dect.get(i).getStrength() - auto.get(i).getStrength()) >= 3) {
                    DecepticonWinners.add(dect.get(i));
                    dect.remove(i);
                    auto.remove(i);
                }
                noOfBattles++;

            }
            System.out.println("\n No. of battles fought are: " + noOfBattles);
        }

// this method finds the winner and looser based on skill
        public void skill (ArrayList < Autobot > auto, ArrayList < Decepticon > dect){
            for (int i = 0; i < Math.min(auto.size(), dect.size()); i++) {

                if (auto.get(i).getSkill() - dect.get(i).getSkill() >= 3) {
                    AutobotWinners.add(auto.get(i));
                    auto.remove(i);
                    dect.remove(i);

                } else if (dect.get(i).getSkill() - auto.get(i).getSkill() >= 3) {
                    DecepticonWinners.add(dect.get(i));
                    dect.remove(i);
                    auto.remove(i);

                }
            }
        }
// This method takes overallRating into consideration for finding the winner and looser
        public void overallRating (ArrayList < Autobot > auto, ArrayList < Decepticon > dect){
            for (int i = 0; i < Math.min(auto.size(), dect.size()); i++) {
                if (auto.get(i).getOverallRating() > dect.get(i).getOverallRating()) {
                    AutobotWinners.add(auto.get(i));
                    dect.remove(i);
                    auto.remove(i);
                } else if (dect.get(i).getOverallRating() > auto.get(i).getOverallRating()) {
                    DecepticonWinners.add(dect.get(i));
                    dect.remove(i);
                    auto.remove(i);
                } else if (auto.get(i).getOverallRating() == dect.get(i).getOverallRating()) {
                    dect.remove(i);
                    auto.remove(i);
                }
            }
        }
// This method displays the winning members of the winning team.
        public void winningTeam () {
            if (AutobotWinners.size() > DecepticonWinners.size()) {
                System.out.print("The winning team:(Autobots): ");
                for (Autobot A : AutobotWinners) {
                    System.out.println(A.getName());
                }
            }
            if (AutobotWinners.size() < DecepticonWinners.size()) {
                System.out.print("The winning team:(Decepticons): ");
                for (Decepticon A : DecepticonWinners) {
                    System.out.println(A.getName());
                }
                if(AutobotWinners.size()== DecepticonWinners.size()){
                    System.out.println("it's Draw");
                }
            }
        }

// this method prints surviving members of the loosing team.
        public void survivingMembers () {
            if (AutobotWinners.size() > DecepticonWinners.size()) {
                System.out.print("Surviving members of loosing team: ");
                for (int i = 0; i < additionalTransformer.size(); i++) {
                    if (additionalTransformer.get(i).getType() == "D") {
                        System.out.println(additionalTransformer.get(i).getName());
                    }

                }
            }
            if (AutobotWinners.size() < DecepticonWinners.size()) {
                System.out.print("Surviving members of loosing team: ");
                for (int i = 0; i < additionalTransformer.size(); i++) {
                    if (additionalTransformer.get(i).getType() == "A") {
                        System.out.println(additionalTransformer.get(i).getName());
                    }

                }
            }
        }
    }
