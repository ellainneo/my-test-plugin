package com.h.testing_demo_plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.Input;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class CSMyTask extends DefaultTask {

    @TaskAction
    public void showMessageTask() {
        System.out.println("Run Show Message Task");

        Project project = getProject();

        System.out.println("Project Name: " + project.getName());
        System.out.println("Project Display Name: " + project.getDisplayName());
        System.out.println("Project Root Dir: " + project.getRootDir().getName());
        System.out.println("Project Path: " + project.getPath());
        System.out.println("Project Absolute Path: " + project.getProjectDir().getPath() + "\\src\\main\\java");

        Map<String, ?> properties = project.getProperties();
        System.out.println("Properties Size: " + properties.size());

        System.getProperties().keySet().stream().forEach(key -> {
            System.out.println("System Property Key: " + key + " Property Value: " + System.getProperties().get(key));
        });

        CSMainPluginExtension mainPluginExtension = project.getExtensions().findByType(CSMainPluginExtension.class);

        String senderProp = ((String) properties.get("sender"));
        if (senderProp != null) {
            System.out.println("Sender Property: " + senderProp);
            mainPluginExtension.setSender(senderProp);
        }
        System.out.println("From: " + mainPluginExtension.getSender() + " Message: " + mainPluginExtension.getMessage());

        CSInternalPluginExtension internalPluginExtension = mainPluginExtension.getInternalExtension();
        System.out.println("To: " + internalPluginExtension.getReceiver() + " Email: " + internalPluginExtension.getEmail());
    }

}
