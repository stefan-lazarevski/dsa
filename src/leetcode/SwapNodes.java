package leetcode;

import java.util.Scanner;

public class SwapNodes {
    public static void swapped(SLL<Integer> list){
        SLLNode<Integer> tmp1 = list.getFirst();
        SLLNode<Integer> tmp2 = tmp1.succ;
        Integer pom;
        while(tmp1!=null) {
                pom = tmp1.element;
                tmp1.element = tmp1.succ.element;
                tmp1.succ.element = pom;
                if(tmp1.succ == null)
                    break;
            tmp1 = tmp1.succ.succ;
    }

        System.out.println(list.toString());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }
        swapped(list);
    }
}
