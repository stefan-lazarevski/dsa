package DLL;

import java.util.Scanner;

public class CountTripple {
    public static void coupleTripple(DLL<Integer> list, int value){
        DLLNode<Integer> tmp1 = list.getFirst();
        DLLNode<Integer> tmp2 = tmp1.succ;
        DLLNode<Integer> tmp3 = tmp2.succ;

        int counter = 0;
        while(tmp1.succ!=null) {
            while(tmp2.succ!=null) {
                while(tmp3!=null) {
                    if(tmp1.element + tmp2.element + tmp3.element == value) {
                        counter++;
                    }
                    tmp3 = tmp3.succ;
                }
                tmp2 = tmp2.succ;
                tmp3 = tmp2.succ;
            }
            tmp1 = tmp1.succ;
            tmp2 = tmp1.succ;
            if(tmp2 == null) {
                break;
            }
            tmp3 = tmp2.succ;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list.insertLast(tmp);
        }
        int value = in.nextInt();
        coupleTripple(list, value);
    }
}
