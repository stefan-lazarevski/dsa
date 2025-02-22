package SLL;

import java.util.Scanner;

public class PairsSwap {

    public static void swapped(SLL<Integer> list1){
        SLLNode<Integer> tmp = list1.getFirst();
        Integer pom;

        while(tmp!=null) {
            pom = tmp.element;
            tmp.element = tmp.succ.element;
            tmp.succ.element = pom;
            if (tmp==null){
                break;
            }
            tmp = tmp.succ.succ;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list1 = new SLL<Integer>();
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i <n; i++) {
            list1.insertLast(input.nextInt());
        }
        swapped(list1);
        System.out.println(list1.toString());
    }
}
