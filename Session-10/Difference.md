### **3. Differences Between If-Else and Switch**

| Feature                  | If-Else Statement                                                                 | Switch Statement                                               |
| ------------------------ | --------------------------------------------------------------------------------- | -------------------------------------------------------------- | --- |
| **Number of Conditions** | Can handle multiple conditions but is less efficient as the number grows.         | More efficient with multiple cases.                            |
| **Conditions**           | Can compare ranges, logical expressions, or anything that evaluates to a boolean. | Only compares exact values of a variable (no ranges).          |
| **Syntax**               | More flexible, but longer.                                                        | Cleaner when there are many possible cases.                    |
| **When to Use**          | When conditions involve ranges or complex comparisons.                            | When checking one variable against many possible fixed values. |
| **Time Complexity**      | O(n) - must check each condition sequentially                                     | O(1) - uses jump table for direct access                       |
| **Space Complexity**     | O(1) - minimal memory overhead                                                    | O(n) - requires jump table for cases                           |
| **Common Problems**      | Can become messy with nested conditions, harder to maintain                       | Fall-through behavior if break statements are forgotten        | --- |

### **4. When to Use Which Conditional?** (.md file)

- **Use `if-else` when:**
  - You need to compare ranges or evaluate complex expressions.
  - You need to check for different conditions that don't revolve around a single variable.
- **Use `switch` when:**
  - You are comparing a single variable to multiple fixed values (like days of the week, menu options, etc.).
  - You want cleaner, more readable code when dealing with multiple possible values.

---
