import java.lang.StringBuilder
import java.math.BigDecimal
import test.first.*

fun fail(message: String): Nothing
{ throw
    IllegalStateException(message)
}

fun consonantOrVowel (symbol : Char) =
        when (symbol.toLowerCase()) {
            'a','e','i','o','u','y' -> "vowel"
            else -> "consonant"
        }

fun strLen (s : String?) = s!!.length

fun main (args : Array<String>)
{
    val er : Int = 122
    val ss : Char = 'Q'

    var f = 123.4F
    var d = 1.2e-10
    var l = 123L

    var collection = arrayListOf(1,2,3,1)
    var num : Any? = null

    val c = 'z'

    val sss = "Hello, \n \t World"
    val ssss = """Hello, \n \t World"""

    println("$sss \n $ssss")

    val bb : Byte = Byte.MIN_VALUE

    val ten = 1 .. 10
    ten.forEach { it * 2 }
    val chars = 'a' .. 'z'
    val b : Boolean = 'b' in chars

    for (i in 1 until 10 step 2)
        print(i.toString() + " ")

    var kk : String

    println("Java".."Scala" + bb)

    val points = Array<Array<Int>>(10, {Array<Int>(10, {0})})

    var cinema = arrayOf<Array<Int>>()

    val mixedArray = arrayOf (43, "hh", 22, BigDecimal(10.5), 'c')

    transposeSquareMatrix(points)
    println()
    println(consonantOrVowel('z'))

    val nums = 1..10

    for (i in 10 downTo 1 step 2)
        print(i.toString() + " ")
}







