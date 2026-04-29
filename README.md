# Koroutines

---

This is a kotlin coroutines extension library for improving the development experience.

> [!NOTE]
> See docs at [docs](https://kqkqkqkqkq.github.io/koroutines/)

# Using in your projects

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

```kotlin
dependencies {
    val version = "0.1"
    implementation("com.github.kqkqkqkqkq:koroutines:${version}")
}
```