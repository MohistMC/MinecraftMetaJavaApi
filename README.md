# MinecraftMetaJavaApi
A java libraries to parse json send by mojang api for minecraft game

How use ?
```java
import com.mohistmc.minecraftmetajavaapi.MinecraftMetaJavaApi;

MinecraftMetaJavaApi minecraftMetaJavaApi = new MinecraftMetaJavaApi();
VersionManifest versionManifest = minecraftMetaJavaApi.getManifest();
// Now you can try methods. If you want to get VersionInfo 
// for specific version of minecraft, you can use:
versionManifest.getVersionById("YourMinecraftVersion");
```