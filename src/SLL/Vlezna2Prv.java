package SLL;

import java.util.Scanner;

public class Vlezna2Prv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        SLL<String> lista = new SLL<String>();
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.next());
        }
        System.out.println(lista);
        putWordsTogether(lista);
        System.out.println(lista);
    }

    public static void putWordsTogether(SLL<String> lista) {
        SLLNode<String> first = lista.getFirst();
        StringBuilder p = new StringBuilder();
        SLL<String> pom = new SLL<String>(); //kajsho ke prajme izmena
        while (first != null) {
            if (!first.element.equals(",")) {
                p.append(first.element);
            }
            else {
                pom.insertLast(p.toString());
                p = new StringBuilder();
            }
            first = first.succ;
        }
        pom.insertLast(p.toString());
        first = pom.getFirst();
        lista.deleteList();
        while (first != null) {
            lista.insertLast(first.element);
            first = first.succ;
        }
    }
}
