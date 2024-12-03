### ** If-Else Conditionals**

**Technical Definition:**
The **if-else** statement is used to execute one block of code if a condition is true and another block of code if it is false.

**In Layman's Terms:**
Think of the **if-else** statement like a simple choice you have to make:

- **If** something is true, do this.
- **Else if** another condition is true, do that.
- **Else** (otherwise), do something else.

---

#### **Syntax of If-Else:**

```java
if (condition) {
    // Block of code executed if the condition is true
}else if(condition){
    // Block of code executed if the condition is true
} else {
    // Block of code executed if the condition is false
}
```

---

#### **Example:**

Here’s a simple Java example using an `if-else` statement:

```java
public class IfElseExample {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
```

**Explanation:**

- If the person's age is 18 or older, the message "You are an adult." will be printed.
- If the person's age is less than 18, the message "You are a minor." will be printed.

---

[**If Else Java Example**](https://github.com/rothardo/java-0-to-1/blob/master/Session-10/IfElseExample.java)
