package SLL;

import java.util.Scanner;

public class Preuredi {
    public static void reorder(SLL<Integer> lista) {
        SLLNode<Integer> tmp1 = lista.getFirst();
        SLLNode<Integer> tmp2 = lista.getFirst();
        SLL<Integer> finalna = new SLL<Integer>();
        int counter = 0;
        while (tmp1 != null) {
            counter++;
            tmp1 = tmp1.succ;
        }
        tmp1 = lista.getFirst();

        while (tmp1 != tmp2 && tmp1.succ != tmp2) {
            tmp2 = lista.getFirst();
            for (int i = 0; i < counter; i++) {
                tmp2 = tmp2.succ;
            }
            finalna.insertLast(tmp1.element);
            finalna.insertLast(tmp2.element);
            counter--;
            tmp1 = tmp1.succ;
        }
        System.out.println(finalna.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int n = input.nextInt(); //br na jazli
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.nextInt());
        }
        reorder(lista);
    }
}
