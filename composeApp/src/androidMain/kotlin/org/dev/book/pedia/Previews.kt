package org.dev.book.pedia


import BookListScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import org.dev.book.pedia.books.domain.Book
import org.dev.book.pedia.books.presentation.book_list.BookListState
import org.dev.book.pedia.books.presentation.book_list.component.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Amar Pal Singh"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67854,
        ratingsCount = 5,
        numPages = 100,
        numEdition = 3
    )
}

@Preview
@Composable
 private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResult = books,
            isLoading = false
        ),
        onAction = {}
    )
}