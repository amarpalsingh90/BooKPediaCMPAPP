package org.dev.book.pedia.books.data.database

import androidx.room.RoomDatabaseConstructor

@Suppress(names = ["NO_ACTUAL_FOR_EXPECT"])
actual object BookDatabaseConstructor :
    RoomDatabaseConstructor<FavoriteBookDatabase> {
    actual override fun initialize(): FavoriteBookDatabase {
        TODO("Not yet implemented")
    }
}