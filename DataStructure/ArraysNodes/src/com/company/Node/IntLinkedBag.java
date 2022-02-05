package com.company.Node;

public class IntLinkedBag implements Cloneable{
    private IntNode head;
    private int nodeCount;

    public IntLinkedBag(){
        head = null;
        nodeCount = 0;
    }

    public void add(int node){
        head = new IntNode(node, head);
        nodeCount++;
    }

    public void addAll(IntLinkedBag nodes){
        IntNode [] copyNodes;

        if (nodes.nodeCount > 0) {
            copyNodes = IntNode.copyWithTail(nodes.head);
            copyNodes[1].setLink(head);
            head = copyNodes[0];
            nodeCount += nodes.nodeCount;
        }
    }

    public void addMany(int... elements){
        for(int tempElement : elements){
            add(tempElement);
        }
    }

    public void remove(int element){
        IntNode cursor;
        for (cursor = head; cursor != null; cursor = cursor.getLink()){
            if(cursor.getData() == element){
                cursor.setData(head.getData());
                head = head.getLink();
                nodeCount--;
            }
        }

    }

    public int grab(){
        int tempElement;
        IntNode cursor;
        if(nodeCount == 0)
            throw new IllegalStateException("Your bag is empty");

        tempElement = (int)(Math.random() * nodeCount) + 1;
        cursor = IntNode.listPosition(head, tempElement);
        return cursor.getData();
    }

    public int size(){
        return nodeCount;
    }


    public IntLinkedBag clone(){
        IntLinkedBag tempBag;

        try {
            tempBag = (IntLinkedBag) super.clone();
        }catch (CloneNotSupportedException exception){
            throw new RuntimeException("This class does not implement Cloneable");
        }

        tempBag.head = IntNode.listCopy(head);
        return tempBag;
    }

    public int countOccurrences(int element){
        int count = 0;
        IntNode cursor;

        cursor = IntNode.listSearch(head, element);
        while (cursor != null){
            count++;
            cursor = cursor.getLink();
            cursor = IntNode.listSearch(cursor,element);
        }
        return count;
    }

    public static IntLinkedBag union(IntLinkedBag bag1, IntLinkedBag bag2){
        IntLinkedBag tempBag = new IntLinkedBag();
        tempBag.addAll(bag1);
        tempBag.addAll(bag2);
        return tempBag;
    }

    public static IntLinkedBag shortBag(IntLinkedBag tempBag){
        int temp = tempBag.nodeCount;
        int tempData;
        IntLinkedBag bag = new IntLinkedBag();
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;
            for (IntNode cursor = tempBag.head; cursor != null; cursor = cursor.getLink()) {
                if (cursor.getData() > cursor.getLink().getData()) {
                    tempData = cursor.getData();
                    cursor.setData(cursor.getLink().getData());
                }

            }
        }
        return tempBag;
    }

    @Override
    public String toString(){
//        StringBuilder stringBuilder = new StringBuilder();
        String string = " ";
        IntNode cursor = head;
        if (cursor == null)
            throw new NullPointerException("Your bag is empty");

        while (cursor != null){
//            string = stringBuilder.append(cursor.getData() + " ");
            System.out.print(" " + cursor.getData() + " ");
            cursor = cursor.getLink();
        }
        return string;
    }

    //-----------------With StringBuilder Class-----------------
//    @Override
//    public String toString(){
//        StringBuilder stringBuilder = new StringBuilder();
//        String string = " ";
//        IntNode cursor = head;
//        if (cursor == null)
//            throw new NullPointerException("Your bag is empty");
//
//        while (cursor != null){
//            string = stringBuilder.append(cursor.getData() + " ") + " ";
//            cursor = cursor.getLink();
//        }
//        return string;
//    }
}
