package io.kvstore.api.representationals.users;

import java.util.UUID;

public class UserFull {

    private String email;

    private UUID storage_uuid;

    private String api_key;

    UserFull(String email, UUID storage_uuid, String api_key) {
        this.email = email;
        this.storage_uuid = storage_uuid;
        this.api_key = api_key;
    }

    public static UserFullBuilder builder() {
        return new UserFullBuilder();
    }

    public String getEmail() {
        return this.email;
    }

    public UUID getStorage_uuid() {
        return this.storage_uuid;
    }

    public String getApi_key() {
        return this.api_key;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStorage_uuid(UUID storage_uuid) {
        this.storage_uuid = storage_uuid;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserFull)) return false;
        final UserFull other = (UserFull) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$storage_uuid = this.getStorage_uuid();
        final Object other$storage_uuid = other.getStorage_uuid();
        if (this$storage_uuid == null ? other$storage_uuid != null : !this$storage_uuid.equals(other$storage_uuid))
            return false;
        final Object this$api_key = this.getApi_key();
        final Object other$api_key = other.getApi_key();
        if (this$api_key == null ? other$api_key != null : !this$api_key.equals(other$api_key)) return false;
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

    public static class UserFullBuilder {
        private String email;
        private UUID storage_uuid;
        private String api_key;

        UserFullBuilder() {
        }

        public UserFull.UserFullBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserFull.UserFullBuilder storage_uuid(UUID storage_uuid) {
            this.storage_uuid = storage_uuid;
            return this;
        }

        public UserFull.UserFullBuilder api_key(String api_key) {
            this.api_key = api_key;
            return this;
        }

        public UserFull build() {
            return new UserFull(email, storage_uuid, api_key);
        }

        public String toString() {
            return "UserFull.UserFullBuilder(email=" + this.email + ", storage_uuid=" + this.storage_uuid + ", api_key=" + this.api_key + ")";
        }
    }
}