### Shadowing

Shadowing occurs when a local variable in a method has the same name as an instance variable. The local variable "shadows" the instance variable, meaning the local variable takes precedence within the method.

```java
public class Example {
    int x = 10; // instance variable

    public void method() {
        int x = 5; // local variable
        System.out.println(x); // prints 5
    }
}
```

In this example, the local variable `x` shadows the instance variable `x`.
