package io.kvstore.api.representationals.items;

public class Item {

    private String key;

    private String value;

    private Double created_at;

    private Double updated_at;

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public Double getCreated_at() {
        return this.created_at;
    }

    public Double getUpdated_at() {
        return this.updated_at;
    }

    public Item setKey(String key) {
        this.key = key;
        return this;
    }

    public Item setValue(String value) {
        this.value = value;
        return this;
    }

    public Item setCreated_at(Double created_at) {
        this.created_at = created_at;
        return this;
    }

    public Item setUpdated_at(Double updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public String toString() {
        return "Item(key=" + this.getKey() + ", value=" + this.getValue() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

}