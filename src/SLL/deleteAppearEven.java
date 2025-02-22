package SLL;

import java.util.Scanner;

//juni 2021
public class deleteAppearEven {

        public static void deleteEven(SLL<Integer> list1) {
            //todo: enter code here
            SLLNode<Integer> tmp= list1.getFirst();
            SLLNode<Integer> tmp1= list1.getFirst();
            SLLNode<Integer> tmp2= tmp.succ;

            int n=0;
            int counter=1;
            while (tmp!=null){
                n++;
                tmp=tmp.succ;
            }
            tmp=list1.getFirst();

            for (int i=0; i<n-1; i++){
                counter=1;
                for (int j=i+1; j<n; j++){
                    if (tmp.element.equals(tmp2.element)){
                        counter++;
                    }
                    tmp2=tmp2.succ;
                }

                tmp1=tmp.succ;
                if (counter%2==0){
                    while(tmp1!=null){
                        if (tmp.element.equals(tmp1.element)){
                            list1.delete(tmp1);
                        }
                        tmp1=tmp1.succ;
                    }
                    list1.delete(tmp);
                    n=n-counter;
                }
                tmp=tmp.succ;
                tmp2=tmp.succ;
            }

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            SLL<Integer> list1 = new SLL<Integer>();

            //todo: enter code here
            for (int i=0; i<n; i++){
                list1.insertLast(scanner.nextInt());
            }


            deleteEven(list1);
            //todo: enter code here
            System.out.println(list1);
        }
    }


