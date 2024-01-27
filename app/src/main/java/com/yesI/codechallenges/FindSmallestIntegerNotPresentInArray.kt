package com.yesI.codechallenges

internal object GFG {
    fun firstMissingPositive(nums: IntArray): Int {
        val newitems = nums.sorted()
        var ans = 1
        for (i in newitems) {
            if (i == ans) ans++
        }
        return ans
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(-1,-3)
        val ans = firstMissingPositive(arr)
        println(ans)
    }
}