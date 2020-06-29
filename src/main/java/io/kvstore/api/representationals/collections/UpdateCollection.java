package io.kvstore.api.representationals.collections;

public class UpdateCollection {

    private Boolean public_write;

    private Boolean public_read;

    private String email_notification;

    private String webhook;

    private String webhook_secret;

    UpdateCollection(Boolean public_write, Boolean public_read, String email_notification, String webhook, String webhook_secret) {
        this.public_write = public_write;
        this.public_read = public_read;
        this.email_notification = email_notification;
        this.webhook = webhook;
        this.webhook_secret = webhook_secret;
    }

    public static UpdateCollectionBuilder builder() {
        return new UpdateCollectionBuilder();
    }

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

    public void setPublic_write(Boolean public_write) {
        this.public_write = public_write;
    }

    public void setPublic_read(Boolean public_read) {
        this.public_read = public_read;
    }

    public void setEmail_notification(String email_notification) {
        this.email_notification = email_notification;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    public void setWebhook_secret(String webhook_secret) {
        this.webhook_secret = webhook_secret;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpdateCollection)) return false;
        final UpdateCollection other = (UpdateCollection) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$public_write = this.getPublic_write();
        final Object other$public_write = other.getPublic_write();
        if (this$public_write == null ? other$public_write != null : !this$public_write.equals(other$public_write))
            return false;
        final Object this$public_read = this.getPublic_read();
        final Object other$public_read = other.getPublic_read();
        if (this$public_read == null ? other$public_read != null : !this$public_read.equals(other$public_read))
            return false;
        final Object this$email_notification = this.getEmail_notification();
        final Object other$email_notification = other.getEmail_notification();
        if (this$email_notification == null ? other$email_notification != null : !this$email_notification.equals(other$email_notification))
            return false;
        final Object this$webhook = this.getWebhook();
        final Object other$webhook = other.getWebhook();
        if (this$webhook == null ? other$webhook != null : !this$webhook.equals(other$webhook)) return false;
        final Object this$webhook_secret = this.getWebhook_secret();
        final Object other$webhook_secret = other.getWebhook_secret();
        if (this$webhook_secret == null ? other$webhook_secret != null : !this$webhook_secret.equals(other$webhook_secret))
            return false;
        return true;
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

    public static class UpdateCollectionBuilder {
        private Boolean public_write;
        private Boolean public_read;
        private String email_notification;
        private String webhook;
        private String webhook_secret;

        UpdateCollectionBuilder() {
        }

        public UpdateCollection.UpdateCollectionBuilder public_write(Boolean public_write) {
            this.public_write = public_write;
            return this;
        }

        public UpdateCollection.UpdateCollectionBuilder public_read(Boolean public_read) {
            this.public_read = public_read;
            return this;
        }

        public UpdateCollection.UpdateCollectionBuilder email_notification(String email_notification) {
            this.email_notification = email_notification;
            return this;
        }

        public UpdateCollection.UpdateCollectionBuilder webhook(String webhook) {
            this.webhook = webhook;
            return this;
        }

        public UpdateCollection.UpdateCollectionBuilder webhook_secret(String webhook_secret) {
            this.webhook_secret = webhook_secret;
            return this;
        }

        public UpdateCollection build() {
            return new UpdateCollection(public_write, public_read, email_notification, webhook, webhook_secret);
        }

        public String toString() {
            return "UpdateCollection.UpdateCollectionBuilder(public_write=" + this.public_write + ", public_read=" + this.public_read + ", email_notification=" + this.email_notification + ", webhook=" + this.webhook + ", webhook_secret=" + this.webhook_secret + ")";
        }
    }
}