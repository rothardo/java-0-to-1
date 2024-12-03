###  Differences Between If-Else and Switch
| Feature                  | If-Else Statement                                                                 | Switch Statement                                               |
| ------------------------ | --------------------------------------------------------------------------------- | -------------------------------------------------------------- |
| **Number of Conditions** | Can handle multiple conditions but is less efficient as the number grows.         | More efficient with multiple cases.                            |
| **Conditions**           | Can compare ranges, logical expressions, or anything that evaluates to a boolean. | Only compares exact values of a variable (no ranges).          |
| **Syntax**               | More flexible, but longer.                                                        | Cleaner when there are many possible cases.                    |
| **When to Use**          | When conditions involve ranges or complex comparisons.                            | When checking one variable against many possible fixed values. |
| **Time Complexity**      | O(n) - must check each condition sequentially                                     | O(1) - uses jump table for direct access                       |
| **Space Complexity**     | O(1) - minimal memory overhead                                                    | O(n) - requires jump table for cases                           |
| **Common Problems**      | Can become messy with nested conditions, harder to maintain                       | Fall-through behavior if break statements are forgotten        |
