package org.dev.book.pedia.books.data.mapper

import org.dev.book.pedia.books.data.database.BookEntity
import org.dev.book.pedia.books.data.dto.SearchedBookDto
import org.dev.book.pedia.books.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
            id = id.substringAfterLast("/"),
            title = title,
            imageUrl = if(coverKey != null) {
                "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
            } else {
                "https://covers.openlibrary.org/b/id/${coverAlternativeKey}-L.jpg"
            },
            authors = authorNames ?: emptyList(),
            description = null,
            languages = languages ?: emptyList(),
            firstPublishYear = firstPublishYear.toString(),
            averageRating = ratingsAverage,
            ratingsCount = ratingsCount,
            numPages = numPagesMedian,
            numEdition = numEditions ?: 0
    )
}

fun Book.toBookEntity(): BookEntity {
    return BookEntity(
        id = id,
        title = title,
        description = description,
        imageUrl = imageUrl,
        languages = languages,
        authors = authors,
        firstPublishYear = firstPublishYear,
        ratingsAverage = averageRating,
        ratingsCount = ratingsCount,
        numPagesMedian = numPages,
        numEditions = numEdition
    )
}


fun BookEntity.toBook(): Book {
    return Book(
        id = id,
        title = title,
        description = description,
        imageUrl = imageUrl,
        languages = languages,
        authors = authors,
        firstPublishYear = firstPublishYear,
        averageRating = ratingsAverage,
        ratingsCount = ratingsCount,
        numPages = numPagesMedian,
        numEdition = numEditions
    )
}