package com.yesI.codechallenges

fun predictNumber(position: Int): Int {
    val finalList = mutableListOf(0)

    while (position > finalList.size) {
        finalList.addAll(checkSequence(finalList))
    }

    return finalList[position]
}

fun checkSequence(seqNow: MutableList<Int>): MutableList<Int> {
    val tempList = mutableListOf<Int>()

    seqNow.forEach {
        when (it) {
            0 -> {
                tempList.add(1)
            }
            1 -> {
                tempList.add(2)
            }
            2 -> {
                tempList.add(0)
            }
        }
    }

    return tempList
}

fun main() {
    println(predictNumber(12))
}