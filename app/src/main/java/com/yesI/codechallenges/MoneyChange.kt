package com.yesI.codechallenges

import java.util.*

object MakeChange {
    @JvmStatic
    fun main(args: Array<String>) {
        val keyboard = Scanner(System.`in`)
        var change: Int
        print("Enter the purchase price:")


        val price: Int = Math.round(keyboard.nextDouble() * 100).toInt()
        print("Enter the amount given by the customer:")
        val provided: Int = Math.round(keyboard.nextDouble() * 100).toInt()

        var ls = mutableListOf<String>()

        if (provided > price) {
            println("The change is: " + (provided - price) / 100.00)
            println("The customer should be given the change as follows:")
            change = provided - price
            // Since you multiplied by 100 you have to divide by 2000 to get the
            // number of twenties for change.

            val hundreds = change / 10000
            if (hundreds > 0) { // if the change is less than $20 this will be a 0
                change %= 10000 // this resets the value of change to
                // the remainder after the twenties are
                // calculated but only if there was at
                // least enough to make one twenty
                println("$hundreds $100 bill(s)")
                ls.add("")
            }

            val fifties = change / 5000
            if (fifties > 0) { // if the change is less than $20 this will be a 0
                change %= 5000 // this resets the value of change to
                // the remainder after the twenties are
                // calculated but only if there was at
                // least enough to make one twenty
                println("$fifties $50 bill(s)")
            }

            val twenties = change / 2000

            if (twenties > 0) { // if the change is less than $20 this will be a 0
                change %= 2000 // this resets the value of change to
                // the remainder after the twenties are
                // calculated but only if there was at
                // least enough to make one twenty
                println("$twenties $20 bill(s)")
            }
            val tens = change / 1000
            if (tens > 0) {
                change %= 1000
                println("$tens $10 bill(s)")
            }
            val fives = change / 500
            if (fives > 0) {
                change %= 500
                println("$fives $5 bill(S)")
            }
            val ones = change / 100
            if (ones > 0) {
                change %= 100
                println("$ones $1 bill(s)")
            }
            val quarters = change / 25
            if (quarters > 0) {
                change %= 25
                println("$quarters quarter coin(s)")
            }
            val dimes = change / 10
            if (dimes > 0) {
                change %= 10
                println("$dimes dime coin(s)")
            }
            val nickels = change / 5
            if (nickels > 0) {
                change %= 5
                println("$nickels nickel coin(s)")
            }
            val pennies = change
            println("$pennies penny coin(s)")
        }
        if (provided < price) { // this statement is saying that if the customer
            // doesn't pay enough, it will tell the user
            print("Not enough money!")
        } else if (provided == price) { // this statement says if the amount
            // provided matches the price, then
            // there is no change necessary
            print("No change is necessary!")
        }
    }
}

object MakeChange2 {
    @JvmStatic
    fun main(args: Array<String>) {
        //Create scanner object
        //Create scanner object
        val keyboard = Scanner(System.`in`)

        //Get purchase amount from user
        print("Enter the purchase amount: ")
        val purchaseAmount = keyboard.nextDouble()

        //Get cash tendered from user
        print("Enter the amount of cash tendered: ")
        val cashTendered = keyboard.nextDouble()

        println(calculateChange(purchaseAmount, cashTendered))
    }
}

fun calculateChange(price: Double, cash: Double): String {
    val changeMap = mutableListOf<String>()

    if(cash == price) return "ZERO"
    if(cash < price) return "ERROR"

    //Declare contant values
    val hundredValue = 100
    val fiftyValue = 50
    val twentyValue = 20
    val tenValue = 10
    val fiveValue = 5
    val dollarValue = 1
    val halfDollarValue = 50
    val quarterValue = 25
    val dimeValue = 10
    val nickelValue = 5
    val convertCoins = 100 //converts coin values to int

    var change = 0.0 // change to be made

    //Compute Change to be made
    change = cash - price

    //Determine change to be made
    while (change >= dollarValue) {
        when {
            change >= hundredValue -> {
                change %= hundredValue.toDouble()
                changeMap.add("HUNDRED")
            }
            change >= fiftyValue -> {
                change %= fiftyValue.toDouble()
                changeMap.add("FIFTY")
            }
            change >= twentyValue -> {
                change %= twentyValue.toDouble()
                changeMap.add("TWENTY")
            }
            change >= tenValue -> {
                change %= tenValue.toDouble()
                changeMap.add("TEN")
            }
            change >= fiveValue -> {
                change %= fiveValue.toDouble()
                changeMap.add("FIVE")
            }
            else -> {
                change %= dollarValue.toDouble()
                changeMap.add("ONE")
            }
        }
    }

    /*At this point, total change is multiplied by a constant
**in order to deal with the coins as integers.*/
    while (change != 0.0) {
        when {
            change < 1 -> {
                change = (change.toFloat() * convertCoins).toDouble()
            }
            change >= halfDollarValue -> {
                change %= halfDollarValue.toDouble()
                changeMap.add("HALF DOLLAR")
            }
            change >= quarterValue -> {
                change %= quarterValue.toDouble()
                changeMap.add("QUARTER")
            }
            change >= dimeValue -> {
                change %= dimeValue.toDouble()
                changeMap.add("DIME")
            }
            change >= nickelValue -> {
                change %= nickelValue.toDouble()
                changeMap.add("NICKEL")
            }
            else -> {
                changeMap.add("PENNY")
                change = 0.0
            }
        }
    }

    return changeMap.joinToString(",")
}