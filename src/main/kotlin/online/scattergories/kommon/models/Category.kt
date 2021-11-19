package online.scattergories.kommon.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a ScattergoriesOnline category.
 *
 * @property id The category's unique ID.
 * @property displayName The category's display name.
 * @property language The category's language.
 * @property createdBy The user who created the category.
 * @property createdAt The date the category was created.
 * @property updatedAt The date the category was last updated.
 */
@Serializable
public data class Category(
    public val id: String,
    @SerialName("display_name")
    public var displayName: String,
    public var language: String,
    @SerialName("created_by")
    public val createdBy: String,
    @SerialName("created_at")
    public val createdAt: String,
    @SerialName("updated_at")
    public var updatedAt: String
)

/**
 * Represents a partial ScattergoriesOnline category.
 *
 * @property id The category's unique ID.
 * @property displayName The category's display name.
 * @property language The category's language.
 */
@Serializable
public data class PartialCategory(
    public val id: String,
    @SerialName("display_name")
    public val displayName: String,
    public val language: String
)