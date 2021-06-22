class Conta(
    val titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun depositoConta(deposito: Double) {
        println(this.saldo)
        this.saldo += deposito
        println(this.saldo)
    }

    fun saqueConta(saque: Double) {
        println(this.saldo)
        when {
            this.saldo == 0.0 -> "Nao ha saldo em conta"
            this.saldo >= saque -> this.saldo -= saque
            else -> println("Saque nao pode ser maior que o saldo em conta")
        }

        println(this.saldo)
    }

    fun transferenciaContaParaConta(contaTransferencia: Conta, valor: Double): Boolean {
        when {
            contaTransferencia.titular == this.titular -> {
                println("Nao e permitido transferencia numa mesma conta");return false
            }
            this.saldo < valor -> {
                println("Nao ha saldo necessario para realizar a transferencia");return false
            }

            else -> {
                println(this.saldo)
                contaTransferencia.depositoConta(valor)
                this.saldo -= valor
                println(this.saldo)
                return true
            }
        }
    }

    override fun toString(): String {
        val retornoConta = "{Titular = $titular, NumeroConta = $numeroConta, Saldo = $saldo"
        return retornoConta
    }
}