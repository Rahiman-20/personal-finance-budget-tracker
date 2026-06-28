# Personal Finance & Budget Tracker

A simple Java console-based application that helps users manage their monthly finances by recording expenses, analyzing spending habits, and tracking savings goals.

This project was built using Core Java concepts such as variables, conditional statements, loops, switch-case, user input handling, and basic financial calculations.

---

## Features

- User Registration
  - Enter name, age, and monthly salary.

- Expense Management
  - Record expenses in different categories:
    - Food
    - Transport
    - Entertainment
    - Bills
    - Others

- Financial Report
  - Displays user information.
  - Shows all recorded expenses.
  - Calculates:
    - Total Expenses
    - Remaining Balance
    - Savings Percentage

- Budget Analysis
  - Rates financial health as:
    - Excellent
    - Good
    - Average
    - Poor

- Emergency Fund Eligibility
  - Determines whether the user is eligible based on salary and savings percentage.

- Savings Goal Tracker
  - Predicts how many months are required to reach a desired savings goal.

- Menu Driven Program
  - Easy navigation using switch-case.

---

## Concepts Used

- Classes and Objects
- Variables and Data Types
- Scanner Class
- User Input
- Conditional Statements (if-else)
- Switch Case
- Loops (while, for)
- Arithmetic Operations
- Basic Financial Calculations

---

## Project Structure

```
PersonalFinanceBudgetTracker.java
│
├── Budget Class
└── PersonalFinanceBudgetTracker Class
    ├── User Registration
    ├── Expense Entry
    ├── Financial Report
    ├── Budget Analysis
    ├── Savings Goal Tracker
    └── Exit
```

---

## Sample Menu

```
1. Add Expenses
2. View Financial Report
3. Check Savings Goal
4. Exit
```

---

## Financial Calculations

### Total Expenses

```
Total Expenses =
Food +
Transport +
Entertainment +
Bills +
Other Expenses
```

### Remaining Balance

```
Remaining Balance =
Monthly Salary − Total Expenses
```

### Savings Percentage

```
Savings Percentage =
(Remaining Balance / Salary) × 100
```

---

## Budget Health Criteria

| Savings Percentage | Budget Health |
|-------------------:|---------------|
| 40% or more | Excellent |
| 25% – 39% | Good |
| 10% – 24% | Average |
| Below 10% | Poor |

---

## Emergency Fund Eligibility

A user is considered eligible if:

- Monthly Salary > ₹30,000
- Savings Percentage > 20%

---

## How to Run

### Compile

```bash
javac PersonalFinanceBudgetTracker.java
```

### Execute

```bash
java PersonalFinanceBudgetTracker
```

---

## Future Improvements

- Store expense history using arrays or ArrayList.
- Save data permanently using file handling.
- Add expense categories dynamically.
- Monthly expense history.
- Edit or delete expenses.
- Password-based login system.
- Generate detailed financial reports.
- Display expense charts using Java GUI.

---

## Learning Outcomes

This project helped practice:

- Java programming fundamentals
- Console-based application development
- Menu-driven program design
- Financial calculations
- Problem solving using conditions and loops
- Writing clean and structured Java code

---

## Author

**Rahul Kumar**

Built as a Core Java mini project for learning and practicing programming fundamentals.
