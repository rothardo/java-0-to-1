
## Problem 1: Sum of Natural Numbers

Write a method to compute the sum of the first n natural numbers using recursion.

### Explanation

The sum of the first n natural numbers is the result of adding all numbers from 1 to n. For example, the sum of the first 5 natural numbers (1 + 2 + 3 + 4 + 5) is 15. This problem can be solved using recursion, where the sum of n numbers is the sum of n and the sum of the first (n-1) numbers.

### Constraints

- The method should not use any loops.
- The method should handle large values of n efficiently.

### Example

```java
sumOfNaturalNumbers(5); // returns 15
```