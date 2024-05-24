package exercicio3;
import java.util.HashSet;
import java.util.Set;

public class MultiSetHashSet<T> {
    private Set<T> elements;

    public MultiSetHashSet() {
        this.elements = new HashSet<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MultiSetHashSet<T> other) {
        return this.elements.equals(other.elements);
    }

    public void addAll(MultiSetHashSet<T> other) {
        this.elements.addAll(other.elements);
    }
}
