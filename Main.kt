fun main() {
    println("Базовый класс")
    val BMW = avto(_car_brand = "BMW M5", _engine_power = 140.5, _number_of_places = 4)
    println(BMW.printInfo())
    println("Класс потомок")
    val BMW_god_izgotovleniya = create(_car_brand = "BMW M5", _engine_power = 140.5, _number_of_places = 4, _P = 2020, _T = 2022)
    println(BMW_god_izgotovleniya.printInfo())
}