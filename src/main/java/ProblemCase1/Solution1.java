package ProblemCase1;

import java.util.Scanner;

public class Solution1 {
    public Solution1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of transaction array");
        int size = sc.nextInt();

        int[] transactionArray = new int[size];
        System.out.println("Enter the values of array");
        for (int i = 0; i < size; i++) {
            transactionArray[i] = sc.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved");
        int targets = sc.nextInt();

        while (targets-- != 0) {
            System.out.println("Enter the value of target");
            int targetValue = sc.nextInt();
            int flag = 0;
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += transactionArray[i];
                if(sum >= targetValue){
                    System.out.println("Target achieved after " + (i + 1) + " transactions");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("Given target is not achieved");
            }
        }
    }
}
