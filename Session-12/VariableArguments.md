### Varargs (Variable-Length Argument Lists)

Varargs allow a method to accept zero or more arguments of a specified type. This is useful when the number of arguments is not known in advance. The syntax for using varArgs is to add an ellipsis (`...`) after the parameter type.

```java
public void display(String... values) {
    for (String value : values) {
        System.out.println(value);
    }
}
```

In this example, the `display` method can accept any number of `String` arguments.
