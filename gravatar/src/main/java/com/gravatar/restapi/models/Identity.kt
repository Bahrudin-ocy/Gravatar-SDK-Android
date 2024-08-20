/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */
package com.gravatar.restapi.models

import com.google.gson.annotations.SerializedName
import java.util.Objects

/**
 * An identity associated with a user's Gravatar account.
 *
 * @param id Unique identifier for the identity.
 * @param email Email address associated with the identity.
 * @param emailHash SHA256 hash of the email address.
 * @param format Format of the associated image (e.g., JPEG, PNG).
 * @param rating Rating associated with the identity's image.
 * @param imageId Unique identifier for the identity's image.
 * @param imageUrl URL where the identity's image can be accessed.
 */

public class Identity private constructor(
    // Unique identifier for the identity.
    @SerializedName("id")
    public val id: kotlin.String,
    // Email address associated with the identity.
    @SerializedName("email")
    public val email: kotlin.String,
    // SHA256 hash of the email address.
    @SerializedName("email_hash")
    public val emailHash: kotlin.String,
    // Format of the associated image (e.g., JPEG, PNG).
    @SerializedName("format")
    public val format: kotlin.Int,
    // Rating associated with the identity's image.
    @SerializedName("rating")
    public val rating: kotlin.String,
    // Unique identifier for the identity's image.
    @SerializedName("image_id")
    public val imageId: kotlin.String,
    // URL where the identity's image can be accessed.
    @SerializedName("image_url")
    public val imageUrl: kotlin.String,
) {
    override fun toString(): String = "Identity(id=$id, email=$email, emailHash=$emailHash, format=$format, rating=$rating, imageId=$imageId, imageUrl=$imageUrl)"

    override fun equals(other: Any?): Boolean = other is Identity &&
        id == other.id &&
        email == other.email &&
        emailHash == other.emailHash &&
        format == other.format &&
        rating == other.rating &&
        imageId == other.imageId &&
        imageUrl == other.imageUrl

    override fun hashCode(): Int = Objects.hash(id, email, emailHash, format, rating, imageId, imageUrl)

    public class Builder {
        // Unique identifier for the identity.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var id: kotlin.String? = null

        // Email address associated with the identity.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var email: kotlin.String? = null

        // SHA256 hash of the email address.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var emailHash: kotlin.String? = null

        // Format of the associated image (e.g., JPEG, PNG).
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var format: kotlin.Int? = null

        // Rating associated with the identity's image.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var rating: kotlin.String? = null

        // Unique identifier for the identity's image.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var imageId: kotlin.String? = null

        // URL where the identity's image can be accessed.
        @set:JvmSynthetic // Hide 'void' setter from Java
        public var imageUrl: kotlin.String? = null

        public fun setId(id: kotlin.String?): Builder = apply { this.id = id }

        public fun setEmail(email: kotlin.String?): Builder = apply { this.email = email }

        public fun setEmailHash(emailHash: kotlin.String?): Builder = apply { this.emailHash = emailHash }

        public fun setFormat(format: kotlin.Int?): Builder = apply { this.format = format }

        public fun setRating(rating: kotlin.String?): Builder = apply { this.rating = rating }

        public fun setImageId(imageId: kotlin.String?): Builder = apply { this.imageId = imageId }

        public fun setImageUrl(imageUrl: kotlin.String?): Builder = apply { this.imageUrl = imageUrl }

        public fun build(): Identity = Identity(id!!, email!!, emailHash!!, format!!, rating!!, imageId!!, imageUrl!!)
    }
}

@JvmSynthetic // Hide from Java callers who should use Builder.
public fun Identity(initializer: Identity.Builder.() -> Unit): Identity {
    return Identity.Builder().apply(initializer).build()
}