package com.example.selection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityOnlyChildrenSelectionTest {

    @Test
    void testSelectForMultiSelection() {
        ListWithSelectionType<Selectable<Integer>> listWithMultiSelectionType = new ListWithSelectionType<>(MultiSelection.getInstance());
        listWithMultiSelectionType.add(new Selectable<>(1));
        listWithMultiSelectionType.add(new Selectable<>(2));

        assertFalse(listWithMultiSelectionType.get(0).isSelected());
        assertFalse(listWithMultiSelectionType.get(1).isSelected());

        EntityOnlyChildrenSelection.select(listWithMultiSelectionType, 1, true);
        assertTrue(listWithMultiSelectionType.get(0).isSelected());

        EntityOnlyChildrenSelection.select(listWithMultiSelectionType, 2, true);
        assertTrue(listWithMultiSelectionType.get(1).isSelected());
        assertTrue(listWithMultiSelectionType.get(0).isSelected());
    }

    @Test
    void testSelectForSingleSelection() {
        ListWithSelectionType<Selectable<Integer>> listWithSingleSelectionType = new ListWithSelectionType<>(SingleSelection.getInstance());
        listWithSingleSelectionType.add(new Selectable<>(1));
        listWithSingleSelectionType.add(new Selectable<>(2));

        assertFalse(listWithSingleSelectionType.get(0).isSelected());
        assertFalse(listWithSingleSelectionType.get(1).isSelected());

        EntityOnlyChildrenSelection.select(listWithSingleSelectionType, 1, true);
        assertTrue(listWithSingleSelectionType.get(0).isSelected());

        EntityOnlyChildrenSelection.select(listWithSingleSelectionType, 2, true);
        assertTrue(listWithSingleSelectionType.get(1).isSelected());
        assertFalse(listWithSingleSelectionType.get(0).isSelected());
    }
}