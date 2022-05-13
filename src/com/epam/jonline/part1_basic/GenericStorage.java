package com.epam.jonline.part1_basic;

public class GenericStorage<T> {
    T value;

    public GenericStorage(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean compare(GenericStorage<?>  genericStorage) {
        return this.getValue().equals(genericStorage.getValue());
    }
}
