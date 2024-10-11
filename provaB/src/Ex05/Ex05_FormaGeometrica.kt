package Ex05

open class FormaGeometrica(val cor: String) {
    open var area: Double = 0.0
        protected set

    open fun calcularArea() {
        // Método a ser sobrescrito nas subclasses
    }
}