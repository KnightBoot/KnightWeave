package com.knightboot.weaverplugin.internal;

import com.android.build.api.transform.DirectoryInput;
import com.android.build.api.transform.JarInput;
import com.android.build.api.transform.TransformInvocation;

import java.util.Collection;
import java.util.List;

/**
 * created by Knight-ZXW on 2021/4/17
 */
class TransformContext {

    private TransformInvocation invocation;

    private Collection<JarInput> allJars;
    private Collection<JarInput> addedJars;
    private Collection<JarInput> removedJars;
    private Collection<JarInput> changedJars;

    private Collection<DirectoryInput> allDirs;

    private GlobalContext global;
    private List<String> hookClasses;

}
