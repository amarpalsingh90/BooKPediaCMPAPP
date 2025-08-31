package org.dev.book.pedia.books.data.repository

import androidx.sqlite.SQLiteException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.dev.book.pedia.books.data.database.FavoriteBookDao
import org.dev.book.pedia.books.data.mapper.toBook
import org.dev.book.pedia.books.data.mapper.toBookEntity
import org.dev.book.pedia.books.data.network.RemoteBookDataSource
import org.dev.book.pedia.books.domain.BooKRepository
import org.dev.book.pedia.books.domain.Book
import org.dev.book.pedia.core.domain.DataError
import org.dev.book.pedia.core.domain.EmptyResult
import org.dev.book.pedia.core.domain.Result
import org.dev.book.pedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
    private val favoriteBookDao: FavoriteBookDao

) : BooKRepository{
  override  suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }


    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {

        return  remoteBookDataSource
            .getBookDetails(bookId)
            .map { it.description }
    }


    override fun getFavoriteBooks(): Flow<List<Book>> {
        return favoriteBookDao
            .getFavoriteBooks()
            .map { bookEntities ->
                bookEntities.map { it.toBook() }
            }
    }

    override fun isBookFavorite(id: String): Flow<Boolean> {
        return favoriteBookDao
            .getFavoriteBooks()
            .map { bookEntities ->
                bookEntities.any { it.id == id }
            }
    }

    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
        return try {
            favoriteBookDao.upsert(book.toBookEntity())
            Result.Success(Unit)
        } catch(e: SQLiteException) {
            Result.Error(DataError.Local.DISK_FULL)
        }
    }

    override suspend fun deleteFromFavorites(id: String) {
        favoriteBookDao.deleteFavoriteBook(id)
    }



}

