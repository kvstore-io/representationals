package io.kvstore.api.representationals.users;

import java.util.Objects;
import java.util.UUID;

public class UserFull {

    private String email;

    private UUID storage_uuid;

    private String api_key;

    public String getEmail() {
        return this.email;
    }

    public UUID getStorage_uuid() {
        return this.storage_uuid;
    }

    public String getApi_key() {
        return this.api_key;
    }

    public UserFull setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserFull setStorage_uuid(UUID storage_uuid) {
        this.storage_uuid = storage_uuid;
        return this;
    }

    public UserFull setApi_key(String api_key) {
        this.api_key = api_key;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserFull)) return false;
        final UserFull other = (UserFull) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (!Objects.equals(this$email, other$email)) return false;
        final Object this$storage_uuid = this.getStorage_uuid();
        final Object other$storage_uuid = other.getStorage_uuid();
        if (!Objects.equals(this$storage_uuid, other$storage_uuid))
            return false;
        final Object this$api_key = this.getApi_key();
        final Object other$api_key = other.getApi_key();
        if (!Objects.equals(this$api_key, other$api_key)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserFull;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $storage_uuid = this.getStorage_uuid();
        result = result * PRIME + ($storage_uuid == null ? 43 : $storage_uuid.hashCode());
        final Object $api_key = this.getApi_key();
        result = result * PRIME + ($api_key == null ? 43 : $api_key.hashCode());
        return result;
    }

    public String toString() {
        return "UserFull(email=" + this.getEmail() + ", storage_uuid=" + this.getStorage_uuid() + ", api_key=" + this.getApi_key() + ")";
    }

}