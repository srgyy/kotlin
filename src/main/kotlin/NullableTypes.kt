fun main() {
    var a: String = "Hello"
//    a = null NPE excluded

    println(a.length)

    var b: String? = "Text"
    b = null

//    b.length

    // Если лежит строка, то вернет строку, если null, то null (НИКАКИХ NPE!)
    b?.length //safecall

    //Elvis оператор....................................................................................................
    val l = b?.length ?: -1

    // !! - выбрасывает NPE
    b = if ((0..10).random() > 5) "adsad" else null
    val t = b!!.length

}