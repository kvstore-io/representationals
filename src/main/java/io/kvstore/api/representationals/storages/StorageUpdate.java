package io.kvstore.api.representationals.storages;

import java.util.Objects;

public class StorageUpdate {

    private String referer;

    public String getReferer() {
        return this.referer;
    }

    public StorageUpdate setReferer(String referer) {
        this.referer = referer;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StorageUpdate)) return false;
        final StorageUpdate other = (StorageUpdate) o;
        if (!other.canEqual(this)) return false;
        final Object this$referer = this.getReferer();
        final Object other$referer = other.getReferer();
        if (!Objects.equals(this$referer, other$referer)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StorageUpdate;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $referer = this.getReferer();
        result = result * PRIME + ($referer == null ? 43 : $referer.hashCode());
        return result;
    }

    public String toString() {
        return "StorageUpdate(referer=" + this.getReferer() + ")";
    }

}