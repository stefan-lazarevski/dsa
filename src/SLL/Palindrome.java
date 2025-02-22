package SLL;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(SLL<Integer> lista) {
        SLL<Integer> lista2 = new SLL<Integer>();
        SLLNode<Integer> tmp1 = lista.getFirst();
        while(tmp1!=null){
            lista2.insertLast(tmp1.element);
            tmp1 = tmp1.succ;
        }

        lista.mirror();
        tmp1 = lista.getFirst();
        SLLNode<Integer> tmp2 = lista2.getFirst();

        while (tmp2!=null) {
            if(tmp1.element != tmp2.element){
                System.out.println("False nigag");
                return;
            }
            tmp2 = tmp2.succ;
            tmp1 = tmp1.succ;
        }
        System.out.println("True nigga");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int n = input.nextInt(); //br na jazli
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.nextInt());
        }
        palindrome(lista);
    }
}
