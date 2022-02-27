package com.mohistmc.minecraftmetajavaapi.json;

import java.util.List;

public class VersionManifest {

    private Latest latest;
    private List<Version> versions;

    public Latest getLatest() {
        return latest;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public Version getVersionById(String id) {
        for (Version version: versions.stream().toList()) {
            if (version.getId().equals(id))
                return version;
        }
        return null;
    }

    @Override
    public String toString() {
        return "VersionManifest{" +
                "latest=" + latest +
                ", versions=" + versions +
                '}';
    }
}
