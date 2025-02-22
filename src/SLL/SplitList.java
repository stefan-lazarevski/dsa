package SLL;

import java.util.Scanner;

public class SplitList {
    public static void split(SLL<Integer> lista){
        SLL<Integer> list1 = new SLL<Integer>();
        SLL<Integer> list2 = new SLL<Integer>();
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> tmp1 = lista.getFirst();
        SLLNode<Integer> tmp2 = lista.getFirst();

        while(tmp!=null) {
            if(tmp.element % 2 == 0) {
                tmp1=tmp.succ;
                while(tmp1!=null && tmp1.element % 2==0){
                    tmp=tmp.succ;
                    tmp1=tmp1.succ;
                }
                list1.insertLast(tmp.element);
            }
            else {
                tmp2=tmp.succ;
                while(tmp2!=null && tmp2.element % 2!=0){
                    tmp=tmp.succ;
                    tmp2=tmp2.succ;
                }
                list2.insertLast(tmp.element);
            }
            tmp=tmp.succ;
        }
        System.out.println(list1.toString());
        System.out.println(list2.toString());

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>(); //kreirame prazna lista
        int n = input.nextInt(); //br na jazli
        for (int i = 0; i < n; i++) {
            lista.insertLast(input.nextInt());
        }
        split(lista);
    }
}
