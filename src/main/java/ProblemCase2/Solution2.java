package ProblemCase2;

import ProblemCase2.SortingAlgorithims.BubbleSort;
import ProblemCase2.SortingAlgorithims.InsertionSort;
import ProblemCase2.SortingAlgorithims.MergeSort;
import ProblemCase2.SortingAlgorithims.SelectionSort;

import java.util.Scanner;

public class Solution2 {
    public Solution2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations");
        int size = sc.nextInt();
        int[] currencyDenominations = new int[size];

        System.out.println("Enter the currency denominations value");
        for (int i = 0; i < size; i++) {
            currencyDenominations[i] = sc.nextInt();
        }

        //called sort here
//        new BubbleSort(currencyDenominations, size);
//        new InsertionSort(currencyDenominations, size);
        new MergeSort(currencyDenominations, 0, size-1);
//        new SelectionSort(currencyDenominations, size);

        System.out.println("Enter the amount you want to pay");
        int amountToPay = sc.nextInt();

        System.out.println("Your payment approach in order to give min no of notes will be");


        int[] count = new int[size];

        for (int i=0; i<size; i++){
            if(amountToPay >= currencyDenominations[i]){
                count[i] = amountToPay/currencyDenominations[i];
                amountToPay %= currencyDenominations[i];
            }
        }
        if (amountToPay != 0) {
            System.out.println("Cannot provide exact payment");
        } else {
            for (int i = 0; i < size; i++) {
                if(count[i] != 0){
                    System.out.println(currencyDenominations[i] + ": " + count[i]);
                }
            }
        }

    }
}
