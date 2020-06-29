package io.kvstore.api.representationals.collections;

import java.util.Objects;

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CollectionInfo)) return false;
        final CollectionInfo other = (CollectionInfo) o;
        if (!other.canEqual(this)) return false;
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        if (!Objects.equals(this$items, other$items)) return false;
        final Object this$public_write = this.getPublic_write();
        final Object other$public_write = other.getPublic_write();
        if (!Objects.equals(this$public_write, other$public_write))
            return false;
        final Object this$public_read = this.getPublic_read();
        final Object other$public_read = other.getPublic_read();
        if (!Objects.equals(this$public_read, other$public_read))
            return false;
        final Object this$webhook = this.getWebhook();
        final Object other$webhook = other.getWebhook();
        if (!Objects.equals(this$webhook, other$webhook)) return false;
        if (Double.compare(this.getCreated_at(), other.getCreated_at()) != 0) return false;
        if (Double.compare(this.getUpdated_at(), other.getUpdated_at()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CollectionInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $items = this.getItems();
        result = result * PRIME + ($items == null ? 43 : $items.hashCode());
        final Object $public_write = this.getPublic_write();
        result = result * PRIME + ($public_write == null ? 43 : $public_write.hashCode());
        final Object $public_read = this.getPublic_read();
        result = result * PRIME + ($public_read == null ? 43 : $public_read.hashCode());
        final Object $webhook = this.getWebhook();
        result = result * PRIME + ($webhook == null ? 43 : $webhook.hashCode());
        final long $created_at = Double.doubleToLongBits(this.getCreated_at());
        result = result * PRIME + (int) ($created_at >>> 32 ^ $created_at);
        final long $updated_at = Double.doubleToLongBits(this.getUpdated_at());
        result = result * PRIME + (int) ($updated_at >>> 32 ^ $updated_at);
        return result;
    }

    public String toString() {
        return "CollectionInfo(items=" + this.getItems() + ", public_write=" + this.getPublic_write() + ", public_read=" + this.getPublic_read() + ", webhook=" + this.getWebhook() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

}