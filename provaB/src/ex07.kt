//Crie uma lista de objetos de uma classe personalizada representando
// pessoas com nome, idade e altura. Ordene essa lista por:
//Altura em ordem decrescente.
//Idade em ordem crescente, considerando a altura como critério de desempate.
//Nome em ordem alfabética.
// Definindo a classe Pessoa
data class Pessoa2(
    val nome: String,
    val idade: Int,
    val altura: Double
)

fun main() {
    // Criando uma lista de pessoas
    val pessoas = listOf(
        Pessoa2("Alice", 30, 1.70),
        Pessoa2("Bob", 25, 1.80),
        Pessoa2("Carlos", 25, 1.75),
        Pessoa2("Diana", 22, 1.60),
        Pessoa2("Eve", 30, 1.70)
    )

    // Ordenando a lista
    val pessoasOrdenadas = pessoas.sortedWith(compareByDescending<Pessoa2> { it.altura }
        .thenBy { it.idade }
        .thenBy { it.nome })

    // Imprimindo a lista ordenada
    pessoasOrdenadas.forEach { println(it) }
}