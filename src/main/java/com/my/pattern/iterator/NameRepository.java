package com.my.pattern.iterator;

public class NameRepository implements Container{

    String[] names = {"tony","jenny","gogo"};

    @Override
    public Iterator getIterator() {
        return new NameContainer() ;
    }

    private class NameContainer implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
