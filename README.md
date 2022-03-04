# MinecraftMetaJavaApi
A java libraries to parse json send by mojang api for minecraft game

[![Maven Central](https://img.shields.io/maven-central/v/com.mohistmc/MinecraftMetaJavaApi.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.mohistmc%22%20AND%20a:%22MinecraftMetaJavaApi%22)

How use ?
```java
import com.mohistmc.minecraftmetajavaapi.MinecraftMetaJavaApi;

MinecraftMetaJavaApi minecraftMetaJavaApi = new MinecraftMetaJavaApi();
VersionManifest versionManifest = minecraftMetaJavaApi.getManifest();
// Now you can try methods. If you want to get VersionInfo 
// for specific version of minecraft, you can use:
versionManifest.getVersionById("YourMinecraftVersion");
```
