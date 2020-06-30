package io.kvstore.api.representationals.users;

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

    public String toString() {
        return "UserFull(email=" + this.getEmail() + ", storage_uuid=" + this.getStorage_uuid() + ", api_key=" + this.getApi_key() + ")";
    }

}