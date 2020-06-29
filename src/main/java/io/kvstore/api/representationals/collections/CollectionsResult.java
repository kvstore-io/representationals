package io.kvstore.api.representationals.collections;

import java.util.Map;
import java.util.Objects;

public class CollectionsResult {

    private Integer total_collections;

    private Map<String, CollectionInfoCompact> collections;

    public Integer getTotal_collections() {
        return this.total_collections;
    }

    public Map<String, CollectionInfoCompact> getCollections() {
        return this.collections;
    }

    public CollectionsResult setTotal_collections(Integer total_collections) {
        this.total_collections = total_collections;
        return this;
    }

    public CollectionsResult setCollections(Map<String, CollectionInfoCompact> collections) {
        this.collections = collections;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CollectionsResult)) return false;
        final CollectionsResult other = (CollectionsResult) o;
        if (!other.canEqual(this)) return false;
        final Object this$total_collections = this.getTotal_collections();
        final Object other$total_collections = other.getTotal_collections();
        if (!Objects.equals(this$total_collections, other$total_collections))
            return false;
        final Object this$collections = this.getCollections();
        final Object other$collections = other.getCollections();
        if (!Objects.equals(this$collections, other$collections))
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

}