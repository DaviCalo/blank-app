# Blank App Template with Compose, Koin, Retrofit, and MVVM Architecture

This repository provides a blank application setup with essential tools and frameworks, including Jetpack Compose for UI, Koin for dependency injection, Retrofit for network requests, and an MVVM architecture. It's designed to save time and get you started quickly with a clean structure.

## Features

- **Jetpack Compose**: Modern, declarative UI toolkit for Android.
- **Koin**: Lightweight dependency injection framework.
- **Retrofit**: Type-safe HTTP client for network operations.
- **MVVM Architecture**: Structured code with separation of concerns.

## Project Structure

```
├── app/
│   ├── data/               # Data sources (API, database, etc.)
│   ├── di/                 # Koin dependency injection modules
│   ├── ui/                 # UI components built with Compose
│   │   ├── viewmodel/      # ViewModel classes
│   ├── network/            # Retrofit setup and API definitions
│   ├── utils/              # Utility classes and extensions
├── build.gradle            # Gradle configuration
```

## How to Use

1. Clone the repository:
   ```
   git clone https://github.com/DaviCalo/blank-app.git
   ```

2. Open the project in Android Studio.

3. Sync Gradle to download dependencies.

4. Explore the project structure to understand the code setup.

5. Start building your app!

## Getting Started

- **Compose**: All UI components are designed using Jetpack Compose. You can find examples in the `ui` directory.
- **Koin**: Dependency injection is handled through Koin modules defined in the `di` package.
- **Retrofit**: Define your API interfaces and implement them in the `network` package.
- **MVVM**: ViewModel classes are located in the `viewmodel` package, ensuring a clean separation between UI and logic.

## Contributions

Contributions are welcome! Feel free to fork this repository and submit pull requests.
