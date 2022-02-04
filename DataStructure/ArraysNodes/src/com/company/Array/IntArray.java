package com.company.Array;

import java.util.Arrays;

public class IntArray implements Cloneable{
    private int [] data;
    private int manyItems;

    public IntArray() {
        final int INITIAL_CAPACITY = 10;
        data = new int[INITIAL_CAPACITY];
        manyItems = 0;
    }

    public IntArray(int initialCapacity){
        if(initialCapacity < 0)
            throw new IllegalArgumentException("The initialCapacity is less then zero" + initialCapacity);
        data = new int[initialCapacity];
        manyItems = 0;

    }

    public void add(int element){
        if(manyItems == data.length && manyItems > 10) {
            ensureCapacity((manyItems + 1) * 2);
        }
        data[manyItems] = element;
        manyItems++;
    }

    public void addMany(int... elements){
        if(manyItems + elements.length > data.length){
            ensureCapacity((manyItems + elements.length) * 2);
        }

        System.arraycopy(elements,0, data, manyItems, elements.length);
        manyItems += elements.length;
    }

    public void addAll(IntArray arrayBag){
        if (arrayBag.manyItems == 0)
            throw new NullPointerException("The bag is empty");
        ensureCapacity(manyItems + arrayBag.manyItems);
        System.arraycopy(arrayBag.data, 0, data, manyItems, arrayBag.manyItems);
        manyItems += arrayBag.manyItems;
    }

    public IntArray clone(){
        IntArray clonedArray;
        try {
            clonedArray = (IntArray) super.clone();
        }
        catch (CloneNotSupportedException exception){
            throw new RuntimeException("This class does not implement Cloneable");
        }

        clonedArray.data = data.clone();
        return clonedArray;
    }

    public int countOccurrences(int target){
        int count = 0;
        for (int i = 0; i < manyItems; i++) {
            if(target == data[i]){
                count++;
            }
        }
        return count;
    }

    public void ensureCapacity(int minimumCapacity){
        int[] ensuredArray;
        if (data.length < minimumCapacity) {
            ensuredArray = new int[minimumCapacity];
            System.arraycopy(data, 0, ensuredArray, 0, manyItems);
            data = ensuredArray;
        }
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean remove(int target){
        int index;
        for (index = 0; (index < manyItems) && (target != data[index]); index++){

        }

        if (index == manyItems)
            return false;
        else{
            manyItems--;
            data[index] = data[manyItems];
            return true;
        }
    }

    public int size(){
        return manyItems;
    }

    public void trimToSize(){
        int[] trimmedArray;
        if (data.length != manyItems){
            trimmedArray = new int[manyItems];
            System.arraycopy(data, 0, trimmedArray, 0, manyItems);
            data = trimmedArray;
        }
    }

    public static IntArray union(IntArray bag1, IntArray bag2){
        IntArray unionArray = new IntArray(bag1.getCapacity() + bag2.getCapacity());
        System.arraycopy(bag1.data, 0, unionArray.data, 0, bag1.manyItems);
        System.arraycopy(bag2.data, 0, unionArray.data, bag1.manyItems, bag2.manyItems);
        unionArray.manyItems = bag1.manyItems + bag2.manyItems;

        return unionArray;
    }

    public static IntArray shortArray(IntArray tempArray){
        int temp;
        IntArray array = tempArray.clone();
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;
            for (int i = 0; i < array.manyItems-1; i++) {
                if (array.data[i] > array.data[i + 1]) {
                    temp = array.data[i];
                    array.data[i] = array.data[i + 1];
                    array.data[i + 1] = temp;
                    isTrue = true;
                }

            }
        }
        return array;
    }

    @Override
    public String toString(){
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        if (manyItems > 0) {
            stringBuilder.append("[");
            for (i = 0; i < manyItems; i++) {
                if(i == manyItems-1){
                    stringBuilder.append(data[i]);
                }else{
                    stringBuilder.append( data[i] + ", ");
                }
            }
            stringBuilder.append("]");
        }else {
            throw new IllegalArgumentException("The bag array is empty");
        }

        return stringBuilder.toString();
    }
}
