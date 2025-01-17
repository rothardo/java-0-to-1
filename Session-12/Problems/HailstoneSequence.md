# Java Method Problems

## Problem 10: Hailstone Sequence

Write a method to generate the Hailstone sequence for a given number using loops and conditionals.

### Explanation

The Hailstone sequence (also known as the Collatz sequence) is a sequence of numbers produced from a starting positive integer, following these rules:

1. If the number is even, divide it by 2.
2. If the number is odd, multiply it by 3 and add 1.
3. Repeat the process with the resulting number.
   The sequence ends when it reaches the number 1. The challenge is to generate this sequence for a given starting number and determine both the length of the sequence and the maximum value encountered during the process.

### Constraints

- The method should not use any built-in functions for generating sequences.
- The method should handle large starting numbers efficiently.
- The method should return the length of the sequence and the maximum value encountered.

### Example

```java
hailstoneSequence(7); // returns {length: 17, max: 52}
```
