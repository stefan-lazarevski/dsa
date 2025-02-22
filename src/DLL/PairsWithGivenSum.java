package DLL;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

//Input: 7elem 1 2 4 5 6 8 9 key = 7
//Output: (6,1) , (5, 2) :D
public class PairsWithGivenSum {
    public static void pairs(DLL<Integer> list, int key) {
        DLLNode<Integer> tmp1 = list.getFirst();
        DLLNode<Integer> tmp2 = tmp1.succ;

        int flag = 0;

        while (tmp1.succ != null) {
            while (tmp2 != null) {
                if ((tmp1.element + tmp2.element) == key) {
                    System.out.print("(" + tmp2.element + ", " + tmp1.element + ")");
                    flag = 1;
                    break;
                }
                tmp2 = tmp2.succ;
            }
            if (flag == 1) break;
            tmp1 = tmp1.succ;
            tmp2 = tmp1.succ;
        }


        tmp1 = tmp1.succ;
        if (tmp1 == null) return;
        tmp2 = tmp1.succ;

        while (tmp1.succ != null) {
            while (tmp2 != null) {
                if ((tmp1.element + tmp2.element) == key) {
                    System.out.print(", (" + tmp2.element + ", " + tmp1.element + ")");
                    break;
                }
                tmp2 = tmp2.succ;
            }
            tmp1 = tmp1.succ;
            tmp2 = tmp1.succ;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list.insertLast(tmp);
        }
        int key = in.nextInt();
        pairs(list, key);
    }
}
