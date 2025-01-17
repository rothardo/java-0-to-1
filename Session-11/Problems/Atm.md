## Problem 10: ATM

You are required to simulate an ATM machine that allows users to withdraw money. The ATM has a limited number of banknotes of different denominations. The denominations available are $100, $50, $20, $10, and $5. The ATM should dispense the minimum number of banknotes for any given withdrawal amount. 

### Constraints

1. The ATM can only dispense the exact amount requested.
2. The ATM has a limited number of each denomination:
    - 100-dollar bills: 10
    - 50-dollar bills: 10
    - 20-dollar bills: 10
    - 10-dollar bills: 10
    - 5-dollar bills: 10
3. The withdrawal amount will always be a multiple of 5.
4. The maximum withdrawal amount is $1000.
5. You cannot use arrays, strings, or lists to solve this problem.

### Input

- An integer `amount` representing the amount to be withdrawn.

### Output

- The number of each denomination dispensed by the ATM.

### Example

#### Example 1

**Input:**
```
amount = 275
```

**Output:**
```
100-dollar bills: 2
50-dollar bills: 1
20-dollar bills: 1
10-dollar bills: 0
5-dollar bills: 1
```

#### Example 2

**Input:**
```
amount = 85
```

**Output:**
```
100-dollar bills: 0
50-dollar bills: 1
20-dollar bills: 1
10-dollar bills: 1
5-dollar bills: 1
```

### Notes

- Ensure that the ATM does not run out of any denomination while dispensing the money.
- If the ATM cannot dispense the exact amount requested due to insufficient banknotes, print an error message indicating the same.
- Optimize for the minimum number of banknotes dispensed.

Good luck!