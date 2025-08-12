package io.music_assistant.client.data.model.server

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResult(
    @SerialName("artists") val artists: List<ServerMediaItem>,
    @SerialName("albums") val albums: List<ServerMediaItem>,
    @SerialName("tracks") val tracks: List<ServerMediaItem>,
    @SerialName("playlists") val playlists: List<ServerMediaItem>,
)
