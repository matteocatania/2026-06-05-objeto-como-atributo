package org.example
class Fecha (private var anio: Int = 0, private var mes: Int = 0, private var dia: Int = 0) {
override fun toString(): String {
    return "clase(anio=$anio, mes=$mes, dia=$dia)"
}
}