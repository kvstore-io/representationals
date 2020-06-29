package io.kvstore.api.representationals.storages;

import java.util.UUID;

public class Storage {

    private UUID storage_uuid;

    private String referer;

    Storage(UUID storage_uuid, String referer) {
        this.storage_uuid = storage_uuid;
        this.referer = referer;
    }

    public static StorageBuilder builder() {
        return new StorageBuilder();
    }

    public UUID getStorage_uuid() {
        return this.storage_uuid;
    }

    public String getReferer() {
        return this.referer;
    }

    public void setStorage_uuid(UUID storage_uuid) {
        this.storage_uuid = storage_uuid;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Storage)) return false;
        final Storage other = (Storage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$storage_uuid = this.getStorage_uuid();
        final Object other$storage_uuid = other.getStorage_uuid();
        if (this$storage_uuid == null ? other$storage_uuid != null : !this$storage_uuid.equals(other$storage_uuid))
            return false;
        final Object this$referer = this.getReferer();
        final Object other$referer = other.getReferer();
        if (this$referer == null ? other$referer != null : !this$referer.equals(other$referer)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Storage;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $storage_uuid = this.getStorage_uuid();
        result = result * PRIME + ($storage_uuid == null ? 43 : $storage_uuid.hashCode());
        final Object $referer = this.getReferer();
        result = result * PRIME + ($referer == null ? 43 : $referer.hashCode());
        return result;
    }

    public String toString() {
        return "Storage(storage_uuid=" + this.getStorage_uuid() + ", referer=" + this.getReferer() + ")";
    }

    public static class StorageBuilder {
        private UUID storage_uuid;
        private String referer;

        StorageBuilder() {
        }

        public Storage.StorageBuilder storage_uuid(UUID storage_uuid) {
            this.storage_uuid = storage_uuid;
            return this;
        }

        public Storage.StorageBuilder referer(String referer) {
            this.referer = referer;
            return this;
        }

        public Storage build() {
            return new Storage(storage_uuid, referer);
        }

        public String toString() {
            return "Storage.StorageBuilder(storage_uuid=" + this.storage_uuid + ", referer=" + this.referer + ")";
        }
    }
}