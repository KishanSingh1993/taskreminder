package `in`.eduforyou.taskreminder.usecase



import `in`.eduforyou.taskreminder.DataStorage.repositoryImplement
import `in`.eduforyou.taskreminder.repository.Note
import javax.inject.Inject

class DeleteNote @Inject constructor(private val deletreposity: repositoryImplement) {
    suspend operator fun invoke(note: Note)=deletreposity.deleteNote(note)
}