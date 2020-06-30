package io.kvstore.api.representationals.collections;

public class CollectionInfoCompact {

    private Integer items;

    private double created_at;

    private double updated_at;

    public Integer getItems() {
        return this.items;
    }

    public double getCreated_at() {
        return this.created_at;
    }

    public double getUpdated_at() {
        return this.updated_at;
    }

    public CollectionInfoCompact setItems(Integer items) {
        this.items = items;
        return this;
    }

    public CollectionInfoCompact setCreated_at(double created_at) {
        this.created_at = created_at;
        return this;
    }

    public CollectionInfoCompact setUpdated_at(double updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public String toString() {
        return "CollectionInfoCompact(items=" + this.getItems() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

}