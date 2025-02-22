package leetcode;

import java.util.Scanner;

public class ReverseInKGroups {
    public static void reverse(SLL<Integer> list, int k) {
        SLL<Integer> pom = new SLL<>();
        SLL<Integer> krajna = new SLL<>();
        SLLNode<Integer> tmp1 = list.getFirst();
        SLLNode<Integer> tmp2 = null;

        int ostanati = list.size();
        while(tmp1!=null) {
            if (k < ostanati) {
                for (int i = 0; i < k; i++) {
                    pom.insertLast(tmp1.element);
                    tmp1 = tmp1.succ;
                }
                pom.mirror();
                tmp2 = pom.getFirst();
                while (tmp2 != null) {
                    krajna.insertLast(tmp2.element);
                    tmp2 = tmp2.succ;
                }
                pom.deleteList();
                ostanati = ostanati - k;
            } else {
                break;
            }
        }
        while(tmp1!=null) {
            krajna.insertLast(tmp1.element);
            tmp1 = tmp1.succ;
        }
        System.out.println(krajna);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }
        int k = input.nextInt();
        reverse(list, k);
    }
}
