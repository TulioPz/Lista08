package exercicio3;

import java.util.Stack;

public class MultiSetStack<T> {
    private Stack<T> elements;

    public MultiSetStack() {
        this.elements = new Stack<>();
    }

    public void add(T element) {
        elements.push(element);
    }

    public boolean equals(MultiSetStack<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(MultiSetStack<T> other) {
        this.elements.addAll(other.elements);
    }
}
