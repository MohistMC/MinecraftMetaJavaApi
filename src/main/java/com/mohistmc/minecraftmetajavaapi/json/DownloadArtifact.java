package com.mohistmc.minecraftmetajavaapi.json;

public class DownloadArtifact {

    private Downloads downloads;
    private String name;

    public Downloads getDownloads() {
        return downloads;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DownloadArtifact{" +
                "downloads=" + downloads +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Downloads {
        private Artifact artifact;

        public Artifact getArtifact() {
            return artifact;
        }

        @Override
        public String toString() {
            return "Downloads{" +
                    "artifact=" + artifact +
                    '}';
        }
    }

    public static class Artifact {
        private String path;
        private String sha1;
        private String size;
        private String url;

        public String getPath() {
            return path;
        }

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
            return "Artifact{" +
                    "path='" + path + '\'' +
                    ", sha1='" + sha1 + '\'' +
                    ", size='" + size + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

}
