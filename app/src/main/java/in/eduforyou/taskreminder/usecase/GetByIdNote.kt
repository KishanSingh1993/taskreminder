package `in`.eduforyou.taskreminder.usecase

import `in`.eduforyou.taskreminder.DataStorage.repositoryImplement
import javax.inject.Inject

class GetByIdNote @Inject constructor(private val getIdreposity: repositoryImplement) {
    suspend operator fun invoke(id:Int)=getIdreposity.getByIdNote(id)
}