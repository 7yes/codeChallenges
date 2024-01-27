package com.yesI.codechallenges

import java.util.HashSet

/**
 * set to hold dictionary values
 */
private val dictionary: MutableSet<String> = HashSet()

/**
 * returns true if the word can be segmented into parts such
 * that each part is contained in dictionary
 */
fun wordBreak(word: String): Boolean {
    val size = word.length

    // base case
    if (size == 0) return true

    //else check for all words
    for (i in 1..size) {
        // Now we will first divide the word into two parts ,
        // the prefix will have a length of i and check if it is
        // present in dictionary ,if yes then we will check for
        // suffix of length size-i recursively. if both prefix and
        // suffix are present the word is found in dictionary.
        if (dictionary.contains(word.substring(0, i)) &&
            wordBreak(word.substring(i, size))
        ) return true
    }

    // if all cases failed then return false
    return false
}

fun main(args: Array<String>) {
    // array of strings to be added in dictionary set.
    val tempDictionary = arrayOf(
        "mobile", "samsung", "sam", "sung",
        "man", "mango", "icecream", "and",
        "go", "i", "like", "ice", "cream"
    )

    // loop to add all strings in dictionary set
    for (temp in tempDictionary) {
        dictionary.add(temp)
    }

    // sample input cases
    println(wordBreak("ilikesamsung"))
    println(wordBreak("iiiiiiii"))
    println(wordBreak(""))
    println(wordBreak("ilikelikeimangoiii"))
    println(wordBreak("samsungandmango"))
    println(wordBreak("samsungandmangok"))
}