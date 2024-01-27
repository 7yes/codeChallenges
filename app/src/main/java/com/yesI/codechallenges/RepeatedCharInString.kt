package com.yesI.codechallenges

/**
 * This method returns the repeated characters inside a string
 */
fun charRepeatedInTheString(s: String): MutableMap<Char, Int> {
    val myNewString = s.replace(" ", "")
    // Store all characters and
    // their frequencies in dictionary
    var char: Char = 'a'
    var index = 0
    val d: MutableMap<Char, Int> = HashMap()
    for (ch in myNewString) {
        if (d.containsKey(ch)) {
            d[ch] = d[ch]!! + 1
        } else {
            d[ch] = 1
        }
    }

    d.keys.forEach {
        if (d[it] == 1) {
            char = it
        }
    }

    for (i in s.indices) {
        if (s[i] == char) {
            index = i
        }
    }

    println(index)



    // Print characters and their
    // frequencies in same order
    // of their appearance
    for (pChar in myNewString) {
        // Print only if this
        // character is not printed
        // before
        if (d[pChar] != 0) {
            print("$pChar->")
            print(d[pChar].toString() + " ")
            d[pChar] = 0
        }
    }

    return d
}

//fun findFirstNonRepeating() {
//    // inDLL[x] contains pointer to a DLL node if x is
//    // present in DLL. If x is not present, then
//    // inDLL[x] is NULL
//    val inDLL: MutableList<Char> = ArrayList()
//
//    // repeated[x] is true if x is repeated two or more
//    // times. If x is not seen so far or x is seen only
//    // once. then repeated[x] is false
//    val repeated = BooleanArray(MAX_CHAR)
//
//    // Let us consider following stream and see the
//    // process
//    val stream = "geeksforgeeksandgeeksquizfor"
//    for (element in stream) {
//        val x = element
//        println(
//            "Reading " + x
//                    + " from stream \n"
//        )
//
//        // We process this character only if it has not
//        // occurred or occurred only once. repeated[x]
//        // is true if x is repeated twice or more.s
//        if (!repeated[x.toInt()]) {
//            // If the character is not in DLL, then add
//            // this at the end of DLL.
//            if (!(inDLL.contains(x))) {
//                inDLL.add(x)
//            } else  // Otherwise remove this character from
//            // DLL
//            {
//                inDLL.remove(x)
//                repeated[x.toInt()] = true // Also mark it as repeated
//            }
//        }
//
//        // Print the current first non-repeating
//        // character from stream
//        if (inDLL.size != 0) {
//            print(
//                "First non-repeating character so far is "
//            )
//            println(inDLL[0])
//        }
//    }
//}

//Question:
//Implement an algorithm to determine if a string has all unique characters
//"abc" = true
//"abba" = false

fun String.myExtension(): Long {
    return this.toLong()
}

fun checkUniqueCharacters(inputString: String): Boolean =
    inputString.toCharArray().toMutableSet().size == inputString.length

fun main() {
    val s: Long = "rere".myExtension()
    println(printString(10000000000))
}

//Write a program to find the title from a given number using the below rule.
//A-1
//B-2
//C-3
//D-4
//--
//--
//--
//Y-25
//Z-26
//
//input 27 o/p AA
//input 54 o/p BB
//input 10000000000  o/p AFIPYQJP

fun printString(n: Long): String {

    var number = n
    val arr = IntArray(10000)
    var i = 0
    val result = StringBuilder()

    // Step 1: Converting to number
    // assuming 0 in number system
    while (number > 0) {
        arr[i] = number.toInt() % 26
        number /= 26
        i++
    }

    // Step 2: Getting rid of 0, as 0 is
    // not part of number system
    for (j in 0 until i - 1) {
        if (arr[j] <= 0) {
            arr[j] += 26
            arr[j + 1] = arr[j + 1] - 1
        }
    }
    for (j in i downTo 0) {
        if (arr[j] > 0) {
            result.append('A' + arr[j] - 1)
        }
    }

    return result.toString()
}
