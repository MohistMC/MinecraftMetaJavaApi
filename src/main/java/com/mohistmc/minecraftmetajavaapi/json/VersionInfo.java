package com.mohistmc.minecraftmetajavaapi.json;

import java.util.List;

public class VersionInfo {

    private Arguments arguments;
    private AssetIndex assetIndex;
    private String assets;
    private String complianceLevel;
    private Downloads downloads;
    private String id;
    private JavaVersion javaVersion;
    private List<DownloadArtifact> libraries;
    private Logging logging;
    private String mainClass;
    private String minimumLauncherVersion;
    private String releaseTime;
    private String time;
    private String type;

    public Arguments getArguments() {
        return arguments;
    }

    public AssetIndex getAssetIndex() {
        return assetIndex;
    }

    public String getAssets() {
        return assets;
    }

    public String getComplianceLevel() {
        return complianceLevel;
    }

    public Downloads getDownloads() {
        return downloads;
    }

    public String getId() {
        return id;
    }

    public JavaVersion getJavaVersion() {
        return javaVersion;
    }

    public List<DownloadArtifact> getLibraries() {
        return libraries;
    }

    public Logging getLogging() {
        return logging;
    }

    public String getMainClass() {
        return mainClass;
    }

    public String getMinimumLauncherVersion() {
        return minimumLauncherVersion;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public String getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "VersionInfo{" +
                "arguments=" + arguments +
                ", assetIndex=" + assetIndex +
                ", assets='" + assets + '\'' +
                ", complianceLevel='" + complianceLevel + '\'' +
                ", downloads=" + downloads +
                ", id='" + id + '\'' +
                ", javaVersion=" + javaVersion +
                ", libraries=" + libraries +
                ", logging=" + logging +
                ", mainClass='" + mainClass + '\'' +
                ", minimumLauncherVersion='" + minimumLauncherVersion + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
