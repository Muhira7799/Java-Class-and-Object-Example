# Java Class and Object Example

A minimal Java program that demonstrates how to define a class, create an object, set its fields, and call a method.

## What It Demonstrates

- Declaring a class with fields (`int i` and `private String name`)
- Defining an instance method (`show()`)
- Creating an object with `new`
- Setting and reading object fields with the dot operator
- Calling a method on an object

## Code Overview

```java
public class A {
    int i;
    private String name;

    void show() {
        System.out.println("A is shown");
    }

    public static void main(String[] args) {
        A a = new A();
        a.i = 2;
        a.name = "John";

        System.out.println("The value of i is" + a.i);
        System.out.println("The name is" + a.name);

        a.show();
    }
}
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

### Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
```

### Compile

```bash
javac A.java
```

### Run

```bash
java A
```

## Output

```
The value of i is2
The name isJohn
A is shown
```

The text and the values run together because the strings in the code have no trailing space. Changing `"The value of i is"` to `"The value of i is "` fixes this.

## How It Works

1. `main` creates an object of class `A` with `new A()`.
2. It sets `i` to `2` and `name` to `"John"`.
3. It prints both values.
4. It calls `show()`, which prints `A is shown`.

`name` is `private`, but `main` can still access it because `main` is inside the same class. Code in a different class could not access it directly and would need a getter and setter.

## Project Structure

```
.
├── A.java
└── README.md
```

## Next Steps

- Add a getter and setter for `name` (encapsulation)
- Add a constructor to set `i` and `name` when the object is created
- Create a second class that uses `A`
- Add more methods that use the fields
