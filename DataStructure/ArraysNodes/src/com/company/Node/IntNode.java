package com.company.Node;

public class IntNode{
    private int data;
    private IntNode link;

    public IntNode(int tempData, IntNode tempLink) {
        this.data = tempData;
        this.link = tempLink;
    }

    public int getData() {
        return data;
    }

    public IntNode getLink() {
        return link;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLink(IntNode link) {
        this.link = link;
    }

    public void addNodeAfter(int nodeAfter){
        link = new IntNode(nodeAfter,link);
    }
    public void addNodeBefore(int nodeBefore){
        IntNode node = new IntNode(nodeBefore,getLink());
    }

    public void removeNodeAfter(){
        link = link.link;
    }

    public static int listLength(IntNode nodeHead){
        IntNode cursor;
        int length = 0;
        for (cursor = nodeHead; cursor != null; cursor = cursor.link) {
            length++;
        }

        return length;
    }

    public static IntNode listPosition(IntNode head, int position){
        IntNode cursor;
        int i;

        if (position <= 0)
            throw new IllegalArgumentException("Position is negative");
        cursor = head;
        for (i = 1; (i < position) && (cursor != null); i++){
            cursor = cursor.link;
        }

        return cursor;

    }

    public static IntNode listSearch(IntNode head, int target){
        IntNode cursor;
        for (cursor = head; cursor != null; cursor = cursor.getLink()){
            if (target == cursor.data)
                return cursor;
        }
        return null;
    }

    public static IntNode listCopy(IntNode sourceNode){

        IntNode copyHead;
        IntNode copyTail;

        if (sourceNode == null){
            return null;
        }

        copyHead = new IntNode(sourceNode.data, null);
        copyTail = copyHead;

        while (sourceNode.link != null){
            sourceNode = sourceNode.link;
            copyTail.addNodeAfter(sourceNode.data);
            copyTail = copyTail.link;
        }

        return copyHead;
    }

    public static IntNode[] copyWithTail(IntNode sourceNode){
        IntNode copyHead;
        IntNode copyTail;
        IntNode[] headTail = new IntNode[2];

        if(sourceNode == null)
            return headTail;

        copyHead = new IntNode(sourceNode.data, null);
        copyTail = copyHead;

        while (sourceNode.link != null){
            sourceNode = sourceNode.link;
            copyTail.addNodeAfter(sourceNode.data);
            copyTail = copyTail.link;
        }

        headTail[0] = copyHead;
        headTail[1] = copyTail;
        return headTail;
    }

    public static IntNode[] listPart(IntNode startNode, IntNode endNode){
        IntNode copyHead;
        IntNode copyTail;
        IntNode cursor;
        IntNode [] tempNode = new IntNode[2];

        copyHead = new IntNode(startNode.data, null);
        copyTail = copyHead;

        for (cursor = startNode; cursor != endNode; cursor = cursor.link){
            if(cursor == null)
                throw new IllegalArgumentException("End of node was not found");
            copyTail.addNodeAfter(cursor.data);
            copyTail = copyTail.link;
        }
        tempNode[0] = copyHead;
        tempNode[1] = copyTail;
        return tempNode;
    }

    @Override
    public String toString() {
        return "IntNode {" +
                "data = " + data +
                ", link = " + link + "}";
    }
}
