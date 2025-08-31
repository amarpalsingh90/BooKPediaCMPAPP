package org.dev.book.pedia.books.presentation.book_list

import org.dev.book.pedia.books.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelected(val index: Int): BookListAction

}