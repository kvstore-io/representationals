package io.kvstore.api.representationals.collections;

public class CollectionInfoCompact {

    private Integer items;

    private double created_at;

    private double updated_at;

    CollectionInfoCompact(Integer items, double created_at, double updated_at) {
        this.items = items;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public static CollectionInfoCompactBuilder builder() {
        return new CollectionInfoCompactBuilder();
    }

    public Integer getItems() {
        return this.items;
    }

    public double getCreated_at() {
        return this.created_at;
    }

    public double getUpdated_at() {
        return this.updated_at;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public void setCreated_at(double created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(double updated_at) {
        this.updated_at = updated_at;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CollectionInfoCompact)) return false;
        final CollectionInfoCompact other = (CollectionInfoCompact) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        if (Double.compare(this.getCreated_at(), other.getCreated_at()) != 0) return false;
        if (Double.compare(this.getUpdated_at(), other.getUpdated_at()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CollectionInfoCompact;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $items = this.getItems();
        result = result * PRIME + ($items == null ? 43 : $items.hashCode());
        final long $created_at = Double.doubleToLongBits(this.getCreated_at());
        result = result * PRIME + (int) ($created_at >>> 32 ^ $created_at);
        final long $updated_at = Double.doubleToLongBits(this.getUpdated_at());
        result = result * PRIME + (int) ($updated_at >>> 32 ^ $updated_at);
        return result;
    }

    public String toString() {
        return "CollectionInfoCompact(items=" + this.getItems() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

    public static class CollectionInfoCompactBuilder {
        private Integer items;
        private double created_at;
        private double updated_at;

        CollectionInfoCompactBuilder() {
        }

        public CollectionInfoCompact.CollectionInfoCompactBuilder items(Integer items) {
            this.items = items;
            return this;
        }

        public CollectionInfoCompact.CollectionInfoCompactBuilder created_at(double created_at) {
            this.created_at = created_at;
            return this;
        }

        public CollectionInfoCompact.CollectionInfoCompactBuilder updated_at(double updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public CollectionInfoCompact build() {
            return new CollectionInfoCompact(items, created_at, updated_at);
        }

        public String toString() {
            return "CollectionInfoCompact.CollectionInfoCompactBuilder(items=" + this.items + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
        }
    }
}