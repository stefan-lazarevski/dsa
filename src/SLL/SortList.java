package SLL;

import java.util.Scanner;

public class SortList {
    public static void sorted(SLL<Integer> lista){
        SLLNode<Integer> tmp1 =  lista.getFirst();
        SLLNode<Integer> tmp2 =  tmp1.succ;
        Integer pom;

        while(tmp1.succ!=null){
            while(tmp2!=null){
                if(tmp1.element >= tmp2.element){
                    pom = tmp1.element;
                    tmp1.element = tmp2.element;
                    tmp2.element = pom;
                }
                tmp2= tmp2.succ;
            }
            tmp1=tmp1.succ;
            tmp2= tmp1.succ;
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
        sorted(lista);
    }
}
