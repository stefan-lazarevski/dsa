package SLL;

import java.util.Scanner;

public class DupsDeleteEvenOrOdd {
    public static void deletedups(SLL<Integer> lista, int n){
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> pom = tmp;

        while(tmp!=null) {
            if(tmp.element.equals(n)){
                pom = tmp;
            }
            tmp = tmp.succ;
        }
        lista.delete(pom);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int jazli = input.nextInt(); //br na jazli
        for (int i = 0; i < jazli; i++) {
            lista.insertLast(input.nextInt());
        }
        int n = input.nextInt();
        deletedups(lista,n);
        System.out.println(lista.toString());
    }
}
