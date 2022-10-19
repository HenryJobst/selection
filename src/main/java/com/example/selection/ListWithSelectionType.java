package com.example.selection;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ListWithSelectionType<EntityType> extends ArrayList<EntityType> implements SelectionType {
    private final SelectionType selectionType;

    public ListWithSelectionType(SelectionType selectionType) {
        super();
        this.selectionType = selectionType;
    }

    public ListWithSelectionType(List<EntityType> container, SelectionType selectionType) {
        super(container);
        this.selectionType = selectionType;
    }

    public ListWithSelectionType(List<EntityType> container) {
        super(container);
        this.selectionType = MultiSelection.getInstance();
    }

    @Override
    public boolean isSingleSelection() {
        return selectionType.isSingleSelection();
    }
}
