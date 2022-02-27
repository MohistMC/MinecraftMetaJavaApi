package com.mohistmc.minecraftmetajavaapi.json;

public class Logging {

    private Client client;

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Logging{" +
                "client=" + client +
                '}';
    }

    public static class Client {
        private String argument;
        private File file;
        private String type;

        public String getArgument() {
            return argument;
        }

        public File getFile() {
            return file;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "argument='" + argument + '\'' +
                    ", file=" + file +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    private static class File {
        private String id;
        private String sha1;
        private String size;
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

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return "File{" +
                    "id='" + id + '\'' +
                    ", sha1='" + sha1 + '\'' +
                    ", size='" + size + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

}
