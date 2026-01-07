# Unique Completion

[![JetBrains Marketplace](https://img.shields.io/badge/Marketplace-Unique%20Completion-blue)](https://plugins.jetbrains.com/plugin/29639-unique-completion)
![Version](https://img.shields.io/jetbrains/plugin/v/29639-unique-completion)
![Downloads](https://img.shields.io/jetbrains/plugin/d/29639-unique-completion)

**Unique Completion** is a productivity-focused IntelliJ IDEA plugin that enhances the code completion experience. It filters out variables and constants that have already been used within the current method-call or list declaration.

## 🚀 Installation

1. Open **Settings/Preferences**
2. Navigate to **Plugins**
3. Select the **Marketplace** tab
4. Search for **"Unique Completion"**
5. Click **Install**

Alternatively, you can download it directly from the [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/29639-unique-completion).

## Why use Unique Completion?

When building long lists of constants, such as configuration keys, IntelliJ's default behavior is to suggest every available valid variable.
This leads to:

* **Cognitive Load:** Scanning a list of 50 items to find one you have not used.
* **Logic Errors:** Accidental duplicate entries that can lead to bugs.
* **Flow Interruption:** Sifting through "noise" instead of writing code.

**Unique Completion** fixes this by making your autocomplete list "context-aware", showing you only what is missing.

## Features

* **Instant Filtering:** Suggestions disappear from the autocomplete menu the moment they are added to the list.
* **Context Awareness:** Analyzes the current `PsiArgumentList` to identify the existing elements.
* **Universal Java Support:** Works inside any Java method argument list (e.g., `List.of()` or `Set.of()`).
* **Zero Configuration:** Works out-of-the-box with no setup required.

## Open Source and Contributing

This project is open-source and built for the community.

* **Reporting Bugs:** Please open an [Issue](https://github.com/anabulatovic/UniqueCompletion/issues) if you find a case where the filter does not behave as expected.
* **Pull Requests:** Contributions are welcome! Whether it is adding support for another language, or refining the PSI filtering logic, feel free to fork and submit a PR.

## License

Distributed under the **Apache 2.0 License**.

---

Created by [Ana Bulatović](https://github.com/anabulatovic)
