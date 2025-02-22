package SLL;

// leetcode
// input l1 = 2,4,3     l2 = 5,6,4
// output 7->0->8
// Explination 342 + 456 = 807

import java.util.Scanner;

public class AddTwoNumbers {

    public static void addNumbers(SLL<Integer> list1, SLL<Integer> list2) {
     list1.mirror();
     list2.mirror();
     String pom1 = new String();
     String pom2 = new String();
     SLLNode<Integer> tmp1 = list1.getFirst();
     for (int i=0; i<list1.size();i++) {
         pom1 = pom1 + tmp1.element;
         tmp1 = tmp1.succ;
     }
     SLLNode<Integer> tmp2 = list2.getFirst();
     for (int i=0; i<list2.size();i++) {
         pom2 += tmp2.element;
         tmp2 = tmp2.succ;
     }
     Integer zbir = Integer.parseInt(pom1) + Integer.parseInt(pom2);
     SLL<Integer> kraj = new SLL<Integer>();
     while(zbir>0){
         kraj.insertLast(zbir%10);
         zbir = zbir / 10;
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
        addNumbers(list1,list2);
    }
}
