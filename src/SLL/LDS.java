package SLL;

import java.util.Scanner;


public class LDS {
    private static int najdolgaOpagackaSekvenca(int[] a) {
        int count = 1;
        int currCount = 1;
        for(int i=1; i<a.length; i++){
            if(a[i-1] > a[i]) {
                currCount++;
            } else {
                if(currCount > count) {
                    count = currCount;
                }
                currCount = 1;
            }
        }
        if(currCount > count) {
            count = currCount;
        }
        // Vasiot kod tuka
        return count;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = stdin.nextInt();
        }
        System.out.println(najdolgaOpagackaSekvenca(a));
    }


}