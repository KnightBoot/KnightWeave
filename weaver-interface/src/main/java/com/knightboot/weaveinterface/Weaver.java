package com.knightboot.weaveinterface;

/**
 * 标识这个类 是用来声明字节码注入操作的类， 我们强制这个类至少为 包级私有的，以此来防止其他类的误调用
 * 对于Weaver 类，整个类在完成元信息的解析和字节码操作之后，这个类会被移除掉 (或者变为空类),
 * 对于一些 访问权限受限的类， 可以通过在Weaver类中模拟，并使用，以此简化字节码操作的编写
 */
public interface Weaver {
}
