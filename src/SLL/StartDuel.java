package SLL;

/*
Во една мистична игра со карти, секоја карта е претставена со специфичен тип (int type), животна вредност (int health), и вредност за магична моќ (int magicPower).
Значајноста на една карта се одредува како производ од нејзината животна вредност и вредноста за магична моќ.

Двајца волжебници решаваат да се предизвикаат на дуел, т.ш. во две еднострано поврзани листи се чуваат податоците за картите кои им се доделени.
Во првата листа се чуваат картите доделени на првиот волжебник, а додека пак во втората се чуваат податоците за картите доделени на вториот волжебник.
И двајцата волшебници на почеток имаат точно 8 карти.

На самиот почетокот на дуелот, правилата налагаат првиот волшебник да ја предаде својата најдобра карта на другиот волшебник, т.ш. кога вториот волшебник ќе ја земе картата истата треба да ја постави во средина на своите карти.
Тоа значи дека потребно е од листата која ги чува картите на првиот волшебник да се отстрани (избрише) најдобрата карта и таа карта да се додаде на средина на листата каде што се чуваат картите на вториот волшебник.

Влез: Во секој еден ред се дадени податоци за една карта, одделени со празно место, во формат type health magicPower.
Притоа, прво се дадени картите на првиот волшебник, по што следуваат податоците за картите на вториот волшебник.
Излез: Во првиот ред type на сите карти на првиот пријател. Во вториот ред type на сите карти на вториот пријател.

Внимавајте:
1. Даден е целосниот код на структурата којашто треба да се користи. Дадена е и тест класата MysticalCardGame.java, со целосно имплементиран input и output.
Потребно е да се менува само во рамки на void startDuel(SLL<Card> firstSorcererCards, SLL<Card> secondSorcererCards) функцијата.
2. Не смее да менувате во main функцијата !
*/


class Card {
    private int type;
    private int health;
    private int magicPower;

    public Card(int type, int health, int magicPower) {
        this.type = type;
        this.health = health;
        this.magicPower = magicPower;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int significance() {
        return health * magicPower;
    }


    @Override
    public String toString() {
        return String.valueOf(type);
    }
}
//LAB2.2
public class StartDuel {

    public static void startDuel(SLL<Card> firstSorcererCards, SLL<Card> secondSorcererCards) {
        SLLNode<Card> best = firstSorcererCards.getFirst();
        SLLNode<Card> tmp = firstSorcererCards.getFirst().succ;
        while (tmp != null) {
            if (tmp.element.significance() > best.element.significance()) {
                best = tmp;
            }
            tmp = tmp.succ;
        }
        SLLNode<Card> tmp1 = secondSorcererCards.getFirst();
        for (int i = 0; i < 3; i++) {
            tmp1 = tmp1.succ;
        }
        secondSorcererCards.insertAfter(best.element, tmp1);
        firstSorcererCards.delete(best);
    }
}

