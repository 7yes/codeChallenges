package com.yesI.codechallenges

import java.util.*
import kotlin.collections.ArrayList


// Function which shuffle and print the array
fun shuffle(card: ArrayList<String>) {
    val rand = Random()
    for (i in card.indices) {

        // Random for remaining positions.
        val r: Int = i + rand.nextInt(card.size - i)

        //swapping the elements
        val temp = card[r]
        card[r] = card[i]
        card[i] = temp
    }
}

fun main(args: Array<String>) {
    // Array from 0 to 51
    val a = arrayListOf(
        "one", "two", "three", "four",
        "five", "six", "seven", "eight"
    )

    shuffle(a)

    // Printing all shuffled elements of cards
    for (i in a.indices) print(a[i] + " ")
}