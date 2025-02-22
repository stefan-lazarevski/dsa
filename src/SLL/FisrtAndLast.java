package SLL;

import java.util.Scanner;

public class FisrtAndLast {
    public static void smeni(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> kraj = lista.getFirst();

        while (tmp.succ != null) {
            tmp = tmp.succ;
        }
        kraj = tmp;
        tmp = lista.getFirst();
        Integer pom = tmp.element;
        tmp.element = kraj.element;
        kraj.element = pom;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String[] broevi = input.nextLine().split("\\s+");
        SLL<Integer> lista = new SLL<Integer>();
        for (int i = 0; i < n; i++) {
            lista.insertLast(Integer.parseInt(broevi[i]));
        }
        smeni(lista);
        System.out.println(lista);
    }
}
