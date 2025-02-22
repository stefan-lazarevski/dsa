package SLL;

import java.util.Scanner;
//Vlez: 8 elementi
// 1 2 3 4 5 6 7 8
// k = 3
// 3->2->1->6->5->4->7->8
public class FlipKthNodes {
    public static void reverse(SLL<Integer> lista, int k) {
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> tmp2 = null;
        int br=0;
        SLL<Integer> pom1 = new SLL<Integer>();
        SLL<Integer> pom2 = new SLL<Integer>();
        while (tmp != null && lista.size()-br>k) {
            for (int i = 0; i < k; i++) {
                pom1.insertLast(tmp.element);
                tmp = tmp.succ;
                br++;
            }
            pom1.mirror();
            tmp2 = pom1.getFirst();
            for (int i = 0; i < k; i++) {
                pom2.insertLast(tmp2.element);
                tmp2 = tmp2.succ;
            }
            pom1.deleteList();
        }
        while (tmp!=null){
            pom2.insertLast(tmp.element);
            tmp=tmp.succ;
        }
        System.out.println(pom2);
    }


    public static void main(String[] args) {
        SLL<Integer> lista1 = new SLL<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            lista1.insertLast(input.nextInt());
        }
        int k = input.nextInt();
        reverse(lista1, k);
    }
}
