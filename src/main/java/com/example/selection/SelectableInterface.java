package com.example.selection;

public interface SelectableInterface<IdType> {
    IdType getId();
    void setSelected(boolean selectionState);
    boolean isSelected();
}
