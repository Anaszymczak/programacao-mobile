data class Produto(val nome: String, val preco: Double) : Comparable<Produto> {
    override fun compareTo(other: Produto): Int {
        return this.preco.compareTo(other.preco)
    }
}