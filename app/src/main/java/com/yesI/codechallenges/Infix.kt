package com.yesI.codechallenges

fun main(){
    infix fun Int.timesa(str: String) = str.repeat(this)        // 1
    println(2 timesa  "Bye ")                                    // 2

    var string : String ="d"
    println(string.repeat(3))                           //3

    infix fun Int.times(num : Int) = num*this
    println(3 times(2) )                                    //4

    val pair = "Ferrari" to "Katrina"                       // 5
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 6
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 7
///
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 8
}



