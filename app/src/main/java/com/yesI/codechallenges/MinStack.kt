package com.yesI.codechallenges

import java.util.*
import kotlin.math.min

class MinStack {
    var mStack: Stack<Holder> = Stack()

    fun push(x: Int) {
        if (mStack.isEmpty()) {
            mStack.push(Holder(x, x))
        } else {
            val min = min(mStack.peek().minimum, x)
            mStack.push(Holder(x, min))
        }
    }

    fun pop(): Int {
        return mStack.pop().aVal
    }

    fun top(): Int {
        return mStack.peek().aVal
    }

    val min: Int
        get() = mStack.peek().minimum

}
data class Holder(var aVal: Int, var minimum: Int)