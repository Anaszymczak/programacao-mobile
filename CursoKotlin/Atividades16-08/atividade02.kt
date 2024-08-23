//Escreva um programa que leia as dimensões de um retângulo e calcule a área e o perímetro

fun main() {
    println("\n 2. Escreva um programa que leia as dimensões de um retângulo e calcule a área e o perímetro \n")

    print("informe a largura: ")
    var larg = readLine()!!.toDouble()

    print("informe a altura:" )
    var alt = readLine()!!.toDouble()

    val area = (larg * alt)
    val perimetro = (larg * alt)* 2

    println("Area do retangulo: $area")
    println("perimetro do retangulo: $perimetro")

}