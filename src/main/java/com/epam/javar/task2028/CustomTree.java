package com.epam.javar.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root = new Entry("elementName");

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException("Exception message");
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException("Exception message");
    }

    @Override
    public void add(int index, String element) {


    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException("Exception message");
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Exception message");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Exception message");
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException("Exception message");
    }


    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren = true;
        boolean availableToAddRightChildren = true;
        Entry parent;
        Entry leftChild;
        Entry rightChild;


        public Entry(String elementName) {
            this.elementName = elementName;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

    }

    public static void main(){

    }


}