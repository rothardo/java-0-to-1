# Loops in Java

## Introduction
Loops are used in Java to execute a block of code repeatedly. They are essential for tasks that require doing something over and over, like going through a list of items or performing repetitive calculations.

## Types of Loops

### 1. `for` Loop
The `for` loop is used when you know exactly how many times you want to repeat something. It has three parts: starting point, condition to keep going, and how to move to the next step.

**Syntax:**
```java
for (starting point; condition to keep going; next step) {
    // code to be repeated
}
```

**Example:**
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
In this example, the loop starts at 0, keeps going as long as `i` is less than 10, and increases `i` by 1 each time.

### 2. `while` Loop
The `while` loop is used when you don't know how many times you need to repeat something. It keeps going as long as a condition is true.

**Syntax:**
```java
while (condition) {
    // code to be repeated
}
```

**Example:**
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```
In this example, the loop starts at 0 and keeps going as long as `i` is less than 10. It increases `i` by 1 each time.

### 3. `do-while` Loop
The `do-while` loop is similar to the `while` loop, but it always runs the code block at least once before checking the condition.

**Syntax:**
```java
do {
    // code to be repeated
} while (condition);
```

**Example:**
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 10);
```
In this example, the loop starts at 0, prints `i`, increases `i` by 1, and then checks if `i` is less than 10 to decide whether to keep going.

## Use Cases
- **`for` Loop:** Use this when you know exactly how many times you need to repeat something, like going through a list of 10 items.
- **`while` Loop:** Use this when you don't know how many times you need to repeat something, like reading data until the end of a file.
- **`do-while` Loop:** Use this when you need to do something at least once, like asking a user for input and validating it.

## Conclusion
Understanding and using loops effectively is crucial for writing efficient and clear Java programs. Each type of loop has its own best use cases, and choosing the right one depends on what you need to do.