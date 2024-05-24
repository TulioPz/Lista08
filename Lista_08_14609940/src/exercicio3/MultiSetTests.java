package exercicio3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiSetTests {

    @Test
    public void testAddAndEqualsArrayList() {
        MultiSetArrayList<Integer> ms1 = new MultiSetArrayList<>();
        ms1.add(1);
        ms1.add(2);

        MultiSetArrayList<Integer> ms2 = new MultiSetArrayList<>();
        ms2.add(1);
        ms2.add(2);

        assertTrue(ms1.equals(ms2));
    }

    @Test
    public void testAddAllArrayList() {
        MultiSetArrayList<Integer> ms1 = new MultiSetArrayList<>();
        ms1.add(1);
        MultiSetArrayList<Integer> ms2 = new MultiSetArrayList<>();
        ms2.add(2);
        ms1.addAll(ms2);
        
        MultiSetArrayList<Integer> expected = new MultiSetArrayList<>();
        expected.add(1);
        expected.add(2);
        
        assertTrue(ms1.equals(expected));
    }

    @Test
    public void testAddAndEqualsHashSet() {
        MultiSetHashSet<Integer> ms1 = new MultiSetHashSet<>();
        ms1.add(1);
        ms1.add(2);

        MultiSetHashSet<Integer> ms2 = new MultiSetHashSet<>();
        ms2.add(1);
        ms2.add(2);

        assertTrue(ms1.equals(ms2));
    }

    @Test
    public void testAddAllHashSet() {
        MultiSetHashSet<Integer> ms1 = new MultiSetHashSet<>();
        ms1.add(1);
        MultiSetHashSet<Integer> ms2 = new MultiSetHashSet<>();
        ms2.add(2);
        ms1.addAll(ms2);
        
        MultiSetHashSet<Integer> expected = new MultiSetHashSet<>();
        expected.add(1);
        expected.add(2);
        
        assertTrue(ms1.equals(expected));
    }

    @Test
    public void testAddAndEqualsLinkedList() {
        MultiSetLinkedList<Integer> ms1 = new MultiSetLinkedList<>();
        ms1.add(1);
        ms1.add(2);

        MultiSetLinkedList<Integer> ms2 = new MultiSetLinkedList<>();
        ms2.add(1);
        ms2.add(2);

        assertTrue(ms1.equals(ms2));
    }

    @Test
    public void testAddAllLinkedList() {
        MultiSetLinkedList<Integer> ms1 = new MultiSetLinkedList<>();
        ms1.add(1);
        MultiSetLinkedList<Integer> ms2 = new MultiSetLinkedList<>();
        ms2.add(2);
        ms1.addAll(ms2);
        
        MultiSetLinkedList<Integer> expected = new MultiSetLinkedList<>();
        expected.add(1);
        expected.add(2);
        
        assertTrue(ms1.equals(expected));
    }

    @Test
    public void testAddAndEqualsStack() {
        MultiSetStack<Integer> ms1 = new MultiSetStack<>();
        ms1.add(1);
        ms1.add(2);

        MultiSetStack<Integer> ms2 = new MultiSetStack<>();
        ms2.add(1);
        ms2.add(2);

        assertTrue(ms1.equals(ms2));
    }

    @Test
    public void testAddAllStack() {
        MultiSetStack<Integer> ms1 = new MultiSetStack<>();
        ms1.add(1);
        MultiSetStack<Integer> ms2 = new MultiSetStack<>();
        ms2.add(2);
        ms1.addAll(ms2);
        
        MultiSetStack<Integer> expected = new MultiSetStack<>();
        expected.add(1);
        expected.add(2);
        
        assertTrue(ms1.equals(expected));
    }
}
