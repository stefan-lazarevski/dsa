package SLL;

import java.util.Scanner;

public class ZigZagKolok {
    public static void zigzag(SLL<Integer> list){

        //TODO: implement function
            SLLNode<Integer> prev=list.getFirst();
            while(prev.element==0)
            {
                list.delete(prev);
                if(prev.succ!=null)
                    prev=prev.succ;
                else break;
            }
            for(SLLNode<Integer> node=prev.succ; node!=null; node=node.succ)
            {
                if(node.element==0) {
                    list.delete(node);
                }

                if(prev.element<0 && node.element<0)
                {
                    SLLNode<Integer> n = new SLLNode<Integer>(prev.element*-1,node);
                    prev.succ=n;
                }
                if(node.element>0 && prev.element>0) {
                    list.delete(node);
                }
                else prev=node;
            }
        }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        SLL<Integer> list = new SLL<Integer>();

        for(int i=0;i<n;i++) {
            list.insertLast(input.nextInt());
        }

        System.out.println(list);

        zigzag(list);

        System.out.println(list);
    }
}

