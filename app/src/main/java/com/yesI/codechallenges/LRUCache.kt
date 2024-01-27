package com.yesI.codechallenges

internal open class LRUCache(private val CAPACITY: Int) {

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    private val map: LinkedHashMap<Int, Int> by lazy {
        object : LinkedHashMap<Int, Int>(CAPACITY, 0.75f, true) {
            override fun removeEldestEntry(eldest: Map.Entry<Int, Int>): Boolean {
                return size > CAPACITY
            }
        }
    }

    // This method works in O(1)
    operator fun get(key: Int): Int {
        println(
            "Going to get the value " +
                    "for the key : " + key
        )
        return map.getOrDefault(key, -1)
    }

    // This method works in O(1)
    operator fun set(key: Int, value: Int) {
        println(
            ("Going to set the (key, " +
                    "value) : (" + key + ", " + value + ")")
        )
        map[key] = value

    }

    val m = arrayListOf<String>()

}