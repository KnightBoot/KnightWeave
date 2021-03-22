package com.knightboot.weaver.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public class ClassEntity {

    public int access;
    public String name;
    public String superName;
    public List<String> interfaces;

    public List<FieldEntity> fields = new ArrayList<>();
    public List<MethodEntity> methods = new ArrayList<>();

    // placeholder
    public ClassEntity(String name) {
        this.name = name;
        this.interfaces = Collections.emptyList();
        this.fields = Collections.emptyList();
        this.methods = Collections.emptyList();
    }

    // actual
    public ClassEntity(int access, String name, String superName, List<String> interfaces) {
        this.access = access;
        this.name = name;
        this.superName = superName;
        this.interfaces = interfaces;
        this.fields = new ArrayList<>();
        this.methods = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "ClassEntity{" +
                "access=" + access +
                ", name='" + name + '\'' +
                ", superName='" + superName + '\'' +
                ", interfaces=" + interfaces +
                ", fields=" + fields +
                ", methods=" + methods +
                '}';
    }
}

