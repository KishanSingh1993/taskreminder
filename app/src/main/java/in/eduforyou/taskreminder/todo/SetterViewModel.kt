package `in`.eduforyou.taskreminder.todo


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.eduforyou.taskreminder.repository.Note
import `in`.eduforyou.taskreminder.usecase.NoteUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SetterViewModel @Inject constructor(private val useCase: NoteUseCase) : ViewModel() {
    var title by mutableStateOf("")
    var discription by mutableStateOf("")
    var modeColor by mutableStateOf(Color.Green.toArgb())

    fun addNote() = viewModelScope.launch {
        useCase.insertNote(Note(DataTitle = title, DataDescription = discription, DataColor = modeColor))
    }
}