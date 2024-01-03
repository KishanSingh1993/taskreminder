package `in`.eduforyou.taskreminder.usecase

import `in`.eduforyou.taskreminder.DataStorage.repositoryImplement
import javax.inject.Inject

class GetNotes @Inject constructor(private val getreposity: repositoryImplement) {
    operator fun invoke()=getreposity.getNotes()
}