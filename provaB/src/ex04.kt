// Classe que representa uma conta bancária
class ContaBancaria(
    val titular: String, // Nome do titular da conta
    val numero: String,  // Número da conta
    private var saldo: Double = 0.0 // Saldo inicial da conta (0.0)
) {
    // Metodo para realizar um depósito na conta
    fun deposito(valor: Double) {
        // Verifica se o valor do depósito é positivo
        if (valor > 0) {
            saldo += valor // Adiciona o valor ao saldo
            println("Depósito de R$$valor realizado!") // Confirmação do depósito
        } else {
            println("Depósito inválido. Valor deve ser positivo.") // Mensagem de erro
        }
    }

    // Metodo para realizar um saque da conta
    fun saque(valor: Double) {
        // Verifica se o valor do saque é positivo
        if (valor > 0) {
            // Verifica se há saldo suficiente para o saque
            if (valor <= saldo) {
                saldo -= valor // Subtrai o valor do saldo
                println("Saque de R$$valor realizado!") // Confirmação do saque
            } else {
                println("Saldo insuficiente!") // Mensagem de erro se saldo for insuficiente
            }
        } else {
            println("Saque inválido. Valor deve ser positivo.") // Mensagem de erro
        }
    }

    // metodo para consulta
    fun consultaSaldo(): Double {
        return saldo // Retorna o saldo atual
    }
}

// Função principal onde o programa começa a execução
fun main() {
    // Cria uma nova conta bancária para a titular "Ana" com o número "001"
    val conta = ContaBancaria(titular = "Ana", numero = "001")

    // Exibe as informações iniciais da conta
    println("Titular: ${conta.titular}") // Nome do titular
    println("Número: ${conta.numero}")   // Número da conta
    println("Saldo inicial: R$${conta.consultaSaldo()}") // Saldo inicial

    // Realiza um depósito de R$300
    conta.deposito(300.0) // Chama o metodo de depósito
    println("Saldo após depósito: R$${conta.consultaSaldo()}") // Exibe o saldo após o depósito

    // Realiza um saque de R$150
    conta.saque(150.0) // Chama o metodo de saque
    println("Saldo após saque: R$${conta.consultaSaldo()}") // Exibe o saldo após o saque

    // Tenta realizar um saque de R$200, que deve falhar devido ao saldo insuficiente
    conta.saque(200.0) // Chama o metodo de saque
    println("Saldo após tentativa de saque: R$${conta.consultaSaldo()}") // Exibe o saldo após a tentativa de saque
}
