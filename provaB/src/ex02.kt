fun main() {
    // Solicita ao usuário que digite um número inteiro
    println("Digite um número inteiro:")

    // Lê a entrada do usuário e tenta converter para um inteiro (Int)
    val numero = readLine()?.toIntOrNull()

    // Verifica se a conversão foi bem-sucedida (ou seja, se o usuário digitou um número válido)
    if (numero != null) {
        // Usa a expressão 'when' para verificar em qual intervalo o número se encontra
        when {
            // Caso o número seja menor que 0
            numero < 0 -> println("O número é menor que 0.")
            // Caso o número esteja entre 0 e 10 (incluindo 0 e 10)
            numero in 0..10 -> println("O número está entre 0 e 10.")

            // Caso o número esteja entre 11 e 20 (incluindo 11 e 20)
            numero in 11..20 -> println("O número está entre 11 e 20.")

            // Caso o número seja maior que 20
            else -> println("O número é maior que 20.")
        }
    } else {
        // Se a conversão não foi bem-sucedida, informa o usuário que a entrada é inválida
        println("Por favor, insira um número inteiro válido.")
    }
}
