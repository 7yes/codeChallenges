package com.yesI.codechallenges

/**
 * Returns sum of k appearing elements.
 * Using nested for loops
 * Traversing the array at index 1 and the next one
 */
fun anotherSumOfRepeatingNumberInArray(): Int {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10)

    var sum = 0
    for (fIndex in array.indices) {
        for (sIndex in fIndex + 1 until array.size) {
            if (sIndex != fIndex && array[sIndex] == array[fIndex]) {
                sum += array[sIndex]
            }
        }
    }
    return sum
}

/**
 * Returns sum of k appearing elements.
 * Using hashMap
 * the key is the number and the value the times it is repeated
 */
fun sumOfTheRepeatingItems(numberArray: IntArray): Int {
    var totalResult = 0

    val myMap = HashMap<Int, Int>()

    for(i in numberArray.indices) {
        if(!myMap.containsKey(numberArray[i])) {
            myMap[numberArray[i]] = 0
        }
        myMap[numberArray[i]] = myMap[numberArray[i]]!! + 1
    }

    for(item in myMap.keys) {
        if(myMap[item]!! > 1) {
            totalResult += item
        }
    }

    return totalResult
}