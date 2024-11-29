# Introduction to Data Types in Java

In Java, data types define the kind of data a variable can hold. They are essential in ensuring the program works with the right kind of data. There are two categories of data types in Java:
- **Primitive Data Types:** These include `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.
- **Reference Data Types:** These include classes, arrays, and interfaces (which we will cover later).

---

## Understanding Java Data Types:

1. **Integer Types:**
   - `byte`: 1 byte, range: -128 to 127.
   - `short`: 2 bytes, range: -32,768 to 32,767.
   - `int`: 4 bytes, range: -2^31 to 2^31-1.
   - `long`: 8 bytes, range: -2^63 to 2^63-1. We need to append an `L` at the end to specify a long value, like `123456789L`.

2. **Floating-Point Types:**
   - `float`: 4 bytes, range: ±3.40282347E+38F (requires `f` at the end).
   - `double`: 8 bytes, range: ±1.7976931348623157E+308 (default for decimal values).

3. **Other Types:**
   - `char`: 2 bytes, used for storing single characters. Java uses UTF-16 encoding, so a `char` is 2 bytes instead of 1 byte like in some other languages. For example, the ASCII value of `'A'` is 65, and we can print it as:
     ```java
     char ch = 'A';
     System.out.println((int) ch); // prints 65
     ```

4. **Boolean:**
   - `boolean`: 1 byte, can only hold two values: `true` or `false`.

5. **String:**
   - `String`: Although not a primitive type, it's widely used to store sequences of characters. A string is a sequence of characters enclosed in double quotes, like `"Hello"`. 
   
   The size of a String in memory is not fixed because it depends on the number of characters it contains - each character typically uses 2 bytes (since Java uses UTF-16), plus some overhead for the String object itself. For example, "Hello" would use approximately 10 bytes for characters plus the overhead, while "Hello World" would use more.
---

## Why Use `f` in `float` and `L` in `long`?

In Java, by default, decimal numbers are treated as `double`, and integer numbers are treated as `int`. To specify a `float`, you need to add `f` at the end to make it clear. Similarly, a `long` integer must end with `L`.

---

## Example Program: Print All Data Types:

```java
public class DataTypesExample {
    public static void main(String[] args) {
        byte byteVal = 100;
        short shortVal = 1000;
        int intVal = 10000;
        long longVal = 100000L;
        float floatVal = 10.5f;
        double doubleVal = 20.99;
        char charVal = 'A';
        boolean booleanVal = true;
        String strVal = "Java Programming";

        System.out.println("Byte: " + byteVal);
        System.out.println("Short: " + shortVal);
        System.out.println("Int: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Char: " + charVal);
        System.out.println("Boolean: " + booleanVal);
        System.out.println("String: " + strVal);
    }
}
```

---

## **DataTypesExample.java:**
[Download DataTypesExample.java](https://github.com/rothardo/java-0-to-1/blob/master/Session-8/DataTypesExample.java)

---

## Access Modifiers in Java

In Java, access modifiers control the visibility of classes, methods, and variables. The most common access modifiers are:
- **Public:** Anyone can use it from anywhere in the program.
- **Private:** Only the class itself can use it - like keeping a secret to yourself.
- **Protected:** Only classes in the same folder and child classes can use it - like sharing something with family members.
- **Default:** (No modifier) Only classes in the same folder can use it - like sharing something with your roommates.

You will learn more about access modifiers in detail in upcoming sessions.

---

**That's all for today!** This session covered the basics of Java syntax, how to run a Java program, data types, and more. Stay tuned for future sessions where we'll dive deeper into object-oriented programming concepts and more advanced topics!
```