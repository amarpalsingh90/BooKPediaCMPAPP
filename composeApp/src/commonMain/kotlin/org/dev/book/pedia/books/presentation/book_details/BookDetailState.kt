package org.dev.book.pedia.books.presentation.book_details

import org.dev.book.pedia.books.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)