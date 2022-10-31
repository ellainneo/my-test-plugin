/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.h.testing_demo_plugin;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

/**
 * A simple 'hello world' plugin.
 */
public class CsTestingDemoPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("showMessageTask", CSMyTask.class);
        project.getExtensions().create("mainParameters", CSMainPluginExtension.class);
        project.getExtensions().create("internalParameters", CSInternalPluginExtension.class);
    }

}
