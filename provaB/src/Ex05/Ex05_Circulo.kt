package Ex05

class Circulo(cor: String, val raio: Double) : FormaGeometrica(cor) {
    override var area: Double = 0.0
//        private set

    override fun calcularArea() {
        area = Math.PI * raio * raio
    }
}