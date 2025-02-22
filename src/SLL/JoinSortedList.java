package SLL;

//метод за спојување на две подредени единечно поврзани листи во една подредена поврзана листа
public class JoinSortedList<E extends Comparable<E>> {

    public SLL<E> joinSortedList(SLL<E> firstList, SLL<E> secondList) {
        SLL<E> result = new SLL<E>();
        SLLNode<E> tmpFirst = firstList.getFirst();
        SLLNode<E> tmpSecond = secondList.getFirst();

        while (tmpFirst != null && tmpSecond != null) {
            if(tmpFirst.element.compareTo(tmpSecond.element) < 0) {
                result.insertLast(tmpFirst.element);
                tmpFirst = tmpFirst.succ;
            } else {
                result.insertLast(tmpSecond.element);
                tmpSecond = tmpSecond.succ;
            }
        }

        while (tmpFirst != null) {
            result.insertLast(tmpFirst.element);
            tmpFirst = tmpFirst.succ;
        }

        while (tmpSecond != null) {
            result.insertLast(tmpSecond.element);
            tmpSecond = tmpSecond.succ;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
