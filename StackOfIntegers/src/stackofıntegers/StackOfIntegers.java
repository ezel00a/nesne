
package stackofıntegers;


import java.util.ArrayList;

public class StackOfIntegers {
    private ArrayList<Integer> liste = new ArrayList<>();

    public void push(int sayi) {
        liste.add(sayi);
    }

    public int pop() {
        return liste.remove(liste.size() - 1);
    }

    public boolean empty() {
        return liste.isEmpty();
    }
}