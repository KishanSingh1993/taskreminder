package `in`.eduforyou.taskreminder.DataStorage

import androidx.room.Database
import androidx.room.RoomDatabase
import `in`.eduforyou.taskreminder.repository.Note
import `in`.eduforyou.taskreminder.repository.Repository

@Database(entities = [Note::class], exportSchema = false, version = 1)
abstract class TaskDetails: RoomDatabase() {

    abstract fun note(): Repository

}