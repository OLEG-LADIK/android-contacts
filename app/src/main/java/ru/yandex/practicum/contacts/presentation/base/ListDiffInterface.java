package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    //T itemToPutIntoMethod;
    boolean theSameAs(T itemToPutIntoMethod);

    boolean equals(Object o);
}
