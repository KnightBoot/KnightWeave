package com.knightboot.plugin;

import com.android.build.api.transform.QualifiedContent;
import com.android.build.api.transform.Transform;
import com.android.build.api.transform.TransformException;
import com.android.build.api.transform.TransformInvocation;
import com.android.build.gradle.internal.pipeline.TransformManager;
import com.google.common.base.Strings;
import com.google.common.io.Files;
import com.knightboot.plugin.internal.GlobalContext;
import com.knightboot.plugin.internal.TransformContext;
import com.knightboot.weaver.internal.log.Impl.FileLoggerImpl;
import com.knightboot.weaver.internal.log.Log;

import org.gradle.api.Project;

import java.io.File;
import java.io.IOException;
import java.util.Set;
/**
 * Created by Knight-ZXW on 21/3/22.
 */
public class WeaveTransform extends Transform {

    private final WeaveExtension weaveExtension;
    private final GlobalContext global;

    public WeaveTransform(Project project, WeaveExtension weaveExtension){
        this.weaveExtension = weaveExtension;
        this.global = new GlobalContext(project);

    }

    @Override
    public String getName() {
        return "knightboot-weave";
    }

    @Override
    public Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS;
    }

    @Override
    public Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT;
    }

    @Override
    public void transform(TransformInvocation transformInvocation) throws TransformException, InterruptedException, IOException {
        super.transform(transformInvocation);
        initLog();

        Log.i("start time: " + System.currentTimeMillis());

        // collect the information this compile need
        TransformContext context = new TransformContext(transformInvocation, global);

        Log.i("after android plugin, incremental: " + context.isIncremental());
        Log.i("now: " + System.currentTimeMillis());

    }


    @Override
    public boolean isIncremental() {
        return true;
    }


    private void initLog() throws IOException {
        Log.setLevel(weaveExtension.getLogLevel());
        if (!Strings.isNullOrEmpty(weaveExtension.getFileName())) {
            String name = weaveExtension.getFileName();
            if (name.contains(File.separator)) {
                throw new IllegalArgumentException("Log file name can't contains file separator");
            }
            File logFile = new File(global.getLancetDir(), "log_" + weaveExtension.getFileName());
            Files.createParentDirs(logFile);
            Log.setImpl(FileLoggerImpl.of(logFile.getAbsolutePath()));
        }
    }
}
