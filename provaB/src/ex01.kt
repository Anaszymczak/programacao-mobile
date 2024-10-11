import kotlin.math.roundToLong

//Escreva um programa que solicite ao usuário um número inteiro e um número decimal.
// Converta o número inteiro para decimal e o número decimal para inteiro.
// Imprima os resultados na tela, observando possíveis perdas de precisão.
fun main() {
    // Irá solicitar para o usuário um número inteiro
    println("Digite um número inteiro:")
    val numeroInteiro = readLine() // Lê a entrada como string

    // Solicita ao usuário um número decimal
    println("Digite um número decimal:")
    val numeroDecimal = readLine() // Lê a entrada como string

    // Converte o número inteiro para decimal
    val inteiroParaDecimal = numeroInteiro?.toIntOrNull()
    val decimalParaInteiro = numeroDecimal?.toDoubleOrNull()

    // Verifica se a conversão do inteiro foi bem-sucedida
    if (inteiroParaDecimal != null) {
        val decimal = inteiroParaDecimal.toDouble()
        println("Número inteiro convertido para decimal: $decimal")
    } else {
        println("Número inteiro inválido.")
    }

    // Verifica se a conversão do decimal foi bem-sucedida
    if (decimalParaInteiro != null) {

        val inteiro = decimalParaInteiro.roundToLong()
        println("Número decimal convertido para inteiro: $inteiro")

        // Verifica se houve perda de precisão
        if (inteiro != decimalParaInteiro.roundToLong()) {
            println("Atenção: A conversão de decimal para inteiro pode resultar em perda de precisão.")
        }
    } else {
        println("Número decimal inválido.")
    }
}
