package io.kvstore.api.representationals.collections;

public class CreateCollection {

    private String collection;

    private Boolean public_write;

    private String email_notification;

    private String webhook;

    private String webhook_secret;

    public String getCollection() {
        return this.collection;
    }

    public Boolean getPublic_write() {
        return this.public_write;
    }

    public String getEmail_notification() {
        return this.email_notification;
    }

    public String getWebhook() {
        return this.webhook;
    }

    public String getWebhook_secret() {
        return this.webhook_secret;
    }

    public CreateCollection setCollection(String collection) {
        this.collection = collection;
        return this;
    }

    public CreateCollection setPublic_write(Boolean public_write) {
        this.public_write = public_write;
        return this;
    }

    public CreateCollection setEmail_notification(String email_notification) {
        this.email_notification = email_notification;
        return this;
    }

    public CreateCollection setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    public CreateCollection setWebhook_secret(String webhook_secret) {
        this.webhook_secret = webhook_secret;
        return this;
    }

    public String toString() {
        return "CreateCollection(collection=" + this.getCollection() + ", publicWrite=" + this.getPublic_write() + ", email_notification=" + this.getEmail_notification() + ", webhook=" + this.getWebhook() + ", webhook_secret=" + this.getWebhook_secret() + ")";
    }

}
