package com.yesI.codechallenges

import java.util.ArrayDeque

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
1.	Open brackets must be closed by the same type of brackets.
2.	Open brackets must be closed in the correct order.
 */
internal fun areParenthesesValid(expr: String): Boolean {
    val stack = ArrayDeque<Char>()
    for (element in expr) {
        if (element == '(' || element == '[' || element == '{') {
            stack.push(element)
            continue
        }
        if (stack.isEmpty())
            return false
        val check: Char
        when (element) {
            ')' -> {
                check = stack.pop()
                if (check == '{' || check == '[')
                    return false
            }

            '}' -> {
                check = stack.pop()
                if (check == '(' || check == '[')
                    return false
            }

            ']' -> {
                check = stack.pop()
                if (check == '(' || check == '{')
                    return false
            }
        }
    }
    return stack.isEmpty()
}