package `in`.eduforyou.taskreminder.usecase

import `in`.eduforyou.taskreminder.DataStorage.repositoryImplement
import `in`.eduforyou.taskreminder.repository.Note


class InsertNote constructor(private val insertreposity: repositoryImplement) {
    suspend operator fun invoke(note: Note)=insertreposity.insertNote(note)
}