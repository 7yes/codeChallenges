package com.yesI.codechallenges

private fun getMinAndMax(arr: Array<Int>) {
    val sortedArray = arr.sortedArray()

    var min = arr[0]
    var max = 0
    var total = 0

    sortedArray.forEach { element ->
        total += element

        when {
            element < min -> { min = element }
            element > max -> { max = element }
        }
    }

    println("${total - max} ${total - min}")
}

fun main() {
    getMinAndMax(arrayOf(5,4,2,3,1))
}