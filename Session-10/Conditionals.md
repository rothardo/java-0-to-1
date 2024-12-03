#### Conditionals in Programming (Java)

**Conditionals** are an essential part of any programming language, and Java is no exception. They allow the program to make decisions based on different conditions or criteria. This enables the program to follow different execution paths depending on whether a condition is true or false. The most common conditional statements in Java are **if-else** and **switch**.

In this session, we will dive into the following topics:

- [**If-Else Conditionals**](https://github.com/rothardo/java-0-to-1/blob/master/Session-10/If-Else-Conditionals.md)
- [**Switch Statements**](https://github.com/rothardo/java-0-to-1/blob/master/Session-10/Switch-Conditionals.md)
- [**Differences Between If-Else and Switch**](https://github.com/rothardo/java-0-to-1/blob/master/Session-10/Difference.md)
- [**When to Use Which Conditional?**](https://github.com/rothardo/java-0-to-1/blob/master/Session-10/WhenToUse.md)

---

##### **What Are Conditionals?**

In simple terms, conditionals let the computer make choices. It’s like asking the computer, "If this is true, do this; otherwise, do something else."

Here’s an analogy to explain:

- Imagine you are at a fork in the road and you have to make a decision:
  - If it’s raining, you take an umbrella (this is one path).
  - If it’s not raining, you don’t need the umbrella (this is another path).

In programming, we represent these types of decisions using conditionals.

---

### **Additional Notes:**

- **When to Use `if-else` vs `switch`:**

  - **Use `if-else`** when:

    - Your conditions involve complex logical expressions (&&, ||)
    - You need to compare ranges (e.g., score > 90 && score <= 100)
    - You have multiple independent conditions
    - You need to check different variables in each condition
    - Your conditions involve method calls or expressions

  - **Use `switch`** when:
    - You're testing a single variable against multiple constant values
    - You have many possible exact-match cases
    - All cases are based on the same variable
    - The values being compared are constants (numbers, enums, or strings)
    - You want cleaner, more readable code for multiple equality comparisons
    - Performance is important (switch can be faster for multiple cases)
