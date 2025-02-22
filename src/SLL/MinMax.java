package SLL;

import java.util.Scanner;

public class MinMax {
    public static void minmax(SLL<Integer> lista){
        SLLNode<Integer> tmp= lista.getFirst();
        SLL<Integer> prva= new SLL<Integer>();
        SLL<Integer> vtora= new SLL<Integer>();
        int min=tmp.element;
        int max=tmp.element;
        while (tmp!=null){
            if (tmp.element>max){
                max=tmp.element;
            }
            if (tmp.element<min){
                min= tmp.element;
            }
            tmp=tmp.succ;
        }
        tmp=lista.getFirst();
        while (tmp!=null){
            if (tmp.element-min<=max-tmp.element){
                prva.insertLast(tmp.element);
            }
            else{
                vtora.insertLast(tmp.element);
            }
            tmp=tmp.succ;
        }
        System.out.println(prva.toString());
        System.out.println(vtora.toString());
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>();
        int n = input.nextInt();
        for (int i=0; i<n; i++){
            lista.insertLast(input.nextInt());
        }
        minmax(lista);
    }
}
