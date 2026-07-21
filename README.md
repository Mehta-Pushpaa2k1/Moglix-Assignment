# Longest Valid Parentheses

# Problem Statement

Given a string containing only the characters `(` and `)`, return the length of the longest valid (well-formed) parentheses substring.

## Examples

### Example 1

**Input:**

```text
"(()"
```

**Output:**

```text
2
```

**Explanation:**

The longest valid parentheses substring is:

```text
()
```

---

# Example 2

**Input:**

```text
")()())"
```

**Output:**

```text
4
```

**Explanation:**

The longest valid parentheses substring is:

```text
()()
```

---

# Example 3

**Input:**

```text
""
```

**Output:**

```text
0
```

# Approach

I used a stack to store the indexes of unmatched opening parentheses.

Initially, I push `-1` into the stack as a base index. This helps calculate the length of a valid substring that starts from index `0`.

# Steps

1. If the current character is `(`, push its index into the stack.
2. If the current character is `)`, pop the stack.
3. If the stack becomes empty after popping, push the current index as the new base index.
4. Otherwise, calculate the length of the valid substring using:

```text
current index - stack.peek()
```
5. Keep updating the maximum length.

## Algorithm

```text
Create an empty stack
Push -1 into the stack
Set maxLength = 0

For each character in the string:

    If character is '(':
        Push its index into the stack

    Else:
        Pop the stack

        If stack is empty:
            Push current index into the stack

        Else:
            currentLength = current index - stack.peek()
            Update maxLength

Return maxLength
```

# Complexity
* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

# Language Used
* Java
* 
#Conclusion

The stack-based approach solves the problem efficiently in a single traversal of the string. The stack stores indexes to help identify unmatched parentheses and calculate the length of valid parentheses substrings.
