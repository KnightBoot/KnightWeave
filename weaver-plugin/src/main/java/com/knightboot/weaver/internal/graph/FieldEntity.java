package com.knightboot.weaver.internal.graph;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public class FieldEntity {

    public int access;
    public String name;
    public String desc;

    public FieldEntity(int access, String name, String desc) {
        this.access = access;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "FieldEntity{" +
                "access=" + access +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
