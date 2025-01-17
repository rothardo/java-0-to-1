# Do-While Loops in Java

## Introduction

A `do-while` loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition. Unlike a `while` loop, a `do-while` loop is guaranteed to execute at least once because the condition is evaluated after the loop body.

## Syntax

```java
do {
    // code to be executed
} while (condition);
```

- **Loop Body**: This is the block of code that will be executed at least once and then repeatedly as long as the condition is `true`.
- **Condition**: This is evaluated after each iteration. If the condition is `true`, the loop body is executed again. If it is `false`, the loop terminates.

## Use Cases

- **Executing code at least once**: When you need to ensure that the loop body is executed at least once, a `do-while` loop is the right choice.
- **User input validation**: Often used in scenarios where user input needs to be validated and the prompt should be shown at least once.
- **Menu-driven programs**: Useful in creating menu-driven programs where the menu should be displayed at least once.

## Example

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        // Print numbers from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

## Noticing the Need for a Do-While Loop

You might notice the need for a `do-while` loop when:

- You have a task that must be executed at least once before any condition is checked.
- You need to repeatedly prompt the user for input until a valid response is received.

## Difference Between While and Do-While

- **Execution Guarantee**: A `while` loop checks the condition before executing the loop body, so it may not execute at all if the condition is `false` initially. A `do-while` loop, on the other hand, executes the loop body at least once before checking the condition.
- **Syntax**: In a `while` loop, the condition is placed at the beginning, whereas in a `do-while` loop, the condition is placed at the end.

### While Loop Example

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

### Do-While Loop Example

```java
public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        // Print numbers from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

In summary, choose a `do-while` loop when you need the loop body to execute at least once, and a `while` loop when the loop body should only execute if the condition is initially `true`.
