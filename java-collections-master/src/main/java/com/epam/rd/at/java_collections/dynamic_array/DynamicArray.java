package com.epam.rd.at.java_collections.dynamic_array;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray<T> {

    List<Integer> dynamicArray;

    public DynamicArray() {
        dynamicArray = new ArrayList<>();
    }

    public DynamicArray(int length) {
        dynamicArray = new ArrayList<>(length);
    }

    @SafeVarargs
    public DynamicArray(Integer... elements) {
        dynamicArray = new ArrayList<>();
        for(Integer i: elements) {
            dynamicArray.add(i);

        }
    }

    public void addElement(Integer element) {
        dynamicArray.add(element);
    }

    public void addElement(Integer element, int index) {
        try {
            dynamicArray.add(index, element);
        } catch (Exception e) {
            throw new IllegalArgumentException("10");
        }
    }

    public void setElement(int element, int index) {
        try {
            dynamicArray.remove(index);
            dynamicArray.add(index, element);
        } catch (Exception e) {
            throw new IllegalArgumentException("10");
        }
    }

    public int getElement(int index) {
        return dynamicArray.get(index);
    }

    public void removeElement(int index) {
        dynamicArray.remove(index);
    }

    public boolean containsElement(int element) {
       return dynamicArray.contains(element);
    }

    public int getSize() {
        return dynamicArray.size();
    }

    public String toString() {
        return dynamicArray.toString();

    }

}
