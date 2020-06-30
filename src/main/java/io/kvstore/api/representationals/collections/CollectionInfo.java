package io.kvstore.api.representationals.collections;

public class CollectionInfo {

    private Integer items;

    private Boolean public_write;

    private Boolean public_read;

    private String webhook;

    private double created_at;

    private double updated_at;

    public Integer getItems() {
        return this.items;
    }

    public Boolean getPublic_write() {
        return this.public_write;
    }

    public Boolean getPublic_read() {
        return this.public_read;
    }

    public String getWebhook() {
        return this.webhook;
    }

    public double getCreated_at() {
        return this.created_at;
    }

    public double getUpdated_at() {
        return this.updated_at;
    }

    public CollectionInfo setItems(Integer items) {
        this.items = items;
        return this;
    }

    public CollectionInfo setPublic_write(Boolean public_write) {
        this.public_write = public_write;
        return this;
    }

    public CollectionInfo setPublic_read(Boolean public_read) {
        this.public_read = public_read;
        return this;
    }

    public CollectionInfo setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    public CollectionInfo setCreated_at(double created_at) {
        this.created_at = created_at;
        return this;
    }

    public CollectionInfo setUpdated_at(double updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public String toString() {
        return "CollectionInfo(items=" + this.getItems() + ", public_write=" + this.getPublic_write() + ", public_read=" + this.getPublic_read() + ", webhook=" + this.getWebhook() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

}