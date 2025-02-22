package SLL;

import java.util.Scanner;

public class AritmetichkaSekojDva {

    public static void vmetni_as(SLL<Float> lista){
        SLLNode<Float> tmp1 = lista.getFirst();
        SLLNode<Float> tmp2 = tmp1.succ;
        float broj;
        while(tmp2!=null) {
            broj = (float) ((tmp1.element + tmp2.element)/ 2.0);
            lista.insertBefore(broj,tmp2);
            tmp1=tmp2;
            tmp2=tmp1.succ;
        }
    }

    public static void main(String[] args) {
        SLL<Float> lista= new SLL<Float>();
        Scanner input= new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String[] broevi= input.nextLine().split("\\s+");
        for(int i=0;i<n;i++){
            lista.insertLast(Float.parseFloat(broevi[i]));
        }
        vmetni_as(lista);
        System.out.println(lista);
    }
}
