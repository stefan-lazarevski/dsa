/*Задача 2. Замени соседи
        Дадена е еднострано поврзана листа чии што jазли содржат по еден природен
        броj. Да се трансформира листата така што секоj соседен пар jазли ´ке си ги
        заменат местата (првиот со вториот, па третиот со четвртиот итн...).
        Влез: Во првата линиjа е даден броjот на елементи n. Во следните n линии
        се дадени елементите на листата.
        Излез: На излез треба да се испечатат jазлите на резултантната листа.
        Пример.
        Влез:
        4
        1
        2
        3
        4
        Излез:
        2->1->4->3 */

package SLL;
import java.util.Scanner;
public class SwapPairs {
    public static void swapPairs(SLL<Integer> lista) {
        SLLNode<Integer> tmp = lista.getFirst();
        SLLNode<Integer> prev = null;
        Integer pom;
        int golemina = lista.size();
        if(golemina % 2 == 0) {
            while(tmp != null && tmp.succ != null) {
                pom = tmp.element;
                tmp.element = tmp.succ.element;
                tmp.succ.element =pom;
                prev = tmp.succ;
                tmp = prev.succ;
            }
            System.out.println(lista.toString());
        } else {
            System.out.println("Listata e neparna");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SLL<Integer> lista = new SLL<Integer>();
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i <n; i++) {
            lista.insertLast(input.nextInt());
        }
        swapPairs(lista); //ova mi e funkcijata so Integer
        //lista.swapPairs(); ovde se povikuva funkcijata sho e iskomentirana svo SLL
        //static funkcii ne primaat tip E (<E>);
    }
}
