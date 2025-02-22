package SLL;

import java.util.Scanner;

public class DeleteLastSeen {
    public static void lastseen(int n, SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> ednakvo= tmp;
        while (tmp != null) {
            if (tmp.element.equals(n)){
                ednakvo=tmp;
            }
            tmp = tmp.succ;
        }
        lista.delete(ednakvo);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int jazli = input.nextInt(); //br na jazli
        for (int i = 0; i < jazli; i++) {
            lista.insertLast(input.nextInt());
        }
        int n = input.nextInt();
        lastseen(n, lista);
        System.out.println(lista.toString());
    }
}
