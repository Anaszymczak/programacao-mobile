fun main() {

    println("\nEscreva um programa que leia três números inteiros e imprima o maior deles.\n")

    print(">> Informe o 1º número: ")
    val n1 = readLine()!!.toInt()

    print(">> Informe o 2º número: ")
    val n2 = readLine()!!.toInt()

    print(">> Informe o 3º número: ")
    val n3 = readLine()!!.toInt()

    var maior = 0

    if (n1 > n2 && n1 > n3){
        maior = n1
    }else if (n2 > n1 && n2 > n3){
        maior = n2
    }else{
        maior = n3
    }
    println("\n>> Maior numero entre: $n1 | $n2 | $n3 é >>> $maior \n")
}