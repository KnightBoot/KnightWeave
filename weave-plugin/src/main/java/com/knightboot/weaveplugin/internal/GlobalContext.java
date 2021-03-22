package com.knightboot.weaveplugin.internal;

import org.gradle.api.Project;

import java.io.File;

/**
 * Created by Knight-ZXW on 21/3/22.
 */
public class GlobalContext {

    private Project project;

    public GlobalContext(Project project) {
        this.project = project;
    }


    public File getLancetDir() {
        return new File(project.getBuildDir(), "knightboot-weave");
    }
}
