package exercicio3;
import java.util.LinkedList;

public class MultiSetLinkedList<T> {
    private LinkedList<T> elements;

    public MultiSetLinkedList() {
        this.elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultiSetLinkedList<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(MultiSetLinkedList<T> other) {
        this.elements.addAll(other.elements);
    }
}
