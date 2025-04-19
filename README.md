# Java Calculator

A simple console-based Java calculator that supports basic arithmetic operations, Fibonacci sequence generation, and power/root functions.

## Project Structure
Calculator/ ├── src/ │ ├── UserInput.java # Handles user input and menu
│ ├── Calculator.java # Implements calculation logic
│ └── CalculatorMain.java # Main entry point
└── README.md # Project documentation


## Features

- **Addition** (`Calculator.addition`)  
  Adds two integers.

- **Subtraction** (`Calculator.subtraction`)  
  Subtracts the second integer from the first.

- **Multiplication** (`Calculator.multiplication`)  
  Multiplies two integers.

- **Division** (`Calculator.division`)  
  Divides the first integer by the second.  
  Throws `ArithmeticException` if dividing by zero.

- **Fibonacci Sequence** (`Calculator.fibonacci`)  
  Prints N terms of the Fibonacci sequence.  
  Throws `IllegalArgumentException` if N ≤ 0.

- **Square** (`Calculator.square`)  
  Computes the square of an integer.

- **Cube** (`Calculator.cube`)  
  Computes the cube of an integer.

- **Square Root** (`Calculator.sqrt`)  
  Computes the square root of a non-negative integer.  
  Throws `IllegalArgumentException` for negative input.

## Exception Handling

- `ArithmeticException` for division by zero.
- `IllegalArgumentException` for invalid inputs (e.g., negative input for square root, non-positive input for Fibonacci terms).
- `InputMismatchException` caught in `UserInput.displayMenu` to handle non-integer entries.

## Usage

### Clone the Repository
```bash
git clone https://github.com/<your-username>/Calculator.git
cd Calculator
```


Compile
```bash
javac src/*.java
```
Run
```bash
java -cp src CalculatorMain
```
Follow the on-screen menu to select operations.
