### ** Switch Statement**

**Technical Definition:**
A **switch** statement is a way to select one of many code blocks to be executed based on a variable's value. It’s often used when there are multiple possible values for a variable, and you want to run different code for each value.

**In Simple Terms:**
Think of a **switch** like a menu in a restaurant. Each option on the menu leads to a different dish being served. Based on what you select, the kitchen will prepare a different meal.

---

#### **Syntax of Switch:**

```java
switch (variable) {
    case value1:
        // Code to execute if variable == value1
        break;
    case value2:
        // Code to execute if variable == value2
        break;
    default:
        // Code to execute if variable doesn't match any case
}
```

---

#### **Example:**

Here’s a simple Java example using a `switch` statement:

```java
public class SwitchExample {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

**Explanation:**

- The `switch` evaluates the value of `day`.
- It will print "Wednesday" because `day` equals 3.
- If `day` was not 1, 2, or 3, it would print "Invalid day".

---

[**Switch Java Example**](https://github.com/rothardo/java-0-to-1/blob/master/Session-10/SwitchExample.java)
