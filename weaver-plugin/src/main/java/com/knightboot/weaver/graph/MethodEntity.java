package com.knightboot.weaver.graph;

/**
 * created by Knight-ZXW on 2021/3/23
 */
public class MethodEntity {

    public int access;
    public String name;
    public String desc;

    public MethodEntity(int access, String name, String desc) {
        this.access = access;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "MethodEntity{" +
                "access=" + access +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
