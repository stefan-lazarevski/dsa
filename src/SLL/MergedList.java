package SLL;

import java.util.Scanner;

public class MergedList {

    public static void merged(SLL<Integer> list1, SLL<Integer> list2){
            SLLNode<Integer> tmp1 = list1.getFirst();
            SLLNode<Integer> tmp2 = list2.getFirst();
            SLL<Integer> kraj = new SLL<Integer>();
            while (tmp1 != null && tmp2 != null) {
                if (tmp1.element <= tmp2.element) {
                    kraj.insertLast(tmp1.element);
                    tmp1 = tmp1.succ;
                } else {
                    kraj.insertLast(tmp2.element);
                    tmp2=tmp2.succ;
                }
            }

            while(tmp1!=null){
                kraj.insertLast(tmp1.element);
                tmp1=tmp1.succ;
            }

            while(tmp2!=null){
                kraj.insertLast(tmp2.element);
                tmp2=tmp2.succ;
            }
            System.out.println(kraj.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list1 = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list1.insertLast(input.nextInt());
        }
        SLL<Integer> list2 = new SLL<Integer>();
        int m = input.nextInt();
        for (int i = 0; i < m; i++) {
            list2.insertLast(input.nextInt());
        }
        merged(list1,list2);
    }
}
