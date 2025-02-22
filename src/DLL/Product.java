package DLL;

import java.util.Scanner;

public class Product {

    public static void calculate(DLL<Integer> m, DLL<Integer> n){
            DLLNode<Integer> tmp1 = m.getFirst();
            DLLNode<Integer> tmp2 = n.getFirst();
            String pom = new String();
            String pom2 = new String();
            Integer diff;
            Integer sum;
            Integer product;
            float kolichnik;
            while(tmp1!=null) {
                pom += tmp1.element;
                tmp1 = tmp1.succ;
            }
            while(tmp2!=null) {
                pom2 += tmp2.element;
                tmp2 = tmp2.succ;
            }
            diff = Math.abs(Integer.parseInt(pom) - Integer.parseInt(pom2));
            sum = Integer.parseInt(pom) + Integer.parseInt(pom2);
            product = Integer.parseInt(pom) * Integer.parseInt(pom2);
            kolichnik = Float.parseFloat(pom) / Float.parseFloat(pom2);
            System.out.println(diff);
            System.out.println(sum);
            System.out.println(product);
            System.out.println(String.format("%.2f",kolichnik));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DLL<Integer> list1 = new DLL<Integer>();
        DLL<Integer> list2 = new DLL<Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            list1.insertLast(tmp);
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int tmp = in.nextInt();
            list2.insertLast(tmp);
        }
        calculate(list1, list2);
    }
}
