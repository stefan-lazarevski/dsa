package DLL;

import java.util.Scanner;

public class ListSort {
public static void sort(DLL<Integer> list1, DLL<Integer> list2){
    DLL<Integer> list = new DLL<Integer>();
    DLLNode<Integer> tmp1 = list1.getFirst();
    DLLNode<Integer> tmp2 = list2.getLast();

    while(tmp1!=null && tmp2!=null) {
        if(tmp1.element >= tmp2.element) {
            list.insertLast(tmp2.element);
            tmp2 = tmp2.pred;
        } else {
            list.insertLast(tmp1.element);
            tmp1 = tmp1.succ;
        }
    }
    while(tmp1!=null) {
        list.insertLast(tmp1.element);
        tmp1 = tmp1.succ;
    }
    while(tmp2!=null) {
        list.insertLast(tmp2.element);
        tmp2= tmp2.pred;
    }
    System.out.println(list.toString());
    list.mirror();
    System.out.println(list.toString());
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        DLL<Integer> list1 = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list1.insertLast(tmp);
        }
        DLL<Integer> list2 = new DLL<Integer>();
        for (int i = 0; i < m; i++) {
            int tmp = in.nextInt();
            list2.insertLast(tmp);
        }
        sort(list1, list2);
    }
}
