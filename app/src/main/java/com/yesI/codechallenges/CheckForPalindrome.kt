package com.yesI.codechallenges

/**
 * Method 1
 * Returns true if string is a palindrome
 */
fun isPalindrome(str: String): Boolean {
    // Pointers pointing to the beginning
    // and the end of the string
    var i = 0
    var j = str.length - 1

    // While there are characters to compare
    while (i < j) {

        // If there is a mismatch
        if (str[i] != str[j]) return false

        // Increment first pointer and
        // decrement the other
        i++
        j--
    }

    // Given string is a palindrome
    return true
}