package io.kvstore.api.representationals.collections;

public class CreateCollection {

    private String collection;

    private Boolean publicWrite;

    private String email_notification;

    private String webhook;

    private String webhook_secret;

    CreateCollection(String collection, Boolean publicWrite, String email_notification, String webhook, String webhook_secret) {
        this.collection = collection;
        this.publicWrite = publicWrite;
        this.email_notification = email_notification;
        this.webhook = webhook;
        this.webhook_secret = webhook_secret;
    }

    public static CreateCollectionBuilder builder() {
        return new CreateCollectionBuilder();
    }

    public String getCollection() {
        return this.collection;
    }

    public Boolean getPublicWrite() {
        return this.publicWrite;
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

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public void setPublicWrite(Boolean publicWrite) {
        this.publicWrite = publicWrite;
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
        if (!(o instanceof CreateCollection)) return false;
        final CreateCollection other = (CreateCollection) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$collection = this.getCollection();
        final Object other$collection = other.getCollection();
        if (this$collection == null ? other$collection != null : !this$collection.equals(other$collection))
            return false;
        final Object this$publicWrite = this.getPublicWrite();
        final Object other$publicWrite = other.getPublicWrite();
        if (this$publicWrite == null ? other$publicWrite != null : !this$publicWrite.equals(other$publicWrite))
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
        return other instanceof CreateCollection;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $collection = this.getCollection();
        result = result * PRIME + ($collection == null ? 43 : $collection.hashCode());
        final Object $publicWrite = this.getPublicWrite();
        result = result * PRIME + ($publicWrite == null ? 43 : $publicWrite.hashCode());
        final Object $email_notification = this.getEmail_notification();
        result = result * PRIME + ($email_notification == null ? 43 : $email_notification.hashCode());
        final Object $webhook = this.getWebhook();
        result = result * PRIME + ($webhook == null ? 43 : $webhook.hashCode());
        final Object $webhook_secret = this.getWebhook_secret();
        result = result * PRIME + ($webhook_secret == null ? 43 : $webhook_secret.hashCode());
        return result;
    }

    public String toString() {
        return "CreateCollection(collection=" + this.getCollection() + ", publicWrite=" + this.getPublicWrite() + ", email_notification=" + this.getEmail_notification() + ", webhook=" + this.getWebhook() + ", webhook_secret=" + this.getWebhook_secret() + ")";
    }

    public static class CreateCollectionBuilder {
        private String collection;
        private Boolean publicWrite;
        private String email_notification;
        private String webhook;
        private String webhook_secret;

        CreateCollectionBuilder() {
        }

        public CreateCollection.CreateCollectionBuilder collection(String collection) {
            this.collection = collection;
            return this;
        }

        public CreateCollection.CreateCollectionBuilder publicWrite(Boolean publicWrite) {
            this.publicWrite = publicWrite;
            return this;
        }

        public CreateCollection.CreateCollectionBuilder email_notification(String email_notification) {
            this.email_notification = email_notification;
            return this;
        }

        public CreateCollection.CreateCollectionBuilder webhook(String webhook) {
            this.webhook = webhook;
            return this;
        }

        public CreateCollection.CreateCollectionBuilder webhook_secret(String webhook_secret) {
            this.webhook_secret = webhook_secret;
            return this;
        }

        public CreateCollection build() {
            return new CreateCollection(collection, publicWrite, email_notification, webhook, webhook_secret);
        }

        public String toString() {
            return "CreateCollection.CreateCollectionBuilder(collection=" + this.collection + ", publicWrite=" + this.publicWrite + ", email_notification=" + this.email_notification + ", webhook=" + this.webhook + ", webhook_secret=" + this.webhook_secret + ")";
        }
    }
}
