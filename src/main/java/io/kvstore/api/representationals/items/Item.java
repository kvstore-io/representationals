package io.kvstore.api.representationals.items;

public class Item {

    private String key;

    private String value;

    private Double created_at;

    private Double updated_at;

    Item(String key, String value, Double created_at, Double updated_at) {
        this.key = key;
        this.value = value;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public static ItemBuilder builder() {
        return new ItemBuilder();
    }

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

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCreated_at(Double created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(Double updated_at) {
        this.updated_at = updated_at;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Item)) return false;
        final Item other = (Item) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$key = this.getKey();
        final Object other$key = other.getKey();
        if (this$key == null ? other$key != null : !this$key.equals(other$key)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        final Object this$created_at = this.getCreated_at();
        final Object other$created_at = other.getCreated_at();
        if (this$created_at == null ? other$created_at != null : !this$created_at.equals(other$created_at))
            return false;
        final Object this$updated_at = this.getUpdated_at();
        final Object other$updated_at = other.getUpdated_at();
        if (this$updated_at == null ? other$updated_at != null : !this$updated_at.equals(other$updated_at))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Item;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $key = this.getKey();
        result = result * PRIME + ($key == null ? 43 : $key.hashCode());
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $created_at = this.getCreated_at();
        result = result * PRIME + ($created_at == null ? 43 : $created_at.hashCode());
        final Object $updated_at = this.getUpdated_at();
        result = result * PRIME + ($updated_at == null ? 43 : $updated_at.hashCode());
        return result;
    }

    public String toString() {
        return "Item(key=" + this.getKey() + ", value=" + this.getValue() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

    public static class ItemBuilder {
        private String key;
        private String value;
        private Double created_at;
        private Double updated_at;

        ItemBuilder() {
        }

        public Item.ItemBuilder key(String key) {
            this.key = key;
            return this;
        }

        public Item.ItemBuilder value(String value) {
            this.value = value;
            return this;
        }

        public Item.ItemBuilder created_at(Double created_at) {
            this.created_at = created_at;
            return this;
        }

        public Item.ItemBuilder updated_at(Double updated_at) {
            this.updated_at = updated_at;
            return this;
        }

        public Item build() {
            return new Item(key, value, created_at, updated_at);
        }

        public String toString() {
            return "Item.ItemBuilder(key=" + this.key + ", value=" + this.value + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
        }
    }
}