package com.yesI.codechallenges

// 02-01-2021
/**
 * How many years are going to pass before your bd it is in the same day
 *
 * If K=0mod4 and born before 29th FEB then your birthday will fall on same day after 5 year
 * If K=0mod4 and born after 29th FEB then your birthday will fall on same day after 6 years
 * If K=0mod4 and born on 29th FEB then your birthday will fall on same day after 28 years
 * If K=1mod4 then your birthday will fall on same day after 6 years
 * If K=2mod4 born before 29th FEB then your birthday will fall on same day after 6 year
 * If K=2mod4 born after 29th FEB then your birthday will fall on same day after 11 year
 * If K=3mod4 born before 29th FEB then your birthday will fall on same day after 11 year
 * If K=3mod4 born after 29th FEB then your birthday will fall on same day after 5 year
 */
fun sameDayYears(birthDayDate: String): Int {
    val mBirthDate = birthDayDate.split("-").map {
        it.toInt()
    }
    var days = 0
    var year = mBirthDate[2]

    if (mBirthDate[0] > 2) {
        do {
            year++
            if (isLeapYear(year)) {
                days += 2
            } else {
                days++
            }
        } while (days % 7 != 0)
    } else if (mBirthDate[0] == 2 && mBirthDate[1] == 29) {
        do {
            year++
            if (isLeapYear(year)) {
                days += 2
            } else {
                days++
            }
        } while (days % 7 != 0 || !isLeapYear(year))
    } else {
        do {
            if (isLeapYear(year)) {
                days += 2
            } else  {
                days++
            }
            year++
        } while (days % 7 != 0)
    }
    return year - mBirthDate[2]
}

fun isLeapYear(year: Int): Boolean {
    if (year % 4 == 0) {
        if(year % 100 != 0 || year % 400 == 0) {
            return true
        }
    }
    return false
}

fun main() {
    println(sameDayYears("02-01-2016"))
}