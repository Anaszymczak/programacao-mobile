fun main() {
    println("\n Escreva um programa que leia dois números inteiros e imprima o maior deles. \n")

    print("informe o 1° número ")
    var n1 = readLine()!!.toInt()

    print("informe o 2° valor:" )
    var n2= readLine()!!.toInt()

    val maior = if (n1 > n2) n1 else n2

    println("o maior número entre: $n1 e $n2 é >>> $maior \n")

}