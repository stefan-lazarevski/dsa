package SLL;

import java.util.Scanner;

//Input: 5 1->2->2->3->4 key=2
//Output: 1->3->4

public class DeleteDupsPartTwo {
    public static void deleteDup(SLL<Integer> lista, int key){
        SLLNode<Integer> tmp1 = lista.getFirst();

        while(tmp1!=null){
            if(tmp1.element.equals(key)){
                lista.delete(tmp1);
            }
            tmp1=tmp1.succ;
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
        int key = input.nextInt();
        deleteDup(lista, key);
    }
}
