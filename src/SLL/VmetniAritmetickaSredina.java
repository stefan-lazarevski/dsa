package SLL;

public class VmetniAritmetickaSredina {

    public static void vmetni_as(SLL<Float> lista) {

        SLLNode<Float> temp1 = lista.getFirst();
        SLLNode<Float> temp2 = temp1.succ;

        float avg = 0;

        for(int i = 0; i< lista.size(); i++){
            avg = Math.abs(temp1.element - temp2.element);
            temp1 = temp1.succ;
            temp2 = temp2.succ;
            lista.insertBefore(avg, temp1);
        }

    }
}
