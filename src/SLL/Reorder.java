package SLL;

import java.util.Scanner;


public class Reorder {
    public static void reorder(SLL<Integer> lista){
        
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
