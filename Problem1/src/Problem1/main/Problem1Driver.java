package Problem1.main;

import Problem1.MyCompany.MyCompany;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem1Driver {

    public static void main(String[] args) {

        // Sample inputs, please change the value of any sample input for other testcases.

        int[] s1 = {2, 6, 6, 6, 3};
        System.out.println("Adjusted Land (Duplicates Removed): " + MyCompany.removingDuplicates(s1));
        System.out.println("No.of Castles which can be built on peaks: " + MyCompany.castlesOnPeaks(MyCompany.removingDuplicates(s1)));
        System.out.println("No.of Castles which can be built in valleys: " + MyCompany.castleOnValleys((MyCompany.removingDuplicates(s1))));
        System.out.println("\n");

        int[] s2 = {6, 1, 4};
        System.out.println("Adjusted Land (Duplicates Removed) : " + MyCompany.removingDuplicates(s2));
        System.out.println("No.of Castles which can be built on peaks: " + MyCompany.castlesOnPeaks(MyCompany.removingDuplicates(s2)));
        System.out.println("No.of Castles which can be built in Valleys: " + MyCompany.castleOnValleys((MyCompany.removingDuplicates(s2))));
        System.out.println("\n");

        int[] s3 = {6};
        System.out.println("Original Land: " + Arrays.toString(s3));
        System.out.println("Adjusted Land (Duplicates Removed): " + MyCompany.removingDuplicates(s3));
        System.out.println("No.of Castles which can be built on peaks: " + MyCompany.castlesOnPeaks(MyCompany.removingDuplicates(s3)));
        System.out.println("No.of Castles which can be built in valleys: " + MyCompany.castleOnValleys((MyCompany.removingDuplicates(s3))));

    }

    }
