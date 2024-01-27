package com.yesI.codechallenges

/**
 * Method to reverse each word in provided string
 * with hte same order
 */
fun reverseWordSameOrder(inputString: String): String {
    //split string by space
    val strList = inputString.split(" ")  // Spilt String by Space
    val sb = StringBuilder()

    //iterate string List
    for (items in strList) {
        if (items != "") {
            //reverse List item and reverse them
            val rev = StringBuilder(items).reverse().toString()
            //append reverse April20.string into String Builder
            sb.append("$rev ")
        }
    }

    //return final reverse string
    return sb.toString()
}