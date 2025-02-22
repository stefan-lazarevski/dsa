package leetcode;

import java.util.Scanner;

public class RemoveDups2 {
    public static void remove(SLL<Integer> list) {
        SLLNode<Integer> tmp1 = list.getFirst();
        SLLNode<Integer> tmp2 = tmp1.succ;

        while(tmp1!=null) {
            while(tmp2!=null) {
                if(tmp1.element.equals(tmp2.element)){
                    list.delete(tmp1);
                    list.delete(tmp2);
                }
                tmp1 = tmp1.succ;
                tmp2 = tmp2.succ;
            }
            tmp1 = tmp1.succ;
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
        remove(list);
    }
}
