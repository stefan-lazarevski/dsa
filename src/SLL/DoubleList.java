package SLL;

import java.util.Scanner;

public class DoubleList {
    public static void doubleList(SLL<Integer> lista){
        SLLNode<Integer> tmp = lista.getFirst();
        String pom = new String();
        while(tmp!=null) {
            pom += tmp.element;
            tmp=tmp.succ;
        }
        Integer broj = Integer.parseInt(pom);
        broj = broj * 2;
        lista.deleteList();
        while(broj > 0) {
            lista.insertLast(broj%10);
            broj = broj / 10;
        }
        lista.mirror();
        System.out.println(lista.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int n = input.nextInt(); //br na jazli
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.nextInt());
        }
        doubleList(lista);
    }
}
