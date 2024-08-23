fun main() {

    println("\nEscreva um programa que leia um número e verifique se este número é múltiplo de 3 e 4.\n")

    print(">> Informe um valor: ")
    val num = readLine()!!.toInt()

    val result = if (num%4==0 && num%3==0) "Valor >> É << multiplo de 3 e 4" else "Valor >> NÃO << é multiplo de 3 e 4"

    println(" Resultado: $result")
}