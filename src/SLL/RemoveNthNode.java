package SLL;

import java.util.Scanner;

public class RemoveNthNode {

    public static void removeNode(SLL<Integer> list1,int key) {
        list1.mirror();
        SLLNode<Integer> tmp = list1.getFirst();


        while(key>1) {
            tmp=tmp.succ;
            key--;
        }
        list1.delete(tmp);
        list1.mirror();
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list1 = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list1.insertLast(input.nextInt());
        }
        int key = input.nextInt();
        removeNode(list1, key);
        System.out.println(list1.toString());
    }
}
