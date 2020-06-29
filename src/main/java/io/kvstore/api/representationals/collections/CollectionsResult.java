package io.kvstore.api.representationals.collections;

import java.util.Map;

public class CollectionsResult {

    private Integer total_collections;

    private Map<String, CollectionInfoCompact> collections;

    CollectionsResult(Integer total_collections, Map<String, CollectionInfoCompact> collections) {
        this.total_collections = total_collections;
        this.collections = collections;
    }

    public static CollectionsResultBuilder builder() {
        return new CollectionsResultBuilder();
    }

    public Integer getTotal_collections() {
        return this.total_collections;
    }

    public Map<String, CollectionInfoCompact> getCollections() {
        return this.collections;
    }

    public void setTotal_collections(Integer total_collections) {
        this.total_collections = total_collections;
    }

    public void setCollections(Map<String, CollectionInfoCompact> collections) {
        this.collections = collections;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CollectionsResult)) return false;
        final CollectionsResult other = (CollectionsResult) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$total_collections = this.getTotal_collections();
        final Object other$total_collections = other.getTotal_collections();
        if (this$total_collections == null ? other$total_collections != null : !this$total_collections.equals(other$total_collections))
            return false;
        final Object this$collections = this.getCollections();
        final Object other$collections = other.getCollections();
        if (this$collections == null ? other$collections != null : !this$collections.equals(other$collections))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CollectionsResult;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $total_collections = this.getTotal_collections();
        result = result * PRIME + ($total_collections == null ? 43 : $total_collections.hashCode());
        final Object $collections = this.getCollections();
        result = result * PRIME + ($collections == null ? 43 : $collections.hashCode());
        return result;
    }

    public String toString() {
        return "CollectionsResult(total_collections=" + this.getTotal_collections() + ", collections=" + this.getCollections() + ")";
    }

    public static class CollectionsResultBuilder {
        private Integer total_collections;
        private Map<String, CollectionInfoCompact> collections;

        CollectionsResultBuilder() {
        }

        public CollectionsResult.CollectionsResultBuilder total_collections(Integer total_collections) {
            this.total_collections = total_collections;
            return this;
        }

        public CollectionsResult.CollectionsResultBuilder collections(Map<String, CollectionInfoCompact> collections) {
            this.collections = collections;
            return this;
        }

        public CollectionsResult build() {
            return new CollectionsResult(total_collections, collections);
        }

        public String toString() {
            return "CollectionsResult.CollectionsResultBuilder(total_collections=" + this.total_collections + ", collections=" + this.collections + ")";
        }
    }
}