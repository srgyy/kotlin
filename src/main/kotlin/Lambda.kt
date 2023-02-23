fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> println(e) }
    a.map { e -> e * 2 }
    a.filter { e -> e % 2 == 0 }
    a.reduce { sum, e -> sum + e } // sum()

    a.sorted()
    a.sortedByDescending { it } //по убыванию

    // it - при итерации по коллекции временная переменная называется так - по конвенции
    a.any() { it > 10 } //Если хотя бы один элемент совпадает - возвращает тру
    a.all { it < 10 } // Возвращает true если все элементы удовлетворяют условию
    a.sum()

    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 } //Разделяет одну коллекцию на две по какому-то признаку

    println(positive)
    println(negative)

    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length } //сгрупирует строки по длинне
    println(result) //HashMap or LinkedHashMap


}