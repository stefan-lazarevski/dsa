package SLL;

import java.util.Scanner;

public class deleteMiddleOddEven {
    public static void deleteMiddle(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
            if(lista.size() % 2 == 0) {
                for(int i = 0; i<lista.size()/2;i++) {
                    tmp = tmp.succ;
                }
                lista.delete(tmp);
            } else {
                for (int i=0; i<lista.size() / 2; i++) {
                    tmp = tmp.succ;
                }
                lista.delete(tmp);
            }
        System.out.println(lista.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int n = input.nextInt(); //br na jazli
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.nextInt());
        }
        deleteMiddle(lista);
    }
}
