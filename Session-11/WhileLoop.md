# While Loops in Java

## Introduction
A `while` loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition. It is commonly used when the number of iterations is not known before entering the loop.

## Syntax
```java
while (condition) {
    // code to be executed
}
```

- **Condition**: This is evaluated before each iteration. If the condition is `true`, the loop body is executed. If it is `false`, the loop terminates.

## Use Cases
- **Reading input until a sentinel value is encountered**: While loops are ideal for reading input until a specific value is encountered.
- **Processing data until a condition is met**: When you need to process data until a certain condition is met, a while loop is a perfect choice.
- **Waiting for a condition to become true**: While loops can be used to wait for a condition to become true before proceeding.

## Example
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        // Print numbers from 1 to 5
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

## Noticing the Need for a While Loop
You might notice the need for a while loop when:
- You have a task that needs to be repeated until a specific condition is met.
- You need to iterate as long as a condition remains true.
- You need to process input or data until a certain condition is satisfied.

## In-Depth Explanation
1. **Condition**: Before each iteration, the condition `i <= 5` is checked. If it is `true`, the loop body is executed.
2. **Loop Body**: The statement `System.out.println(i);` is executed, printing the current value of `i`.
3. **Update**: After each iteration, the loop control variable `i` is incremented by `1` using `i++`.

This process repeats until the condition `i <= 5` becomes `false`.