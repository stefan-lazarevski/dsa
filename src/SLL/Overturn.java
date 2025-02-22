package SLL;

import java.util.Scanner;

public class Overturn {
    public static void prevrti (SLL<String> lista){
        SLLNode<String> tmp = lista.getFirst();

        SLL<String> finalna= new SLL<String>();

        while (tmp!=null){
            String s= tmp.element;
            String nov= new String();
            for (int j=s.length()-1; j>=0; j--){
                nov+=s.charAt(j);
            }
            finalna.insertLast(nov);
            tmp=tmp.succ;
        }
        SLLNode<String> tmpf= finalna.getFirst();
        lista.deleteList();
        while (tmpf!=null){
            lista.insertLast(tmpf.element);
            tmpf=tmpf.succ;
        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String[] zborovi= input.nextLine().split("\\s+");
        SLL<String> lista= new SLL<String>();
        for(int i=0;i<n;i++){
            lista.insertLast(zborovi[i]);
        }
        prevrti(lista);
        System.out.println(lista);
    }
}


