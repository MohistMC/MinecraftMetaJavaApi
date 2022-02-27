package com.mohistmc.minecraftmetajavaapi.json;

public class DownloadInfo {

    private String sha1;
    private String size;
    private String url;

    public String getSha1() {
        return sha1;
    }

    public String getSize() {
        return size;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "DownloadInfo{" +
                "sha1='" + sha1 + '\'' +
                ", size='" + size + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
