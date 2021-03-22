package com.knightboot.weaver.graph;

import java.util.Collections;
import java.util.List;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public class InterfaceNode extends Node{
    public List<InterfaceNode> children = Collections.emptyList();
    public List<ClassNode> implementedClasses = Collections.emptyList();

    public InterfaceNode(String className) {
        super(new ClassEntity(className), null, Collections.emptyList());
    }

}
