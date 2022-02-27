package com.mohistmc.minecraftmetajavaapi;

import com.google.gson.Gson;
import com.mohistmc.minecraftmetajavaapi.json.VersionManifest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MinecraftMetaJavaApi {

    private URL version_manifest = new URL("https://launchermeta.mojang.com/mc/game/version_manifest.json");
    private VersionManifest versionManifest;
    public static Gson gson = new Gson();

    public MinecraftMetaJavaApi() throws IOException {
        versionManifest = gson.fromJson(new InputStreamReader(version_manifest.openStream()), VersionManifest.class);
    }

    public VersionManifest getManifest() {
        return versionManifest;
    }

}
