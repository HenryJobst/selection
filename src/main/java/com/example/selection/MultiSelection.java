package com.example.selection;

public class MultiSelection implements SelectionType {
    private static final MultiSelection instance = new MultiSelection();

    @Override
    public boolean isSingleSelection() {
        return false;
    }

    public static MultiSelection getInstance() {
        return instance;
    }
}
