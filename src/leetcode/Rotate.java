package leetcode;

import java.util.Scanner;

public class Rotate {
    public static void rotate(SLL<Integer> list, int k){
           SLLNode<Integer> tmp = list.getFirst();
           SLL<Integer> pom = new SLL<Integer>();
           if(k > list.size()) {
               k = k - list.size();
           }
           for(int i = 0; i < k; i++) {
               while(tmp.succ!=null) {
                   tmp = tmp.succ;
               }
               pom.insertFirst(tmp.element);
               list.delete(tmp);
               tmp = list.getFirst();
           }
           tmp = list.getFirst();
           while(tmp!=null) {
               pom.insertLast(tmp.element);
               tmp = tmp.succ;
           }
        System.out.println(pom);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }
        int k = input.nextInt();
        rotate(list, k);
    }
}
