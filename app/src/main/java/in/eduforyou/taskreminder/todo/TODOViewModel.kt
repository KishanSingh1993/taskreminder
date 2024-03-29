package `in`.eduforyou.taskreminder.todo

import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.eduforyou.taskreminder.repository.Note
import `in`.eduforyou.taskreminder.usecase.NoteUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TODOViewModel @Inject constructor(private val useCase: NoteUseCase) : ViewModel() {
    val notes = useCase.getNotes()

    fun deleteNote(note: Note) = viewModelScope.launch {
        useCase.deleteNote(note)
    }

    // Function to delete all notes
    fun deleteAllNotes() = viewModelScope.launch {
        useCase.deleteAllNotes()
    }
}