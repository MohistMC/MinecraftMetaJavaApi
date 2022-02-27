package com.mohistmc.minecraftmetajavaapi.json;

public class Latest {

    private String release;
    private String snapshot;

    public String getRelease() {
        return release;
    }

    public String getSnapshot() {
        return snapshot;
    }

    @Override
    public String toString() {
        return "Latest{" +
                "release='" + release + '\'' +
                ", snapshot='" + snapshot + '\'' +
                '}';
    }
}
