package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>{



    @Nullable
    @Override
    public Object getChangePayload(@NonNull ListDiffInterface oldItem, @NonNull ListDiffInterface newItem) {
        return newItem;
    }

    @Override
    public boolean areItemsTheSame(@NonNull ListDiffInterface oldItem, @NonNull ListDiffInterface newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull ListDiffInterface oldItem, @NonNull ListDiffInterface newItem) {
        return oldItem.equals(newItem);
    }

}
