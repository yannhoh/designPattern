package ch.yannickhohler.depa.fragile_baseclass_problem.example.problem;

import java.util.Collection;
import java.util.HashSet;

// Eigene Hashset Klasse implementieren welche die hinzugefügten Elemente zählt.
// Fehlerhaft – Inadäquate Verwendung der Vererbung!
public class InstrumentedHashSetFail<E> extends HashSet<E> {
    // Zahl der versuchten Elementeinfügungen
    private int addCount = 0;

    public InstrumentedHashSetFail() {
    }

    public InstrumentedHashSetFail(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    // Dies ruft das add() von der Superklasse auf was zu einem doppelten zählen führt.
    // Problem, weil man abhängig ist von der Baseclass.
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
