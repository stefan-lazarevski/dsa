package leetcode;

import java.util.Scanner;

public class Palindrome {

    public static void palindrome(SLL<Integer> list){
        SLLNode<Integer> tmp1 = list.getFirst();
        list.mirror();
        SLLNode<Integer> tmp2 = list.getFirst();

        while(tmp1 != null ){
            while(tmp2 != null) {
                if(tmp1 == null){
                    break;
                }
                if(tmp1.element.equals(tmp2.element)) {
                    System.out.println("True");
                    tmp1 = tmp1.succ;
                }
                else {
                        System.out.println("False");
                }
                if(tmp1 == null){
                    break;
                }
                tmp1 = tmp1.succ;
                tmp2 = tmp2.succ;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }
        palindrome(list);
    }
}
