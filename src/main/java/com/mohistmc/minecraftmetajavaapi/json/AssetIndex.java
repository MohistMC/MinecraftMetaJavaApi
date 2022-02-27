package com.mohistmc.minecraftmetajavaapi.json;

public class AssetIndex {

    private String id;
    private String sha1;
    private String size;
    private String totalSize;
    private String url;

    public String getId() {
        return id;
    }

    public String getSha1() {
        return sha1;
    }

    public String getSize() {
        return size;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "AssetIndex{" +
                "id='" + id + '\'' +
                ", sha1='" + sha1 + '\'' +
                ", size='" + size + '\'' +
                ", totalSize='" + totalSize + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
