package edu.metrostate.ics342.mediatracker.ui.detail

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

data class MediaDetailUiState(
    val isLoading: Boolean = false,
    val title: String = "",
    val author: String = "",
    val description: String = "",
    val year: String = "",
    val pages: Int = 0,
    val genre: String = "",
    val rating: Float = 0f,
    val reviewCount: Int = 0,
    val error: String? = null
)

class MediaDetailViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(MediaDetailUiState())
    val uiState: StateFlow<MediaDetailUiState> = _uiState.asStateFlow()

    private var mediaId: Int = -1

    fun setMediaId(id: Int) {
        mediaId = id
        loadMedia()
    }

    private fun loadMedia() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)

            try {
                // TODO: replace with repository call
                // val media = repository.getMedia(mediaId)

                _uiState.value = MediaDetailUiState(
                    isLoading = false,
                    title = "Mai",
                    author = "Herbert",
                    description = "A noble family becomes embroiled...",
                    year = "1937",
                    pages = 310,
                    genre = "Fantasy",
                    rating = 4.8f,
                    reviewCount = 1234
                )

            } catch (e: Exception) {
                _uiState.value = MediaDetailUiState(
                    isLoading = false,
                    error = e.message
                )
            }
        }
    }
}