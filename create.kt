class create(_car_brand: String, _engine_power: Double, _number_of_places: Int, _P: Int, _T: Int): avto(_car_brand, _engine_power, _number_of_places) {
    private var P: Int
    private var T: Int
    init {
        P = _P
        T = _T
    }

    override fun Quality(): Double {
        return super.Quality() - 1.5 * (T-P)
    }

    override fun printInfo(): String {
        return super.printInfo() + "Год изготовления: $P, Текущий год: $T, QP: ${Quality()}\n"
    }
}