package com.mohistmc.minecraftmetajavaapi.json;

public class JavaVersion {

    private String component;
    private String majorVersion;

    public String getComponent() {
        return component;
    }

    public String getMajorVersion() {
        return majorVersion;
    }

    @Override
    public String toString() {
        return "JavaVersion{" +
                "component='" + component + '\'' +
                ", majorVersion='" + majorVersion + '\'' +
                '}';
    }
}
