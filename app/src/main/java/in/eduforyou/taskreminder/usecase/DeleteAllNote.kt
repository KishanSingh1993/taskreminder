package `in`.eduforyou.taskreminder.usecase

import `in`.eduforyou.taskreminder.DataStorage.repositoryImplement
import javax.inject.Inject


class DeleteAllNotes @Inject constructor(private val repository: repositoryImplement) {
    suspend operator fun invoke() {
        repository.deleteAllNotes()
    }
}