package com.yesI.codechallenges

fun main() {
    val circulo: Circulo = Circulo(2)
    val rectangle: Rectangle = Rectangle(2,3)

    println("Hola ")
    println(circulo.getArea())
    println(circulo.getPerimetro())
    println(rectangle.getArea())
    println(rectangle.getPerimetro())

    //fibonachi
//    for(i in 0..20)
//    println("$i ${fibo(i)}")

    //Binary Search
//    val num = listOf(1, 3, 4, 7, 9, 10, 12)
//    for (i in num - 1)
//    println(bS(num, 0, num.size - 1, 0))

}

fun bS(arr: List<Int>, ini: Int, fin: Int, key: Int): Int? {
    var mid = (ini + fin) / 2
    if(ini==fin && arr[mid] != key) return(null)
    if (arr[mid] == key) return (key)
    if (arr[mid] > key) return bS(arr, ini, mid - 1, key)
    else return bS(arr, mid + 1, fin, key)
}

fun fibo(num: Int): Int {
    if (num < 1) return (0)
    else if (num == 1) return (1)
    else return (fibo(num - 1) + fibo(num - 2))
}


interface IGeometrica {
    val pi: Double
        get() = 3.14

    fun getArea(): Double
    fun getPerimetro(): Double
}

class Circulo(private val radio: Int) : IGeometrica {
    //val circuloInterno: Int = 1
    override fun getArea(): Double {
        return (pi * radio * radio)
    }

    override fun getPerimetro(): Double {
        return (2 * pi * radio)
    }

}

class Rectangle(val base: Int, val altura: Int) : IGeometrica {
    //var rectanguloInterno: Int = 2
    override fun getArea(): Double {
        return (base * altura).toDouble()
    }

    override fun getPerimetro(): Double {
        return (base * 2 + altura * 2).toDouble()
    }

}