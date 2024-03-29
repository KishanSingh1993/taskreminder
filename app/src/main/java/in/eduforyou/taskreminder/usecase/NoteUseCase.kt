package `in`.eduforyou.taskreminder.usecase

data class NoteUseCase (
    val getNotes: GetNotes,
    val insertNote: InsertNote,
    val deleteNote: DeleteNote,
    val deleteAllNotes: DeleteAllNotes,
    val updateNote: UpdateNote,
    val getByIdNote: GetByIdNote
)