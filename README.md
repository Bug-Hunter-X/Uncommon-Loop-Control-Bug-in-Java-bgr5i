# Uncommon Loop Control Bug in Java

This repository demonstrates a subtle bug in Java related to the usage of `continue` and `break` statements within a `while` loop.  The interaction of these statements can lead to unexpected behavior if not carefully considered.

The `UncommonBug.java` file contains the buggy code, while `UncommonBugSolution.java` provides a corrected and more readable version.

The goal is to illustrate a less common type of error in loop control flow. This is a useful example for understanding how Java interprets `continue` and `break` in nested `if` conditions and the importance of carefully designing loop logic for predictable behavior.