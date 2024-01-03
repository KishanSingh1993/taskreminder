package `in`.eduforyou.taskreminder.DataStorage

import `in`.eduforyou.taskreminder.repository.Note
import `in`.eduforyou.taskreminder.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class repositoryImplement @Inject constructor(private val dao: Repository) : Repository {

    override suspend fun insertNote(note: Note) = dao.insertNote(note = note)
    override suspend fun updateNote(note: Note) = dao.updateNote(note = note)
    override suspend fun deleteNote(note: Note) = dao.deleteNote(note = note)
    override fun getNotes(): Flow<List<Note>> = dao.getNotes()
    override suspend fun getByIdNote(id: Int): Note= dao.getByIdNote(id)
    // Implement deleteAllNotes
    override  suspend fun deleteAllNotes() {
        dao.deleteAllNotes()
    }
}