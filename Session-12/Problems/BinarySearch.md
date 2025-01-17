## Problem 2: Binary Search

Write a method to perform binary search on a sorted range of numbers without using arrays or lists.

### Explanation

Binary search is an efficient algorithm for finding an item from a sorted range of numbers. It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one. For example, to find the number 7 in the range 1 to 10, you would check the midpoint (5), then the midpoint of the upper half (8), and so on.

### Constraints

- The method should only use recursion.
- The method should handle cases where the number is not present in the range.

### Example

```java
binarySearch(1, 10, 7); // returns true
binarySearch(1, 10, 11); // returns false
```
