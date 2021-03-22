package com.knightboot.weaveinterface.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target(ElementType.PARAMETER)
public @interface ClassOf {
    String value();

    String INDEX = "index";
}
