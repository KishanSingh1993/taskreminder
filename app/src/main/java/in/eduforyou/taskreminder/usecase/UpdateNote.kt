package `in`.eduforyou.taskreminder.usecase


import `in`.eduforyou.taskreminder.DataStorage.repositoryImplement
import `in`.eduforyou.taskreminder.repository.Note
import javax.inject.Inject

class UpdateNote @Inject constructor(private val updatereposity: repositoryImplement) {
    suspend operator fun invoke(note: Note)=updatereposity.updateNote(note)
}