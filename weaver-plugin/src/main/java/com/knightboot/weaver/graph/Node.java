package com.knightboot.weaver.graph;


import com.android.build.api.transform.Status;

import java.util.List;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public abstract class Node {
    public ClassNode parent; // null means it doesn't exists actually, it's a virtual class node

    public ClassEntity entity;
    public List<InterfaceNode> interfaces;


    // for flow check
    public boolean[] checkPass = new boolean[2];
    public Status status;

    public Node(ClassEntity entity, ClassNode parent, List<InterfaceNode> interfaces) {
        this.entity = entity;
        this.parent = parent;
        this.interfaces = interfaces;
    }

    //todo add placeholder node

}
