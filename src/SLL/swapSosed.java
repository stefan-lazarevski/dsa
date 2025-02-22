package SLL;

import java.util.Scanner;

public class swapSosed {
    public static void swap(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
        Integer pom;
        while (tmp!=null){
            pom=tmp.element;
            tmp.element=tmp.succ.element;
            tmp.succ.element=pom;
            if (tmp.succ==null)
                break;
            tmp=tmp.succ.succ;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int n = input.nextInt(); //br na jazli
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.nextInt());
        }
        swap(lista);
        System.out.println(lista.toString());
    }
}
