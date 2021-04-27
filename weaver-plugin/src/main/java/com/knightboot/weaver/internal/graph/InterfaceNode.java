package com.knightboot.weaver.internal.graph;

import com.knightboot.weaveinterface.Scope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public class InterfaceNode extends Node {

    public List<InterfaceNode> children = Collections.emptyList();
    public List<ClassNode> implementedClasses = Collections.emptyList();

    public InterfaceNode(String className) {
        super(new ClassEntity(className), null, Collections.emptyList());
    }

    @Override
    public CheckFlow.FlowNode toFlowNode(Scope scope) {
        CheckFlow.FlowNode node = new CheckFlow.FlowNode();
        recur(node, this, scope);
        return node;
    }

    private void recur(CheckFlow.FlowNode node, InterfaceNode interfaceNode, Scope scope) {
        node.className = interfaceNode.entity.name;
        List<CheckFlow.FlowNode> list = node.children = new ArrayList<>(interfaceNode.children.size() + interfaceNode.implementedClasses.size());
        Stream.concat(interfaceNode.children.stream(), interfaceNode.implementedClasses.stream())
                .forEach(i -> list.add(i.toFlowNode(scope)));
    }
}

