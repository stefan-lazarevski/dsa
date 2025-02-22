package DLL;

import java.util.Scanner;

public class SplitVowelsAndConsonants {
    public static void split(DLL<String> lista){
        DLLNode<String> tmp1 = lista.getFirst();
        DLLNode<String> tmp2 = lista.getLast();
        DLL<String> samoglaski = new DLL<String>();
        DLL<String> soglaski = new DLL<String>();

        while(tmp1!=tmp2 && tmp1.succ != tmp2) {
                if(tmp1.element.equals("a") || tmp1.element.equals("e") || tmp1.element.equals("i") || tmp1.element.equals("o")
                        || tmp1.element.equals("u")) {
                    samoglaski.insertLast(tmp1.element);
            } else {
                        soglaski.insertLast(tmp1.element);
                } if(tmp2.element.equals("a") || tmp2.element.equals("e") || tmp2.element.equals("i") || tmp2.element.equals("o")
                    || tmp2.element.equals("u")) {
                samoglaski.insertLast(tmp2.element);
            } else {
                soglaski.insertLast(tmp2.element);
            }
            tmp1 = tmp1.succ;
            tmp2 = tmp2.pred;
        }

        if(tmp1.element.equals("a") || tmp1.element.equals("e") || tmp1.element.equals("i") || tmp1.element.equals("o")
                || tmp1.element.equals("u")) {
            samoglaski.insertLast(tmp1.element);
        } else {
            soglaski.insertLast(tmp1.element);
        }

        System.out.println(samoglaski.toString());
        System.out.println(soglaski.toString());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        DLL<String> list = new DLL<String>();
        for (int i = 0; i < n; i++) {
            String tmp = in.nextLine();
            list.insertLast(tmp);
        }
        split(list);
    }
}
