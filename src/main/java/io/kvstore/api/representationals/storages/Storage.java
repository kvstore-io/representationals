package io.kvstore.api.representationals.storages;

import java.util.UUID;

public class Storage {

    private UUID storage_uuid;

    private String referer;

    public UUID getStorage_uuid() {
        return this.storage_uuid;
    }

    public String getReferer() {
        return this.referer;
    }

    public Storage setStorage_uuid(UUID storage_uuid) {
        this.storage_uuid = storage_uuid;
        return this;
    }

    public Storage setReferer(String referer) {
        this.referer = referer;
        return this;
    }

    public String toString() {
        return "Storage(storage_uuid=" + this.getStorage_uuid() + ", referer=" + this.getReferer() + ")";
    }

}