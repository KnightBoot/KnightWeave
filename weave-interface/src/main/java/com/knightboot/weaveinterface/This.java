package com.knightboot.weaveinterface;

/**
 *
 */
public class This {

    public static Object get() {
        return new Object();
    }

    public static Object getField(String fieldName) {
        return null;
    }

    //左边改为参数名,右边改为参数值
    public static void putField(Object field, String fieldName) {
    }

    /**
     * 调用return指令
     */
    public void doReturn() {
    }

    /**
     * return 一个bool类型的值
     * @param value
     */
    public void doReturn(boolean value){
    }

}
