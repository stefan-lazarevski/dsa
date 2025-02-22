package DLL;
import java.util.Scanner;

public class SporedbiBezGranici {
    public static void sporedba(DLL<Integer> list){
        DLLNode<Integer> tmp1 = list.getFirst();
        DLLNode<Integer> tmp2 = list.getLast();
        DLL<Integer> pom = new DLL<Integer>();
        Integer broj;
        while(tmp1!=null) {
            broj = tmp1.element + tmp2.element;
            pom.insertLast(broj);
            if(tmp1.element >= tmp2.element) {
                pom.insertLast(tmp1.element);
            } else {
                pom.insertLast(tmp2.element);
            }
            tmp1 = tmp1.succ;
            if(tmp1 == tmp2) {
                break;
            }
            tmp2 = tmp2.pred;
            if(tmp1 == tmp2) {
                pom.insertLast(tmp1.element);
                break;
            }
        }
        if(list.getSize() % 2 != 0) {
            tmp1 = tmp1.succ;
        }
        while(tmp1!=null) {
            pom.insertLast(tmp1.element);
            tmp1 = tmp1.succ;
        }
        System.out.println(pom);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list.insertLast(tmp);
        }
        sporedba(list);
    }
}
