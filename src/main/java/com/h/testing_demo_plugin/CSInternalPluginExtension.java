package com.h.testing_demo_plugin;

public class CSInternalPluginExtension {

    private String receiver = "Test User";
    private String email = "test-user@test.com.test";

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
 }
