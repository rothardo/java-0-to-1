# Strings in Java

## What are Strings?

Strings in Java are sequences of characters used to store and handle text. In Java, strings are objects that are internally supported by a char array. A `char` in Java represents a single 16-bit Unicode character.

## How Strings Work

Strings in Java are immutable, meaning once a string is created, it cannot be changed. Any modification to a string results in the creation of a new string.

### Converting `char` to String

A `char` can be converted to a string using the `String` class constructor or the `valueOf` method:

```java
char ch = 'A';
String str1 = Character.toString(ch);
String str2 = String.valueOf(ch);
```

## Char Buffer

A `CharBuffer` is a buffer that holds characters. It is part of the `java.nio` package and provides a way to handle character data efficiently.

## Differences Between String and Char Buffer

| Feature       | String                            | Char Buffer                       |
| ------------- | --------------------------------- | --------------------------------- |
| Mutability    | Immutable                         | Mutable                           |
| Performance   | Slower for frequent modifications | Faster for frequent modifications |
| Storage       | Backed by a char array            | Backed by a char array            |
| Thread Safety | Thread-safe                       | Not thread-safe                   |

## String as a Java Lang Class

The `String` class is part of the `java.lang` package. It provides various methods for string handling, such as `substring`, `concat`, `replace`, `toLowerCase`, `toUpperCase`, and many more.

You will learn more about strings in Session 14.

## Declaring Strings

Strings can be declared using string literals or the `new` keyword.

### Using String Literals

```java
String str = "Hello, World!";
```

### Using the `new` Keyword

```java
String str = new String("Hello, World!");
```

### Use Cases

- String literals are stored in the string constant pool, which helps in saving memory.
- The `new` keyword always creates a new string object in the heap memory.

### CharSequence

The `CharSequence` interface represents a readable sequence of characters. It is implemented by several classes, including `String`, `StringBuffer`, and `StringBuilder`. It defines methods like `length()`, `charAt()`, and `subSequence()`.
