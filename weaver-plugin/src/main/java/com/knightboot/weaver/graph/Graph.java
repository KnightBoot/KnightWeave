package com.knightboot.weaver.graph;

import java.util.Map;

/**
 * created by Knight-ZXW on 2021/4/17
 *
 * class dependency graph;
 */
class Graph {

    private final Map<String,Node> nodeMap;
    private final CheckFlow checkFlow;

    public Graph(Map<String,Node> nodeMap,
                 CheckFlow checkFlow){
        this.nodeMap = nodeMap;
        this.checkFlow = checkFlow;
    }
}
