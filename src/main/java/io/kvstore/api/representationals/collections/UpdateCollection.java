package io.kvstore.api.representationals.collections;

import java.util.Objects;

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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpdateCollection)) return false;
        final UpdateCollection other = (UpdateCollection) o;
        if (!other.canEqual(this)) return false;
        final Object this$public_write = this.getPublic_write();
        final Object other$public_write = other.getPublic_write();
        if (!Objects.equals(this$public_write, other$public_write))
            return false;
        final Object this$public_read = this.getPublic_read();
        final Object other$public_read = other.getPublic_read();
        if (!Objects.equals(this$public_read, other$public_read))
            return false;
        final Object this$email_notification = this.getEmail_notification();
        final Object other$email_notification = other.getEmail_notification();
        if (!Objects.equals(this$email_notification, other$email_notification))
            return false;
        final Object this$webhook = this.getWebhook();
        final Object other$webhook = other.getWebhook();
        if (!Objects.equals(this$webhook, other$webhook)) return false;
        final Object this$webhook_secret = this.getWebhook_secret();
        final Object other$webhook_secret = other.getWebhook_secret();
        return Objects.equals(this$webhook_secret, other$webhook_secret);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UpdateCollection;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $public_write = this.getPublic_write();
        result = result * PRIME + ($public_write == null ? 43 : $public_write.hashCode());
        final Object $public_read = this.getPublic_read();
        result = result * PRIME + ($public_read == null ? 43 : $public_read.hashCode());
        final Object $email_notification = this.getEmail_notification();
        result = result * PRIME + ($email_notification == null ? 43 : $email_notification.hashCode());
        final Object $webhook = this.getWebhook();
        result = result * PRIME + ($webhook == null ? 43 : $webhook.hashCode());
        final Object $webhook_secret = this.getWebhook_secret();
        result = result * PRIME + ($webhook_secret == null ? 43 : $webhook_secret.hashCode());
        return result;
    }

    public String toString() {
        return "UpdateCollection(public_write=" + this.getPublic_write() + ", public_read=" + this.getPublic_read() + ", email_notification=" + this.getEmail_notification() + ", webhook=" + this.getWebhook() + ", webhook_secret=" + this.getWebhook_secret() + ")";
    }

}