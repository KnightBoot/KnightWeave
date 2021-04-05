package com.knightboot.weaverplugin;

import com.android.build.gradle.BaseExtension;
import com.knightboot.weaverplugin.transform.WeaveTransform;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.ProjectConfigurationException;

/**
 * Created by Knight-ZXW on 21/3/22.
 */
public class WeavePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        if (project.getPlugins().findPlugin("com.android.application") == null
                && project.getPlugins().findPlugin("com.android.library") == null) {
            throw new ProjectConfigurationException(project.getName() + " is not an android application/library", (Throwable) null);
        }
        BaseExtension baseExtension = (BaseExtension) project.getExtensions().getByName("android");

        WeaveExtension weaveExtension = project.getExtensions().getByType(WeaveExtension.class);
        baseExtension.registerTransform(new WeaveTransform(project,weaveExtension));
    }
}
