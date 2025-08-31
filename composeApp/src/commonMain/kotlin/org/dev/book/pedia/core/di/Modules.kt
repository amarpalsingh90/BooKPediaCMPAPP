package org.dev.book.pedia.core.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.dev.book.pedia.books.data.database.DatabaseFactory
import org.dev.book.pedia.books.data.database.FavoriteBookDatabase
import org.dev.book.pedia.books.data.network.KtorRemoteBookDataSource
import org.dev.book.pedia.books.data.network.RemoteBookDataSource
import org.dev.book.pedia.books.data.repository.DefaultBookRepository
import org.dev.book.pedia.books.domain.BooKRepository
import org.dev.book.pedia.books.presentation.SelectedBookViewModel
import org.dev.book.pedia.books.presentation.book_details.BookDetailViewModel
import org.dev.book.pedia.books.presentation.book_list.BookListViewModel
import org.dev.book.pedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module


val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BooKRepository>()
    viewModelOf(::BookListViewModel)
    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }
    viewModelOf(:: BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)


}