package online.scattergories.kommon.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a ScattergoriesOnline user.
 *
 * @property id The user's unique ID.
 * @property username The user's username.
 * @property createdAt The date the user was created.
 * @property updatedAt The date the user was last updated.
 */
@Serializable
public data class User(
    val id: String,
    public var username: String,
    @SerialName("created_at")
    public val createdAt: String,
    @SerialName("updated_at")
    public var updatedAt: String
)

/**
 * Represents a partial ScattergoriesOnline user.
 *
 * @property id The user's unique ID.
 * @property username The user's username.
 */
@Serializable
public data class PartialUser(
    val id: String,
    public var username: String
)
