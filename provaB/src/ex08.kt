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
