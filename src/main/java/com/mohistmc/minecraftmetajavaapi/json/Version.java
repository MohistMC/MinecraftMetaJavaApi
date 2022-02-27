package com.mohistmc.minecraftmetajavaapi.json;

import com.mohistmc.minecraftmetajavaapi.MinecraftMetaJavaApi;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Version {

    private String id;
    private String type;
    private String url;
    private String time;
    private String releaseTime;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getTime() {
        return time;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public VersionInfo getVersionInfo() throws IOException {
        return MinecraftMetaJavaApi.gson.fromJson(new InputStreamReader(new URL(url).openStream()), VersionInfo.class);
    }

    @Override
    public String toString() {
        return "Version{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", time='" + time + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                '}';
    }
}
