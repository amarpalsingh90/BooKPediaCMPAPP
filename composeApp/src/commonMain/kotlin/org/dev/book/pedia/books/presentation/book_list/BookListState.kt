package org.dev.book.pedia.books.presentation.book_list

import org.dev.book.pedia.books.domain.Book
import org.dev.book.pedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = emptyList(),
    val favoritesBooks: List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null

)