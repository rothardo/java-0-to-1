### Understanding String Literals and the `new` Keyword in Java

In Java, it's essential to understand the difference between string literals and using the `new` keyword for creating strings, as they serve different purposes and are used in various scenarios.

#### String Literals
- **Definition**: String literals are simple pieces of text enclosed in quotes, such as `"hello"`, `"world"`, or `"example"`.
- **Usage**: They are used to represent fixed text values in your code.
- **Example**:
    ```java
    String greeting = "hello";
    System.out.println(greeting); // Output: hello
    ```
- **Characteristics**:
    - Immutable: Once created, the value of a string literal cannot be changed.
    - Memory Efficiency: String literals are stored in a common pool, which makes them memory efficient.

#### Using the `new` Keyword for Strings
- **Definition**: The `new` keyword can be used to create new string objects explicitly.
- **Usage**: It is used when you need to create a new string object that is not interned.
- **Example**:
    ```java
    String greeting = new String("hello");
    System.out.println(greeting); // Output: hello
    ```
- **Characteristics**:
    - Creates a New Object: Each use of `new` creates a new string object in memory, even if the content is the same as an existing string literal.
    - Less Memory Efficient: Unlike string literals, strings created with `new` are not stored in the common pool.

#### Differences and Use Cases
- **String Literals**:
    - **Use Case**: Best for simple, fixed text values that are used frequently.
    - **Example**:
        ```java
        String name = "John Doe";
        ```
- **Using the `new` Keyword for Strings**:
    - **Use Case**: Used when a distinct string object is needed, or when interfacing with APIs that require new string instances.
    - **Example**:
        ```java
        String name = new String("John Doe");
        ```

#### Additional Considerations
- **Heap Memory and String Pool**:
    - **Heap Memory**: This is the runtime data area from which memory for all class instances and arrays is allocated. When you use the `new` keyword to create a string, it allocates memory for the string object in the heap.
    - **String Pool**: Also known as the intern pool, it is a special memory region where Java stores string literals. When a string literal is created, the JVM checks the string pool first. If the string already exists in the pool, a reference to the pooled instance is returned. If not, the string is added to the pool.

- **Two Objects with One Variable**:
    - When you use the `new` keyword, you can end up with two objects in memory if you assign a string literal to a variable and then reassign it using `new`.
    - **Example**:
        ```java
        String str = "hello"; // String literal in the string pool
        str = new String("hello"); // New string object in the heap
        ```
    - In this case, `str` initially points to the string literal `"hello"` in the string pool, and then it points to a new string object created by `new String("hello")` in the heap.

- **Two Variables for One Object**:
    - Multiple variables can reference the same string literal, as they are stored in a common pool.
    - **Example**:
        ```java
        String str1 = "hello";
        String str2 = "hello";
        ```
    - Here, both `str1` and `str2` point to the same string literal `"hello"` in the string pool.

