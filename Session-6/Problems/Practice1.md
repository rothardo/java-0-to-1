# Practice Problem 1:  Palindrome Checker

### Task:
Write pseudocode to check if a given string is a **palindrome**. A palindrome is a word, phrase, or sequence that reads the same backward as forward (ignoring spaces, punctuation, and case).

### Problem Details:
Your task is to write pseudocode that takes a string as input and returns **true** if the string is a palindrome, and **false** otherwise.

**Steps:**
1. Ignore spaces, punctuation, and make all characters lowercase for comparison.
2. Compare the first character with the last character, the second character with the second-last character, and so on.
3. If any pair of characters do not match, return `false`.
4. If all characters match, return `true`.

**Input:**
- A string (e.g., "A man, a plan, a canal, Panama!")

**Output:**
- **True** if the string is a palindrome.
- **False** if the string is not a palindrome.

### Example:
- Input: "A man, a plan, a canal, Panama!"
- Output: True

- Input: "Hello, world!"
- Output: False