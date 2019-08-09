package com.huawei;

public class TreeMain {
    public static void main(String[] args) {
        TreeMain treeMain=new TreeMain();
        Node head=new Node(0);
        Node c1=new Node(1);
        Node c2=new Node(2);
        head.setLeft(c1);
        head.setRight(c2);
        Node c3=new Node(3);
        Node c4=new Node(4);
        c1.setLeft(c3);
        c1.setRight(c4);
        Node c5=new Node(3);
        Node c6=new Node(4);
        c2.setLeft(c5);
        c2.setRight(c6);
        Node c7=new Node(3);
        Node c8=new Node(4);
        c5.setLeft(c7);
        c5.setRight(c8);
        treeMain.serialByPre(head);
    }
    private String serialByPre(Node head){
        if(head==null){
           return "#!";
        }
        String res=head.getValue()+"!";
        res+=serialByPre(head.getLeft());
        res+=serialByPre(head.getRight());
        return res;
    }
}
