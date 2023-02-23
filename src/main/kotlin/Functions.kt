fun main() {
    println(testSimple(3, 10))
    println(testString(10))
    println(testNamedArguments(y = 4, z = 2, x = 5))

    testDefaultArguments()
    testDefaultArguments(y = 1)
    testDefaultArguments(3, 5)

    println(foo2("Joe Peach"))

    printEven(2, 3, 4, 5, 6, 7, 8, 9, 22)
    println("printEven")
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8, 9, 10)
}

fun testSimple(x: Int, y: Int): Int = x + y
//fun testSimple(x: Int, y: Int): = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) { //Значения по умолчанию
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String =
    if (toUpperCase) name.toUpperCase() + number
    else name + number

fun foo2(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    return (if (toUpperCase) name.toUpperCase() else name) + number
}

//varargs передаем в функцию любое количество аргументов
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}
