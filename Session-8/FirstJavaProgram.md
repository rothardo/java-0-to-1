## Writing Your First Java Program

1. **Creating the Java File:**
   Open a text editor (like Notepad, VSCode, or any IDE) and create a new file. Name the file `HelloWorld.java`. The name of the file **must** match the name of the class in the program.

2. **HelloWorld.java Code Example:**

   Here's a simple Java program that prints `Hello, World!` to the console:

   ```java
   // HelloWorld.java

   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

3. **Explanation of the Code:**

   - `public class HelloWorld`: This defines the class named `HelloWorld`. In Java, all code must be inside a class.
   - `public static void main(String[] args)`: This is the entry point of the Java program. The `main` method is where the program starts running.
     - `public`: It indicates that the method is accessible by anyone.
     - `static`: It means the method can be called without creating an instance of the class.
     - `void`: It means the method does not return any value.
     - `String[] args`: This allows the program to accept command-line arguments.
   - `System.out.println("Hello, World!");`: This prints the text `"Hello, World!"` to the console.

4. **Running the Java Program from the Command Line:**

   To run the program, follow these steps:

   - Open your terminal or command prompt.
   - Navigate to the directory where your `HelloWorld.java` file is saved.
   - First, compile the program using the `javac` command:

     ```bash
     javac HelloWorld.java
     ```

     This will generate a `HelloWorld.class` file (the bytecode).

   - Now, run the program using the `java` command:
     ```bash
     java HelloWorld
     ```
     This should output:
     ```
     Hello, World!
     ```

---

## Structure of Java Code

Java code must be organized in a specific way:

- **Class:** All Java code must be inside a class. A class defines the blueprint for creating objects.
- **Main Method:** The `main` method is the entry point of any Java application.
- **Syntax:** Java follows strict syntax rules. For example, every statement must end with a semicolon (`;`), and code blocks are enclosed in curly braces (`{}`).

In future sessions, you will learn more about **classes** and **objects** in depth.

---

## **HelloWorld.java Program:**

[Download HelloWorld.java](https://github.com/rothardo/java-0-to-1/blob/master/Session-8/HelloWorld.java)

---

## Common Errors

- **If the `main` method is changed to something else like `Ayush`:**
  If you rename the `main` method, like this:

  ```java
  public class HelloWorld {
      public static void Ayush(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```
  When you try to run the program, you'll get the following error:
  Error: Main method not found in class HelloWorld, please define the main method as:
  public static void main(String[] args)

  This error occurs because Java specifically looks for a method named `main` as the entry point of the program. The Java Virtual Machine (JVM) is programmed to start execution from a method with the exact signature `public static void main(String[] args)`. 
  
  Changing the name to anything else, even if the rest of the method signature is identical, means the JVM cannot find its required entry point to begin program execution.

---
