package com.example.selection;

import java.util.Collections;
import java.util.Objects;

public class EntityOnlyChildrenSelection {
    public static <EntityType extends SelectableInterface<IdType>, IdType>
    void select(ListWithSelectionType<EntityType> list, IdType id, boolean selectState) {
        for (EntityType entry : Collections.unmodifiableList(list)) {
            if (Objects.equals(entry.getId(), id)) {
                entry.setSelected(selectState);
                if (list.isSingleSelection() && selectState) {
                    // unselect other
                    for (EntityType otherEntry : Collections.unmodifiableList(list)) {
                        if (otherEntry.isSelected() && !Objects.equals(otherEntry.getId(), id)) {
                            otherEntry.setSelected(false);
                        }
                    }
                }
                break;
            }
        }
    }
}
