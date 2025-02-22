package SLL;

import java.util.Scanner;

public class DeleteProgress {
    public static void izbrishi(SLL<Integer> lista){
        SLLNode<Integer> tmp=lista.getFirst();
        int kolku=1;
        while (tmp!=null){
            for (int i=0; i<kolku; i++){
                tmp=tmp.succ;
            }
            lista.delete(tmp);
            kolku++;
            tmp=tmp.succ;
        }
        System.out.println(lista.toString());
    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>();
        int n = input.nextInt();
        for (int i=0; i<n; i++){
            lista.insertLast(input.nextInt());
        }
        izbrishi(lista);
    }
}
