---
name: Bug report
about: Create a report to help us improve Unique Completion
title: ''
labels: ''
assignees: ''

---

**Describe the bug**
A clear and concise description of what the bug is.

**To Reproduce**
Steps to reproduce the behavior:
1. Go to a Java method call (e.g., `List.of(...)`)
2. Type a variable already present in the list.
3. Observe that it still appears in the completion menu.

**Expected behavior**
The variable should be filtered out of the completion suggestions if it is already present in the argument list.

**Screenshots/Code Snippets**
If applicable, add a code snippet of the method call or a screenshot of the completion menu.

**Environment:**
 - IDE Version: (e.g. IntelliJ IDEA 2025.1)
 - Plugin Version: (e.g. 1.0.0)
 - JDK Version: (e.g. 17)

**Additional context**
Add any other context about the problem here.
