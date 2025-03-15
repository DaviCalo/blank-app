package com.example.blank_app.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blank_app.model.BlankModel
import com.example.blank_app.repositories.interfaces.IBlankAppApiService
import com.example.blank_app.ui.states.BlankUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

// MORE INFORMATION VIEW MODEL: https://developer.android.com/topic/libraries/architecture/viewmodel

class BlankViewModel(
    private val iBlankAppApiService: IBlankAppApiService,
) : ViewModel() {
    private val _uiState: MutableStateFlow<BlankUiState> =
        MutableStateFlow(BlankUiState())

    val uiState = _uiState.asStateFlow()

    fun get(
        path: String,
        authorization: String
    ) {
        viewModelScope.launch {
            try {
                val path = path
                val authorization = authorization

                val result: BlankModel =
                    iBlankAppApiService.get(path, authorization)

                setResult(result.path.toString())

            } catch (e: Exception) {
               println(e.message)
            }
        }
    }

    private fun setResult(path: String) {
        _uiState.update {
            it.copy(
                path = path
            )
        }
    }
}