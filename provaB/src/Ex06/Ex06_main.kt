fun main() {
    // Lista de Produtos
    val produtos = mutableListOf(
        Produto("Produto A", 10.0),
        Produto("Produto B", 5.0),
        Produto("Produto C", 15.0)
    )

    // Ordenando produtos por preço
    produtos.sortBy { it.preco }
    println("Produtos ordenados por preço:")
    produtos.forEach { println("${it.nome}: R$ ${it.preco}") }

    // Lista de Pessoas
    val pessoas = mutableListOf(
        Pessoa("Alice", 30),
        Pessoa("Bob", 25),
        Pessoa("Charlie", 35)
    )

    // Ordenando pessoas por idade
    pessoas.sortBy { it.idade }
    println("\nPessoas ordenadas por idade:")
    pessoas.forEach { println("${it.nome}: ${it.idade} anos") }
}