
fun main(){
    val test1: String = "Hello"
    var test2: String = "Hello"
    test2 = "Goodbye"
    var test3 = "Kotlin know type"

    println("Value of test1 $test1")
    println("Sum is ${2 + 2}")

    val items = listOf("apple", "banana", "orange") //Неизменяемый список
//    mutableListOf("apple", "banana", "orange") //Изменяемый ArrayList

    //Циклы.............................................................................................................
    for (item in items)
        println(item)

    //while
    var index = 0;
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++;
    }

    //Диапазоны
    println(5 in 3..10) //true

    for (i in 1..10)
        println(i)

    for (i in 1 until 10)
        println(i)

    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10)
        println(i)
}
