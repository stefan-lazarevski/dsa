package DLL;

import java.util.Scanner;

public class removeApperingDups {
    public static void removeDups(DLL<Integer> list) {
        DLLNode<Integer> tmp1 = list.getFirst();
        DLLNode<Integer> tmp2 = tmp1.succ;

        while (tmp1.succ != null) {
            while (tmp2 != null) {
                if (tmp1.element.equals(tmp2.element)) {
                    list.delete(tmp2);
                }
                tmp2=tmp2.succ;
            }
            tmp1 = tmp1.succ;
            if(tmp1 == null){
                break;
            }
            tmp2 = tmp1.succ;
        }
        System.out.println(list.toString());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list.insertLast(tmp);
        }
        removeDups(list);
    }
}
