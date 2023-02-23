import java.time.Period

fun main() {
    val child = Person("Child", "Child", 1)
    val p1 = Person("Tom", "Jones", 35, child)
    print(p1.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2)
}

//Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() //обычный ArrayList

    init {
        println("Person is created $firstName")
    }

    //Вторичный конструктор должен всегда вызывать первичный конструктор
    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    //конструктор без аргументов
    constructor() : this("", "", -1)
}

//помечая словом data в классе будут автоматически созданы equals, hashcode, toString и тд
data class Rectangle(var height: Double, var lenght: Double) {
    var perimeter = (height + lenght) * 2

    var test = 1
        get() = field + 1; //this.поле получает переменную test этого обьекта
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * lenght
}