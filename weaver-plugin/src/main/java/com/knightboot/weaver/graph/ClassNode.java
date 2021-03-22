package com.knightboot.weaver.graph;

import java.util.Collections;
import java.util.List;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public class ClassNode extends Node{
    public List<ClassNode> children = Collections.emptyList();

    public ClassNode(String className) {
        super(new ClassEntity(className), null, Collections.emptyList());

    }
}
