Here’s a shorter, clean README focused only on **Day 5**.

# 🔐 Day 5 — Password Strength Checker

A simple Java console application that analyzes a password based on common security requirements.

## 📌 Features

* Checks for uppercase letters
* Checks for lowercase letters
* Checks for numbers
* Checks for special characters
* Checks password length
* Displays a basic password analysis

## 🛠️ Technologies Used

* Java
* Scanner
* String
* Character class
* Loops
* Conditional statements

## ⚙️ How It Works

The program takes a password as input and examines each character using a `for` loop.

It uses Java's `Character` class to identify different types of characters:

```java
Character.isUpperCase(ch)
Character.isLowerCase(ch)
Character.isDigit(ch)
```

Boolean variables are used to keep track of whether each requirement is present.

## ▶️ How to Run

Compile the program:

```bash
javac PasswordStrengthChecker.java
```

Run the program:

```bash
java PasswordStrengthChecker
```

## 💻 Example

```text
Enter your password: Varsha@123

--- Password Analysis ---

Uppercase: true
Lowercase: true
Number: true
Special Character: true
```

## 🧠 Concepts Practiced

* User input using `Scanner`
* Strings and characters
* `charAt()` and `length()`
* `for` loop
* `if-else` statements
* Boolean variables
* Character validation

## 🚀 Future Improvements

* Add Weak / Medium / Strong classification
* Introduce a strength scoring system
* Add minimum password length validation
* Provide suggestions for creating stronger passwords
