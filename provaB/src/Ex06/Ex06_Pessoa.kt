data class Pessoa(val nome: String, val idade: Int) : Comparable<Pessoa> {
    override fun compareTo(other: Pessoa): Int {
        return this.idade.compareTo(other.idade)
    }
}