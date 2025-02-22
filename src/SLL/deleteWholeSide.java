package SLL;

import java.util.Scanner;

public class deleteWholeSide {
    public static void deleteMiddle(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
        if(lista.size() % 2 == 0) {
            for(int i = 0; i<lista.size()/2+1;i++) {
                lista.delete(tmp);
                tmp = tmp.succ;
            }
        } else {
            for (int i=0; i<lista.size() / 2; i++) {
                lista.delete(tmp);
                tmp = tmp.succ;
            }
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
