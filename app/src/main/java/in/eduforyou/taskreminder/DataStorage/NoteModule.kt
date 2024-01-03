package `in`.eduforyou.taskreminder.DataStorage

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import `in`.eduforyou.taskreminder.usecase.DeleteAllNotes
import `in`.eduforyou.taskreminder.usecase.DeleteNote
import `in`.eduforyou.taskreminder.usecase.GetByIdNote
import `in`.eduforyou.taskreminder.usecase.GetNotes
import `in`.eduforyou.taskreminder.usecase.InsertNote
import `in`.eduforyou.taskreminder.usecase.NoteUseCase
import `in`.eduforyou.taskreminder.usecase.UpdateNote


@Module
@InstallIn(SingletonComponent::class)
object NoteModule {


    @Provides
    fun provideDataBase(@ApplicationContext context: Context):TaskDetails= Room.databaseBuilder(
        context=context,
        klass = TaskDetails::class.java,
        name = "NoteDB"
    ).build()

    @Provides
    fun provideDao(dao: TaskDetails)=dao.note()

    @Provides
    fun provideNoteUseCase(repository: repositoryImplement)= NoteUseCase(
        getNotes = GetNotes(repository),
        getByIdNote = GetByIdNote(repository),
        deleteNote = DeleteNote(repository),
        updateNote = UpdateNote(repository),
        insertNote = InsertNote(repository),
        deleteAllNotes = DeleteAllNotes(repository)
    )

}