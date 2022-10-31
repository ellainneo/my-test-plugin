package com.h.testing_demo_plugin;

public class CSMainPluginExtension {

    String message = "Hello from Test Plugin";
    String sender = "Custom Plugin";

    private String standardProtocol = "http";

    CSInternalPluginExtension internalExtension = new CSInternalPluginExtension();

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setInternalExtension(CSInternalPluginExtension internalExtension) {
        this.internalExtension = internalExtension;
    }

    public CSInternalPluginExtension getInternalExtension() {
        return internalExtension;
    }
}

