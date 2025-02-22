package DLL;

import java.util.Scanner;
//Input:
// 14 elements
//2
//3
//4
//5
//2
//4
//5
//7
//5
//9
//2
//3
//4
//13
// 2<->3<->5<->4<->5<->2<->4<->15<->5<->7<->5<->9<->2<->28<->3<->4<->13<->20
public class SumOfNextNodes {
    public static void sumNodes(DLL<Integer> list1) {
        DLLNode<Integer> tmp1 = list1.getFirst();
        DLL<Integer> pom = new DLL<Integer>();
        Integer broj;
        Integer zbir;
        while(tmp1!=null) {
            broj = tmp1.element;
            zbir = 0;
            for (int i = 0 ; i < broj ; i++) {
                zbir = zbir + tmp1.element;
                tmp1 = tmp1.succ;
            }
            if(tmp1 == null) {
                list1.insertLast(zbir);
                break;
            }
            list1.insertBefore(zbir, tmp1);
        }
        System.out.println(list1.toString());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list1 = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list1.insertLast(tmp);
        }
        sumNodes(list1);
    }
}
