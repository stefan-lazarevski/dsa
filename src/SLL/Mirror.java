package SLL;
import java.util.Scanner;

public class Mirror<E>{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        SLL<String> list= new SLL<String>();
        input.nextLine();
        for (int i=0; i<n; i++){
            list.insertLast(input.nextLine());
        }
        System.out.println(list.toString());
        list.mirror();
        System.out.println("Transformiranata lista e");
        System.out.println(list);

    }

}