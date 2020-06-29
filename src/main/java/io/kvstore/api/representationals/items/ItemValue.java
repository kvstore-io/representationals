package io.kvstore.api.representationals.items;

import java.util.Objects;

public class ItemValue {

    private String value;

    private Double created_at;

    private Double updated_at;

    public String getValue() {
        return this.value;
    }

    public Double getCreated_at() {
        return this.created_at;
    }

    public Double getUpdated_at() {
        return this.updated_at;
    }

    public ItemValue setValue(String value) {
        this.value = value;
        return this;
    }

    public ItemValue setCreated_at(Double created_at) {
        this.created_at = created_at;
        return this;
    }

    public ItemValue setUpdated_at(Double updated_at) {
        this.updated_at = updated_at;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ItemValue)) return false;
        final ItemValue other = (ItemValue) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (!Objects.equals(this$value, other$value)) return false;
        final Object this$created_at = this.getCreated_at();
        final Object other$created_at = other.getCreated_at();
        if (!Objects.equals(this$created_at, other$created_at))
            return false;
        final Object this$updated_at = this.getUpdated_at();
        final Object other$updated_at = other.getUpdated_at();
        if (!Objects.equals(this$updated_at, other$updated_at))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ItemValue;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        final Object $created_at = this.getCreated_at();
        result = result * PRIME + ($created_at == null ? 43 : $created_at.hashCode());
        final Object $updated_at = this.getUpdated_at();
        result = result * PRIME + ($updated_at == null ? 43 : $updated_at.hashCode());
        return result;
    }

    public String toString() {
        return "ItemValue(value=" + this.getValue() + ", created_at=" + this.getCreated_at() + ", updated_at=" + this.getUpdated_at() + ")";
    }

}