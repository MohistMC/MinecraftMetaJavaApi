package com.mohistmc.minecraftmetajavaapi.json;

public class Downloads {

    private DownloadInfo client;
    private DownloadInfo client_mappings;
    private DownloadInfo server;
    private DownloadInfo server_mappings;

    public DownloadInfo getClient() {
        return client;
    }

    public DownloadInfo getClientMappings() {
        return client_mappings;
    }

    public DownloadInfo getServer() {
        return server;
    }

    public DownloadInfo getServerMappings() {
        return server_mappings;
    }

    @Override
    public String toString() {
        return "Downloads{" +
                "client=" + client +
                ", client_mappings=" + client_mappings +
                ", server=" + server +
                ", server_mappings=" + server_mappings +
                '}';
    }
}
