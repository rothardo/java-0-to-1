## Problem 7: Cube Root Calculation

Write a method to compute the cube root of a number using the Newton-Raphson method.

### Explanation

Similar to the square root calculation, the Newton-Raphson method can be used to find cube roots by iterating the formula x = (2 _ x + n / (x _ x)) / 3 until x converges to the cube root of n.

### Constraints

- The method should not use any built-in functions for cube root calculation.
- The method should handle non-perfect cubes and return a precise result.

### Example

```java
cubeRoot(27); // returns 3.0
cubeRoot(20); // returns approximately 2.714
```
