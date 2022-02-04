package com.company;

import com.company.Array.IntArray;
import com.company.Node.IntLinkedBag;
import com.company.Node.IntNode;

public class Main {
    public static void main(String[] args) {

//*************************************** IntNode *******************************************
        // write your code here
        System.out.println();
        System.out.println("********************* IntNode *****************");
        IntNode node = new IntNode(1,null);
        node.addNodeAfter(2);
        node.addNodeAfter(3);
        node.addNodeAfter(22);
        node.addNodeAfter(33);
        node.removeNodeAfter();

        System.out.println(IntNode.listLength(node)); //2
        System.out.println(node); //1, 2

        IntNode node1 = new IntNode(2, null);
        node1.addNodeAfter(4);
        node1.addNodeAfter(5);
        node1.addNodeAfter(44);
        node1.addNodeAfter(55);

        //ListCopy
        node = IntNode.listCopy(node1);
        System.out.println(node);

        IntLinkedBag bag = new IntLinkedBag();
        bag.add(6);
        bag.add(7);

        IntLinkedBag bag1 = new IntLinkedBag();
        bag1.add(8);
        bag1.add(9);
        bag1.add(88);
        bag1.add(99);
        bag1.add(8);

        //AddMany
        bag1.addMany(1,2,3,4,5);

        System.out.print("Bag1 with addMany: ");
        System.out.print(bag1);
        System.out.println();

        //Remove
        System.out.print("Bag1: ");
        System.out.println(bag1); // Bag1
        bag1.remove(99);

        System.out.print("Removed: ");
        System.out.println(bag1);

        //Clone
        IntLinkedBag bag2 = bag1.clone();
        bag2.add(188);

        System.out.print("Bag2: ");
        System.out.println(bag2);

        //AddAll
        IntLinkedBag bag3 = new IntLinkedBag();
        bag3.addAll(bag2);

        System.out.print("Bag3: ");
        //toString() is redundant, but I'm checking toString method for IntLinkedBag
        System.out.print(bag3.toString());

        //Size
        System.out.println();
        System.out.println("There are " + bag3.size() + " elements in the Bag3");

        //Union
        IntLinkedBag bag4;
        bag4 = IntLinkedBag.union(bag,bag1);
        System.out.print("Bag4: ");
        System.out.print(bag4);

        //CountOccurrence
        System.out.println();
        System.out.print("Count Occurrence: " + bag1.countOccurrences(8));

        //Grab
        bag1.remove(8);
        System.out.println();
        System.out.print("Grab Bag1: ");
        System.out.println(bag1.grab());
        System.out.println();

        //short
        System.out.print("Short bag: ");
        IntLinkedBag bag5 = IntLinkedBag.shortBag(bag3);
        System.out.println(IntLinkedBag.shortBag(bag3));

//*************************************** IntArray *******************************************

        System.out.println();
        System.out.println("********************* Array *****************");
//        Add
        IntArray array = new IntArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        //toString() is redundant, but I'm checking toString method for IntArray
        System.out.println("Array Add: " + array.toString());

//        AddMany
        IntArray array1 = new IntArray();
        array1.addMany(5, 6, 7, 8);

        System.out.println("Array1 AddMany: " + array1);


//        AddAll
        IntArray array2 = new IntArray();
        array2.addAll(array1);
        array2.addAll(array1);
        array2.addAll(array1);
        array2.addAll(array);
        System.out.println("Array2 AddAll: " + array2);

//        Clone
        IntArray array3;
        array3 = array1.clone();
        System.out.println("Array3 Cloned Array1: " + array3);

//        CountOccurrences
        System.out.println("CountOccurrences: 8 in Array2: " + array2.countOccurrences(8) + " times");

//        Remove
        array1.remove(5);
        System.out.println("Remove 5 from Array1: " + array1);

//        Size of Array
        System.out.println("Array2 size: " + array2.size());

        IntArray array4;
        array4 = IntArray.union(array, array3);
        System.out.println("Array4 union of Array and Array3: " + array4);

        IntArray array5 = IntArray.shortArray(array2);
        System.out.println("Shorted Array: " + array5);
    }

}
