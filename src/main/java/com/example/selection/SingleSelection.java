package com.example.selection;

public class SingleSelection implements SelectionType {

    private static final SingleSelection instance = new SingleSelection();

    @Override
    public boolean isSingleSelection() {
        return true;
    }

    public static SingleSelection getInstance() {
        return instance;
    }
}
