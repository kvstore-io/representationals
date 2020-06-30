package io.kvstore.api.representationals.collections;

public class UpdateCollection {

    private Boolean public_write;

    private Boolean public_read;

    private String email_notification;

    private String webhook;

    private String webhook_secret;

    public Boolean getPublic_write() {
        return this.public_write;
    }

    public Boolean getPublic_read() {
        return this.public_read;
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

    public UpdateCollection setPublic_write(Boolean public_write) {
        this.public_write = public_write;
        return this;
    }

    public UpdateCollection setPublic_read(Boolean public_read) {
        this.public_read = public_read;
        return this;
    }

    public UpdateCollection setEmail_notification(String email_notification) {
        this.email_notification = email_notification;
        return this;
    }

    public UpdateCollection setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    public UpdateCollection setWebhook_secret(String webhook_secret) {
        this.webhook_secret = webhook_secret;
        return this;
    }

    public String toString() {
        return "UpdateCollection(public_write=" + this.getPublic_write() + ", public_read=" + this.getPublic_read() + ", email_notification=" + this.getEmail_notification() + ", webhook=" + this.getWebhook() + ", webhook_secret=" + this.getWebhook_secret() + ")";
    }

}