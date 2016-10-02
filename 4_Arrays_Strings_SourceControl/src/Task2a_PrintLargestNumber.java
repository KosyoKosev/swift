

import java.util.Scanner;

public class Task2a_PrintLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println(maxNumber);

    }

}
