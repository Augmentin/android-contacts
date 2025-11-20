package ru.yandex.practicum.contacts.presentation.base;


public interface ListDiffInterface<T extends ListDiffInterface> {
    public boolean theSameAs(T newItem);


    public boolean equals(Object newItem);

}
