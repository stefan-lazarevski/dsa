package SLL;
import java.util.Scanner;
//Input:
// 5
// 1->2->2->3->4
//Output:
// 1->3->4

public class RemoveReacurringNodes {

    public static void removeNodes(SLL<Integer> list1) {
        SLLNode<Integer> tmp1 = list1.getFirst();
        SLLNode<Integer> tmp2 = tmp1.succ;
        int isti = 1;
        while(tmp1.succ!=null) {
            while(tmp2!=null) {
                if(tmp1.element.equals(tmp2.element)){
                    list1.delete(tmp2);
                    isti++;
                }
                tmp2= tmp2.succ;
            }
            if(isti>1){
                list1.delete(tmp1);
            }
            isti = 1;
            tmp1 = tmp1.succ;
            if(tmp1==null) {
                break;
            }
            tmp2 = tmp1.succ;
        }
        System.out.println(list1.toString());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> list1 = new SLL<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list1.insertLast(input.nextInt());
        }
        removeNodes(list1);
    }
}
