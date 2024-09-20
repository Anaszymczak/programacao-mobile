import kotlin.Comparable

interface Comparable<T> {
    fun compareTo(other: T): Int
}

data class Pessoa(val nome: String, val idade: Int) : Comparable<Pessoa> {
    override fun compareTo(other: Pessoa): Int {
        return this.idade.compareTo(other.idade)
    }
}

data class Produto(val nome: String, val preco: Double) : Comparable<Produto> {
    override fun compareTo(other: Produto): Int {
        return this.preco.compareTo(other.preco)
    }
}

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