package online.scattergories.kommon.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a ScattergoriesOnline game.
 *
 * @property id The game's ID.
 * @property language The game's language.
 * @property maxPlayers The game's maximum number of players.
 * @property pin The game's pin if enabled.
 * @property inviteOnly Whether the game is invite only.
 * @property createdBy The user who created the game.
 * @property createdAt The time the game was created.
 * @property updatedAt The time the game was last updated.
 */
@Serializable
public data class Game(
    public val id: String,
    public var language: String,
    @SerialName("max_players")
    public var maxPlayers: Int,
    public var pin: String,
    @SerialName("invite_only")
    public var inviteOnly: Boolean,
    @SerialName("created_by")
    public val createdBy: String,
    @SerialName("created_at")
    public val createdAt: String,
    @SerialName("updated_at")
    public var updatedAt: String,
)
