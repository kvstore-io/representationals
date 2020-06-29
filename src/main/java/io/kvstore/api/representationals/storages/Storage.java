package io.kvstore.api.representationals.storages;

import java.util.Objects;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Storage)) return false;
        final Storage other = (Storage) o;
        if (!other.canEqual(this)) return false;
        final Object this$storage_uuid = this.getStorage_uuid();
        final Object other$storage_uuid = other.getStorage_uuid();
        if (!Objects.equals(this$storage_uuid, other$storage_uuid))
            return false;
        final Object this$referer = this.getReferer();
        final Object other$referer = other.getReferer();
        if (!Objects.equals(this$referer, other$referer)) return false;
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

}