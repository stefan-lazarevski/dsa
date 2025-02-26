package SLL;

/*
Дадена е еднострано поврзана листа чии што јазли содржат по еден природен број.
Дополнително, даден е и уште еден природен број M (M>1). Треба од дадената листа да се избрише секој M-ти елемент.
Влез: Во првиот ред од влезот е даден бројот на елементи во листата, па во следниот ред се дадени самите елементи од листата.
На крај, во последниот ред е даден бројот M.
Излез: На излез треба да се испечати променетата листа, со избришан секој M-ти елемент.
Внимавајте:
1. Даден е целосниот код на структурата којашто треба да се користи. Дадена е и тест класата SpecialSLLDelete.java, со целосно имплементиран input и output.
Потребно е да се менува само во рамки на void specialDelete(SLL<Integer> list, int m) функцијата.
2. Не смее да менувате во main функцијата !
 */

//LAB2.3
public class SpecialSLLDelete<E> {

    public void specialDelete(SLL<E> list, int m){
        SLLNode<E> temp = list.getFirst();
        int position=0;
        while (temp!=null){
            position++;
            if (position % m==0){
                list.delete(temp);
            }
            temp=temp.succ;
        }
    }
}
