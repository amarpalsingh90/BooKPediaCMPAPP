# 📚 BooKPedia

A modern, cross-platform book discovery and management application built with **Kotlin Multiplatform** and **Compose Multiplatform**. Discover books, manage your favorites, and enjoy a seamless experience across Android, iOS, and Desktop platforms.

![Platform Support](https://img.shields.io/badge/Platform-Android%20%7C%20iOS%20%7C%20Desktop-blue)
![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-purple)
![Compose](https://img.shields.io/badge/Compose-1.7.0-orange)
![License](https://img.shields.io/badge/License-MIT-green)

## ✨ Features

- 🔍 **Book Search**: Search through millions of books using the OpenLibrary API
- 📖 **Rich Book Details**: Comprehensive book information including covers, descriptions, and ratings
- ❤️ **Favorites Management**: Save and organize your favorite books locally
- 📱 **Cross-Platform**: Native experience on Android, iOS, and Desktop
- 🎨 **Modern UI**: Beautiful Material Design 3 interface with Compose Multiplatform
- 🌐 **Offline Support**: Access your favorites even without internet connection
- ⚡ **Performance**: Optimized for speed and smooth user experience

## 🏗️ Architecture

BooKPedia follows modern software architecture principles:

- **MVVM Pattern**: Clean separation of concerns with ViewModels
- **Repository Pattern**: Centralized data management
- **Dependency Injection**: Koin-based dependency management
- **Unidirectional Data Flow**: Predictable state management
- **Clean Architecture**: Layered architecture for maintainability

## 🛠️ Technology Stack

| Component | Technology |
|-----------|------------|
| **Frontend** | Compose Multiplatform (Jetpack Compose) |
| **Backend** | Kotlin Multiplatform |
| **Database** | Room Database + SQLite |
| **Networking** | Ktor HTTP Client |
| **DI** | Koin |
| **Image Loading** | Coil |
| **Navigation** | Compose Navigation |
| **Serialization** | Kotlinx Serialization |

## 📱 Platform Support

| Platform | Status | Features |
|----------|--------|----------|
| **Android** | ✅ Full Support | Native Android features, Room database, Material Design |
| **iOS** | ✅ Full Support | Native iOS integration, SQLite, iOS-specific optimizations |
| **Desktop** | ✅ Full Support | JVM-based desktop app, window management |
| **Web** | 🔄 Planned | Future web implementation |

## 🚀 Getting Started

### Prerequisites

- **Android Development**: Android Studio Hedgehog or later
- **iOS Development**: Xcode 16.0 or later (for iOS builds)
- **Kotlin**: 2.0.21 or later
- **Java**: JDK 11 or later
- **Gradle**: 8.9 or later

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/BooKPedia.git
   cd BooKPedia
   ```

2. **Open in Android Studio**
   - Open the project in Android Studio
   - Sync Gradle files
   - Wait for all dependencies to download

3. **Build the project**
   ```bash
   ./gradlew build
   ```

### Running the App

#### Android
```bash
./gradlew :composeApp:installDebug
```

#### iOS
1. Open `iosApp/iosApp.xcodeproj` in Xcode
2. Select your target device/simulator
3. Build and run the project

#### Desktop
```bash
./gradlew :composeApp:run
```

## 📁 Project Structure

```
BooKPedia/
├── composeApp/                    # Shared Kotlin Multiplatform code
│   ├── src/
│   │   ├── commonMain/           # Common code for all platforms
│   │   │   ├── app/              # App-level components
│   │   │   ├── books/            # Book-related features
│   │   │   │   ├── data/         # Data layer (API, Database)
│   │   │   │   ├── domain/       # Business logic
│   │   │   │   └── presentation/ # UI components
│   │   │   └── core/             # Core utilities and DI
│   │   ├── androidMain/          # Android-specific implementations
│   │   ├── iosMain/              # iOS-specific implementations
│   │   ├── desktopMain/          # Desktop-specific implementations
│   │   └── nativeMain/           # Native platform implementations
│   └── build.gradle.kts          # Multiplatform build configuration
├── iosApp/                       # iOS application wrapper
├── gradle/                       # Gradle configuration and dependencies
├── IMPLEMENTATION_SUMMARY.md     # Detailed implementation documentation
└── README.md                     # This file
```

## 🔧 Configuration

### Environment Variables

The app uses the OpenLibrary API for book data. No API keys are required as it's a public API.

### Build Variants

- **Debug**: Development build with debugging enabled
- **Release**: Production build with optimizations

### Platform-Specific Settings

#### Android
- Minimum SDK: 24 (Android 7.0)
- Target SDK: 35 (Android 15)
- Compile SDK: 35

#### iOS
- Minimum iOS Version: 18.2
- Supports iPhone and iPad
- Universal app with adaptive layouts

#### Desktop
- JVM 11+ support
- Cross-platform window management
- Native desktop integration

## 📊 Data Flow

```
User Action → ViewModel → Repository → DataSource → API/Database
     ↑                                                      ↓
     ← UI Update ← State Management ← Data Processing ← Response
```

## 🧪 Testing

### Running Tests

```bash
# Unit tests
./gradlew test

# Android tests
./gradlew :composeApp:connectedAndroidTest

# iOS tests (from Xcode)
# Open project in Xcode and run tests
```

### Test Coverage

- **Unit Tests**: ViewModels, Repositories, Use Cases
- **Integration Tests**: Database, Network, UI
- **Platform Tests**: Platform-specific functionality

## 🚀 Building for Production

### Android APK
```bash
./gradlew :composeApp:assembleRelease
```

### Android App Bundle
```bash
./gradlew :composeApp:bundleRelease
```

### iOS Framework
```bash
./gradlew :composeApp:embedAndSignAppleFrameworkForXcode
```

### Desktop JAR
```bash
./gradlew :composeApp:desktopJar
```

## 🔒 Security & Privacy

- **HTTPS Only**: All network communication uses HTTPS
- **Local Storage**: User data stored locally on device
- **No Tracking**: No user analytics or tracking
- **Data Minimization**: Only necessary data is collected

## 🤝 Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details.

### Development Setup

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

### Code Style

- Follow Kotlin coding conventions
- Use meaningful variable and function names
- Add comments for complex logic
- Maintain consistent formatting

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- **OpenLibrary**: For providing the book data API
- **JetBrains**: For Kotlin Multiplatform and Compose Multiplatform
- **Google**: For Room database and Material Design
- **Kotlin Community**: For excellent libraries and tools

## 📞 Support

- **Issues**: [GitHub Issues](https://github.com/yourusername/BooKPedia/issues)
- **Discussions**: [GitHub Discussions](https://github.com/yourusername/BooKPedia/discussions)
- **Documentation**: [IMPLEMENTATION_SUMMARY.md](IMPLEMENTATION_SUMMARY.md)

## 🔮 Roadmap

### Upcoming Features
- [ ] Cloud synchronization
- [ ] Offline reading capabilities
- [ ] Social features and sharing
- [ ] Advanced search and filtering
- [ ] Reading progress tracking
- [ ] Book recommendations

### Technical Improvements
- [ ] Performance optimizations
- [ ] Enhanced accessibility
- [ ] Multi-language support
- [ ] Web platform support
- [ ] Advanced analytics

---

**Made with ❤️ using Kotlin Multiplatform and Compose Multiplatform**

*BooKPedia - Your personal library, everywhere you go.*