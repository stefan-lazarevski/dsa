package DLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class BubbleSortDLL {
    static void bubbleSortDLL(DLL<Integer> list, int n) {
        DLLNode<Integer> node1 = list.getFirst();
        DLLNode<Integer> node2 = node1.succ;
        for (int i = 0; i < list.getSize() - 1; i++) {
            for (int j = i + 1; j < list.getSize(); j++) {
                if (node1.element > node2.element) {
                    int temp = node1.element;
                    node1.element = node2.element;
                    node2.element = temp;
                }
                node2 = node2.succ;
            }
            node1 = node1.succ;
            node2 = node1.succ;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DLL<Integer> list = new DLL<Integer>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            list.insertLast(in.nextInt());
        }
        bubbleSortDLL(list, n);
        DLLNode<Integer> node = list.getFirst();
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(node.element + " ");
            node = node.succ;
        }

    }
}

