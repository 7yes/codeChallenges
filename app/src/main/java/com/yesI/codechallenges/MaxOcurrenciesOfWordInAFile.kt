package com.yesI.codechallenges

import java.io.BufferedReader
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.lang.Exception
import java.util.*

/**
 * Method 1 - getWords()
 * Reading out words from the file and
 * mapping key value pair corresponding to
 * each different word
 */
@Throws(FileNotFoundException::class)
fun getWords(fileName: String, words: MutableMap<String, Int>) {

    // Creating a Scanner class object
    val file = Scanner(File(fileName))

    // Condition check using hasNext() method which
    // holds true till there is word being read from the
    // file.
    // As the end of file content,condition violates
    while (file.hasNext()) {
        // Reading word using next() method
        val word: String = file.next()
        // Frequency count variable
        var count = words[word]
        // If the same word is repeating
        if (count != null) {
            // Incrementing corresponding count by unity
            // every time it repeats
            // while reading from the file
            count++
        } else  // If word never occurred after occurring
        // once, set count as unity
            count = 1
        words[word] = count
    }

    // Close the file and free up the resources
    file.close()
}

/**
 * Method 2 - getMaxOccurrence()
 * To get maximum occurred Word
 */
fun getMaxOccurrences(words: Map<String, Int>): Int {
    // Initially set maximum count as unity
    var max = 1

    // Iterating over above Map using for-each loop
    for ((_, value) in words) {

        // Condition check
        // Update current max value  with the value
        // exceeding unity in Map while traversing
        if (value > max) {
            max = value
        }
    }

    // Return the maximum value from the Map
    return max
}

/**
 * Method 3
 * Main driver method
 */
fun main(args: Array<String>) {
    // Creating an object of type Map
    // Declaring object of String and Integer types
    val words: MutableMap<String, Int> = HashMap()

    // Retrieving the path as parameter to Method1()
    // above to get the file to be read
    getWords("C:\\Users\\dell\\sample.txt", words)

    // Variable holding the maximum
    // repeated word count in a file
    val max = getMaxOccurrences(words)

    // Traversing using fo-each loop
    // Creating a set out of same elements
    // contained in a HashMap
    for (word in words.entries) {

        // Comparing values using geValue() method
        if (word.value == max) {

            // Print and display word-count pair
            println(word)
        }
    }
}

object MostRepeatedWord {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var line: String
        var word = ""
        var count = 0
        var maxCount = 0
        val words = ArrayList<String>()

        //Opens file in read mode
        val file = FileReader("data.txt")
        val br = BufferedReader(file)

        //Reads each line
        while (br.readLine().also { line = it } != null) {
            val string = line.toLowerCase().split("([,.\\s]+)").toTypedArray()
            //Adding all words generated in previous step into words
            for (s in string) {
                words.add(s)
            }
        }

        //Determine the most repeated word in a file
        for (i in 0 until words.size) {
            count = 1
            //Count each word in the file and store it in variable count
            for (j in i + 1 until words.size) {
                if (words[i] == words[j]) {
                    count++
                }
            }
            //If maxCount is less than count then store value of count in maxCount
            //and corresponding word to variable word
            if (count > maxCount) {
                maxCount = count
                word = words[i]
            }
        }
        println("Most repeated word: $word")
        br.close()
    }
}