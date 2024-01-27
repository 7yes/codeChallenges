package com.yesI.codechallenges

import kotlin.math.min

fun main() {
    val original_time = "10:05"
    val new_time = "02:34"
    val obj = ChangeTime()
    println(obj.findMinOperations(original_time, new_time))
}

// Class to Store time in
// HH:MM:SS format respectively.
internal class ReadTime {
    var hh = 0
    var mm = 0
}

/* Name of the class to con time */
internal class ChangeTime {
    // two object one for each original and
    // New time
    var res = ReadTime()
    var res1 = ReadTime()

    // hh is HH, mm is MM and ss is SS
    // in HH:MM:SS format respectively.
    private fun readTime(time: String, res: ReadTime) {
        val values = time.split(":").toTypedArray().map { it.toInt() }
        res.hh = values[0]
        res.mm = values[1]
    }

    // Returns minimum number of operations required
    // to convert original_time to new_time.
    fun findMinOperations(original_time: String, new_time: String): Int {


        // Here ots is the original time in
        // seconds.
        readTime(original_time, res)
        val ots = 3600 * res.hh + 60 * res.mm


        // Here nts is the new time in
        // seconds.
        readTime(new_time, res1)
        val nts = 3600 * res1.hh + 60 * res1.mm


        // Here gre and sma is to find which
        // time is ahead and which is back
        // respectively.
        var gre = Math.max(ots, nts)
        val sma = Math.min(ots, nts)

        // diff is array containing two integers.
        // One is second's difference between gre and sma.
        // The other one is the second's difference when
        // the greater will goes up to 24 hr and than come
        // back to sma.
        //int diff[]=new int[5];
        gre -= sma
        val diff = intArrayOf(gre, 86400 - gre)

        // ope is array containing two integers, the number
        // of operations needed to change the time
        // corresponding to two differences.
        val ope = IntArray(2)
        for (i in 0..1) {
            // Firstly move the hour hand as much as
            // possible.
            // This gives the number of operations
            // by hour hand.
            ope[i] = diff[i] / 3600

            // The seconds left after moving hour
            // hand.
            diff[i] = diff[i] % 3600

            // If number of seconds left are greater
            // than 1830 than move hour hand one more time
            if (diff[i] >= 900) {
                ope[i]++

                // Now seconds left will be:
                //diff[i] = 3600 - diff[i]
            }

            // Now move the minute hand as much as
            // possible.
            ope[i] = ope[i] + diff[i] / 60

            // The seconds left after moving minute
            // hand.
            diff[i] = diff[i] % 60

            // If number of seconds left are greater
            // than 30 than move minute hand one more time
            if (diff[i] > 30) {
                ope[i]++

                // Now seconds left will be:
                diff[i] = 60 - diff[i]
            }
            ope[i] = ope[i] + diff[i]
        }

        // The answer will be the minimum of operations
        // needed to cover those two differences.
        return min(ope[0], ope[1])
    }

    companion object {
        // Driver code
        @JvmStatic
        fun main(args: Array<String>) {
            val original_time = "23:45"
            val new_time = "08:00"

            // should be 24

//            val original_time = "07:30"
//            val new_time = "08:00"
            val obj = ChangeTime()
            println(obj.findMinOperations(original_time, new_time))
        }
    }
}

fun maxProfit(prices: IntArray?): Int {
    if (prices == null || prices.size <= 1) return 0
    var min = prices[0] // min so far
    var result = 0
    for (i in 1 until prices.size) {
        result = Math.max(result, prices[i] - min)
        min = Math.min(min, prices[i])
    }

    return result
}

