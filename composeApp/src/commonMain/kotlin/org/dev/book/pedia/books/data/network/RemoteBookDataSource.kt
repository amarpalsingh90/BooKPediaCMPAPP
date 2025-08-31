package org.dev.book.pedia.books.data.network

import org.dev.book.pedia.books.data.dto.BookWorkDto
import org.dev.book.pedia.books.data.dto.SearchResponseDto
import org.dev.book.pedia.core.domain.DataError
import org.dev.book.pedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}