package SLL;
import java.util.Scanner;
//LAB1.2
public class ReverseWord {
    public static void printReversed(String word) {
        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();
        System.out.print(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int br = input.nextInt();
        input.nextLine();

        for (int i = 0; i < br; i++) {
            String word = input.nextLine();
            printReversed(word);
            if (i!= br-1) {
                System.out.println();
            }
        }
    }
}
