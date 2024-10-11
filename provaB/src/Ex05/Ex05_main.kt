package Ex05

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