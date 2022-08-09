package Problem1.MyCompany;


import java.util.ArrayList;


public class MyCompany {

    public static ArrayList<Integer> removingDuplicates(int[] landDetail){
        ArrayList<Integer> updatedLand = new ArrayList<>();

        updatedLand.add(landDetail[0]);

        for(int i = 1; i < landDetail.length; i++){
           if(updatedLand.get(updatedLand.size()-1) != landDetail[i]){
                updatedLand.add(landDetail[i]);
            }
    }
        return updatedLand;
    }

    public static int castlesOnPeaks(ArrayList<Integer> Land) {
        int peakCount = 0;

        for(int i = 0; i < Land.size(); i++){
            if(Land.size() == 1){
                peakCount = peakCount+0;
                break;
            }
        else if (i == 0 && (Land.get(i)) > (Land.get(i+1))){
            peakCount++;
            }
        else if (i < Land.size()-1 && i != 0 && Land.get(i) > Land.get(i-1) && Land.get(i) > Land.get(i+1)){
            peakCount++;
            }
        else if ((i == Land.size()-1) && (Land.get(Land.size()-2)) < (Land.get(Land.size()-1))) {
            peakCount++;
        }

        }
        return  peakCount;
        }

        public static int castleOnValleys(ArrayList<Integer> Land){
        int valleyCount = 0;

        for(int i = 0; i < Land.size(); i++){
            if(Land.size() == 1){
                valleyCount = valleyCount+0;
                break;
            }
            if(i == 0 && Land.get(i) < Land.get(i+1)){
                valleyCount ++;
            }
            else if (i < Land.size()-1 && i != 0 && Land.get(i) < Land.get(i-1) && Land.get(i) < Land.get(i+1) ){
                valleyCount++;
            }
            else if (i == Land.size()-1 && Land.get(i-1) > Land.get(i)) {
                valleyCount++;

            }
        }
        return  valleyCount;

        }
    }
