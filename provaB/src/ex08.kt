//Escreva um programa que leia o nome de um arquivo e tente abri-lo para leitura.
// Utilize um bloco try-catch para capturar a exceção FileNotFoundException caso o arquivo não seja encontrado.
// Implemente um mecanismo de reentrada para que o usuário possa informar um novo nome de arquivo.
import java.io.File
import java.io.FileNotFoundException

fun main() {
    var fileName: String?

    do {
        println("Digite o nome do arquivo (com a extensão): ")
        fileName = readLine()

        if (fileName != null) {
            try {
                val file = File(fileName)
                // Tenta abrir o arquivo para leitura
                file.bufferedReader().use { reader ->
                    println("Conteúdo do arquivo '$fileName':")
                    reader.forEachLine { println(it) }
                }
                break // Sai do loop se o arquivo for lido com sucesso
            } catch (e: FileNotFoundException) {
                println("Erro: ${e.message}.Arquivo não encontrado. Tente novamente.")

            }
        }
    } while (true)
}
