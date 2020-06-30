package io.kvstore.api.representationals.storages;

public class StorageUpdate {

    private String referer;

    public String getReferer() {
        return this.referer;
    }

    public StorageUpdate setReferer(String referer) {
        this.referer = referer;
        return this;
    }

    public String toString() {
        return "StorageUpdate(referer=" + this.getReferer() + ")";
    }

}