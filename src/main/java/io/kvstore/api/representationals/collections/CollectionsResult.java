package io.kvstore.api.representationals.collections;

import java.util.Map;

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

    public String toString() {
        return "CollectionsResult(total_collections=" + this.getTotal_collections() + ", collections=" + this.getCollections() + ")";
    }

}