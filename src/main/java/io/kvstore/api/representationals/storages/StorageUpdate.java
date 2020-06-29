package io.kvstore.api.representationals.storages;

public class StorageUpdate {

    private String referer;

    StorageUpdate(String referer) {
        this.referer = referer;
    }

    public static StorageUpdateBuilder builder() {
        return new StorageUpdateBuilder();
    }

    public String getReferer() {
        return this.referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StorageUpdate)) return false;
        final StorageUpdate other = (StorageUpdate) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$referer = this.getReferer();
        final Object other$referer = other.getReferer();
        if (this$referer == null ? other$referer != null : !this$referer.equals(other$referer)) return false;
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

    public static class StorageUpdateBuilder {
        private String referer;

        StorageUpdateBuilder() {
        }

        public StorageUpdate.StorageUpdateBuilder referer(String referer) {
            this.referer = referer;
            return this;
        }

        public StorageUpdate build() {
            return new StorageUpdate(referer);
        }

        public String toString() {
            return "StorageUpdate.StorageUpdateBuilder(referer=" + this.referer + ")";
        }
    }
}