package com.example.selection;

public class Selectable<IdType> implements SelectableInterface<IdType>
{
    @Override
    public IdType getId() {
        return id;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    private final IdType id;
    private boolean selected;

    public Selectable(IdType id) {
        this.id = id;
    }
}
