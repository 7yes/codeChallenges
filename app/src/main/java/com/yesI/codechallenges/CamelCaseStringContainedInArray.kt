package com.yesI.codechallenges

fun checkNewWord(arr: MutableList<String>, newWord: String): Boolean {
    val words = mutableListOf<String>()
    val newWords = newWord
        .split(Regex("(?=\\p{Upper})"))
        .map { it.toLowerCase() }
        .filter { it.isNotEmpty() }

    newWords.forEach {
        if (arr.contains(it)) {
            words.add(it)
        }
    }

    return words.size == newWords.size
}

fun main() {
    println(checkNewWord(arrayListOf("is", "valid", "another"), "isValid"))
}