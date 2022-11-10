package ch.yannickhohler.depa.iterator_composite.example_iterator.iterator;

import ch.yannickhohler.depa.iterator_composite.example_iterator.MenuItem;

import java.util.Iterator;

public class ArrayIterator implements Iterator<MenuItem> {

    private static int index = 0;
    private static MenuItem[] menuItems;

    public ArrayIterator(MenuItem[] items) {
        menuItems = items;
    }

    @Override public boolean hasNext() {
        return ( index < menuItems.length && menuItems[index] != null );
    }

    @Override public MenuItem next() {
        if(!hasNext()) throw new IndexOutOfBoundsException();

        return menuItems[index++];
    }
}
