package org.dev.book.pedia.books.domain

import kotlinx.coroutines.flow.Flow
import org.dev.book.pedia.core.domain.DataError
import org.dev.book.pedia.core.domain.EmptyResult
import org.dev.book.pedia.core.domain.Result

interface BooKRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): Result<String?, DataError>
    fun getFavoriteBooks(): Flow<List<Book>>
    fun isBookFavorite(id: String): Flow<Boolean>
    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(id: String)
}