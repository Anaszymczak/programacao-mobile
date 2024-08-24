// Define a classe ContaBancaria com atributos e métodos para gerenciar uma conta bancária.
class ContaBancaria(
    val cliente: String, // Nome do cliente titular da conta.
    var saldo: Double,   // Saldo atual da conta.
    val numero: String,  // Número da conta.
    val agencia: String  // Agência onde a conta está localizada.
) {

    // Método para depositar um valor na conta.
    fun depositar(valor: Double) {
        if (valor > 0) { // Verifica se o valor a ser depositado é positivo.
            saldo += valor // Adiciona o valor ao saldo da conta.
            println("Depósito de R$$valor realizado com sucesso. Novo saldo: R$$saldo.")
        } else {
            println("O valor do depósito deve ser positivo.") // Mensagem de erro se o valor for não positivo.
        }
    }

    // Método para retirar um valor da conta.
    fun retirar(valor: Double) {
        if (valor > 0) { // Verifica se o valor a ser retirado é positivo.
            if (valor <= saldo) { // Verifica se há saldo suficiente para a retirada.
                saldo -= valor // Subtrai o valor do saldo da conta.
                println("Retirada de R$$valor realizada com sucesso. Novo saldo: R$$saldo.")
            } else {
                println("Saldo insuficiente para a retirada.") // Mensagem de erro se o saldo for insuficiente.
            }
        } else {
            println("O valor da retirada deve ser positivo.") // Mensagem de erro se o valor for não positivo.
        }
    }

    // Método para transferir um valor para outra conta.
    fun transferir(destino: ContaBancaria, valor: Double) {
        if (valor > 0) { // Verifica se o valor da transferência é positivo.
            if (valor <= saldo) { // Verifica se há saldo suficiente para a transferência.
                retirar(valor) // Retira o valor da conta atual.
                destino.depositar(valor) // Deposita o valor na conta destino.
                println("Transferência de R$$valor realizada com sucesso para a conta ${destino.numero}.")
            } else {
                println("Saldo insuficiente para a transferência.") // Mensagem de erro se o saldo for insuficiente.
            }
        } else {
            println("O valor da transferência deve ser positivo.") // Mensagem de erro se o valor for não positivo.
        }
    }

    // Método para imprimir o extrato da conta.
    fun imprimirExtrato() {
        println("=== Extrato Bancário ===")
        println("Cliente: $cliente") // Imprime o nome do cliente.
        println("Número da Conta: $numero") // Imprime o número da conta.
        println("Agência: $agencia") // Imprime o número da agência.
        println("Saldo: R$$saldo") // Imprime o saldo atual da conta.
        println("========================")
    }
}
