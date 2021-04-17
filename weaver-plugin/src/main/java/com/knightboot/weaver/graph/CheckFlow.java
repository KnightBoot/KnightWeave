package com.knightboot.weaver.graph;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * created by Knight-ZXW on 2021/4/17
 */
class CheckFlow {



    public static class FlowEntity{
        public boolean exactMatch =false;

    }

    public static class FlowNode{
        public String className;
        public List<FlowNode> children = Collections.emptyList();

        public boolean checkExactly(Node n){
            if (n.checkPass[0]){
                return true;
            }
            Map<String,Node> map = directChildrenOf(n);

            return true;

        }

        private Map<String, Node> directChildrenOf(Node n) {
            InterfaceNode t;
            return n instanceof ClassNode?
                    ((ClassNode)n).children.stream()
                    .collect(Collectors.toMap(v -> v.entity.name, v -> v)):
                    Stream.concat((t = (InterfaceNode) n).children.stream(), t.implementedClasses.stream())
                            .collect(Collectors.toMap(v -> v.entity.name, v -> v));

        }
    }
}
