package leetcode;

import java.util.Scanner;

public class Partition {
    public static void partition(SLL<Integer> list, int x){
        SLLNode<Integer> tmp = list.getFirst();
        SLL<Integer> pom = new SLL<Integer>();

        while(tmp != null) {
            if(tmp.element < x) {
                pom.insertLast(tmp.element);
            }
            tmp = tmp.succ;
        }
        tmp = list.getFirst();
        while(tmp!=null) {
            if(tmp.element >= x) {
                pom.insertLast(tmp.element);
            }
            tmp = tmp.succ;
        }
//        list.deleteList();
//        SLLNode<Integer> tmp2 = pom.getFirst();
//        while(tmp2!=null) {
//            list.insertLast(tmp2.element);
//            tmp2 = tmp2.succ;
//        }
        System.out.println(pom.toString());
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }
        int x = input.nextInt();
        partition(list, x);
    }
}
