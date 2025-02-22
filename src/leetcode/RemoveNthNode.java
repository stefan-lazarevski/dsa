package leetcode;

import java.util.Scanner;

public class RemoveNthNode {
    public static void removeNode(SLL<Integer> list, int key) {
        SLLNode<Integer> tmp = list.getFirst();
        Integer pom;
        while(tmp!=null) {
            if(tmp.element.equals(key)){
                pom = tmp.element;
                list.delete(tmp);
            }
            tmp = tmp.succ;
        }
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.insertLast(input.nextInt());
        }
        int key = input.nextInt();
        removeNode(list, key);
    }
}
