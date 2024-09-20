fun main() {
    // Solicita ao usuário que digite um número inteiro
    println("Digite um número inteiro para ver a tabuada:")

    // Lê a entrada do usuário e tenta converter para um inteiro (Int)
    val numero = readLine()?.toIntOrNull()

    // Verifica se a conversão foi bem-sucedida
    if (numero != null) {
        // Loop para percorrer pelos multiplicadores de 1 a 10
        for (multiplicador in 1..10) {
            // Calcula o resultado da multiplicação
            val resultado = numero * multiplicador

            // Imprime a linha da tabuada
            println("$numero x $multiplicador = $resultado")
        }
    } else {
        // Informa o usuário se a entrada não for um número válido
        println("Por favor, insira um número inteiro válido.")
    }
}
