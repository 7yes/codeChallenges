package com.yesI.codechallenges

fun main() {
    val input = "3.5;3.52"
    println(getChange(input))
}

fun getChange(input : String): BreakDown? {
    val values = input.split(";")
    var change = (values[1].toFloat()*100 - values[0].toFloat()*100).toInt()
    var breakDown = BreakDown()
    if (change<0)  { println("Not enoght money")
        return null }

    breakDown.bill50 = change/5000
    change = change - breakDown.bill50*5000
    breakDown.bill20 = change/2000
    change = change - breakDown.bill20*2000
    breakDown.bill10 = change/1000
    change = change - breakDown.bill10*1000
    breakDown.bill5 = change/500
    change = change - breakDown.bill5*500
    breakDown.bill1 = change/100
    change = change - breakDown.bill1*100
    breakDown.coin50 = change/50
    change = change - breakDown.coin50*50
    breakDown.coin25 = change/25
    change = change - breakDown.coin25*25
    breakDown.coin10 = change/10
    change = change - breakDown.coin10*10
    breakDown.coin5 = change/5
    change = change - breakDown.coin5*5
    breakDown.coin1 = change
    return(breakDown)
}

data class BreakDown(
    var bill50 : Int = 0,
    var bill20 : Int = 0,
    var bill10 : Int = 0,
    var bill5 : Int = 0,
    var bill1 : Int = 0,
    var coin50 : Int = 0,
    var coin25 : Int = 0,
    var coin10 : Int = 0,
    var coin5 : Int = 0,
    var coin1 : Int = 0
)