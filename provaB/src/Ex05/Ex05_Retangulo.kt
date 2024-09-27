package Ex05

class Retangulo(cor: String, val largura: Double, val altura: Double) : FormaGeometrica(cor) {
    override var area: Double = 0.0
//        private set

    override fun calcularArea() {
        area = largura * altura
    }
}