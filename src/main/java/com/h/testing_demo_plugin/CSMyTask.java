package com.h.testing_demo_plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class CSMyTask extends DefaultTask {

    @TaskAction
    public void myTask() {
        System.out.println("Hello World");
    }

}
