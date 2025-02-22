package leetcode;
import java.util.Scanner;
public class AlternatelyDeleteElements {
    public static void keepDelete(SLL<Integer> list1, int m, int n){
        SLLNode<Integer> tmp = list1.getFirst();
        int counter = 0;

        while(tmp!=null) {
            while(counter <= m){
                if(counter == m) {
                    break;
                }
                counter++;
                tmp = tmp.succ;
            }
            counter = 0;


            if(tmp!=null) {
                while(counter <= n){
                    if(counter ==n) {
                        break;
                    }
                    list1.delete(tmp);
                    counter++;
                    tmp = tmp.succ;
                }
            }
            counter = 0;
        }

    }

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int numElements;
        SLL<Integer> list1 = new SLL<Integer>();
        numElements = scan.nextInt();
        for(int i = 0; i<numElements; i++) {
            list1.insertLast(scan.nextInt());
        }
        int m = scan.nextInt();
        int n = scan.nextInt();
        keepDelete(list1,m,n);
        System.out.println(list1);
    }
}
