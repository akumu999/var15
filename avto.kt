/**
 * Класс автомобиль
 * @property marka_avto - Марка автомобиля
 * @property engine_power - Мощность двигателя
 * @property kol_mest - кол-во мест автомобиля
 * @author Расулов Мурад ПР-33
 */

open class avto(_car_brand: String, _engine_power: Double, _number_of_places: Int) {
    private var car_brand: String
    private var engine_power: Double
    private var number_of_places: Int
    init {
        car_brand = _car_brand
        engine_power = _engine_power
        number_of_places = _number_of_places
    }

    /**
     * Расчет качества объекта
     * @return - качество объекта рассчитанное по формуле [Double]
     * @author - Расулов Мурад ПР-33
     */
    open fun Quality():Double{
        return (0.1 * engine_power * number_of_places)
    }

    /**
     * Вывод информации на экран
     * @return - строка с информацией [String]
     * @author - Расулов Мурад ПР-33
     */
    open fun printInfo():String{
        return "Марка автомобиля: $car_brand, Мощность двигателя: $engine_power, Число мест: $number_of_places"
    }
}