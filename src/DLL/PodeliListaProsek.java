package DLL;

import java.util.Scanner;

public class PodeliListaProsek {

    public static void podeli(DLL<Integer> list) {
        DLL<Integer> list1 = new DLL<Integer>();
        DLL<Integer> list2 = new DLL<Integer>();
        DLLNode<Integer> tmp1 = list.getFirst();
        double prosek = 0.0;
        while(tmp1!=null) {
              prosek += tmp1.element;
                tmp1 = tmp1.succ;
            }
        tmp1 = list.getFirst();
        prosek = prosek / list.getSize();
        while(tmp1!=null) {
            if(tmp1.element <= prosek) {
                list1.insertFirst(tmp1.element);
            } else {
                list2.insertFirst(tmp1.element);
            }
            tmp1 = tmp1.succ;
        }
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list.insertLast(tmp);
        }
        podeli(list);
    }
}
