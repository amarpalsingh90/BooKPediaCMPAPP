package org.dev.book.pedia.books.data.database

import androidx.room.RoomDatabaseConstructor

actual object BookDatabaseConstructor :
    RoomDatabaseConstructor<FavoriteBookDatabase> {
    actual override fun initialize(): FavoriteBookDatabase {
        TODO("Not yet implemented")
    }
}

