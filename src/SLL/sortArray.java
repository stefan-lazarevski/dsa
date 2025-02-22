package SLL;

import java.util.Scanner;
//Input: 5 1 -1 2 -3 -3
//Output: 2
public class sortArray {
    public static void soorrtedArray(SLL<Integer> lista) {
        SLLNode<Integer> tmp1 = lista.getFirst();
        SLLNode<Integer> tmp2 = tmp1.succ;


        while(tmp1.succ!=null) {
            while(tmp2!=null){
                if(tmp1.element + tmp2.element == 0) {
                    lista.delete(tmp1);
                    lista.delete(tmp2);
                }
                tmp2 = tmp2.succ;
            }
            tmp1 = tmp1.succ;
            tmp2 = tmp1.succ;
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
        soorrtedArray(lista);
    }
}
