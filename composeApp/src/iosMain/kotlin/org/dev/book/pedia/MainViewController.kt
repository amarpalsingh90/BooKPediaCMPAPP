package org.dev.book.pedia

import androidx.compose.ui.window.ComposeUIViewController
import org.dev.book.pedia.app.App
import org.dev.book.pedia.core.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }