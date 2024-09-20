//Crie uma classe base FormaGeometrica com os atributos cor e area. Crie subclasses Circulo e Retangulo, adicionando atributos específicos
//e sobrescrevendo o metoodo calcularArea().
//Crie uma lista de objetos FormaGeometrica e calcule a área total de todas as formas.
open class FormaGeometrica(val cor: String) {
    open var area: Double = 0.0
        protected set

    open fun calcularArea() {
        // Método a ser sobrescrito nas subclasses
    }
}

class Retangulo(cor: String, val largura: Double, val altura: Double) : FormaGeometrica(cor) {
    override var area: Double = 0.0
//        private set

    override fun calcularArea() {
        area = largura * altura
    }
}
class Circulo(cor: String, val raio: Double) : FormaGeometrica(cor) {
    override var area: Double = 0.0
//        private set

    override fun calcularArea() {
        area = Math.PI * raio * raio
    }
}

fun main() {
    // Criando uma lista de formas geométricas
    val formas: List<FormaGeometrica> = listOf(
        Circulo("Vermelho", 5.0),
        Retangulo("Azul", 4.0, 6.0),
        Circulo("Verde", 3.0),
        Retangulo("Amarelo", 2.0, 5.0)
    )

    // Calculando a área total
    var areaTotal = 0.0

    for (forma in formas) {
        forma.calcularArea() // Calcula a área da forma
        areaTotal += forma.area // Soma a área à área total
    }

    println("Área total de todas as formas: $areaTotal")
}
