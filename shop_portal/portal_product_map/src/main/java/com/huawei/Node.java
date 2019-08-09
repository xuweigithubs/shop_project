package com.huawei;

import lombok.Data;

@Data
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }
}
