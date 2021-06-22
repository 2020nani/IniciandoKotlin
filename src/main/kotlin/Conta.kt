abstract class Conta(
    val titular: String,
    val numeroConta: Int
) {

    var saldo = 0.0
        protected set

    fun depositoConta(deposito: Double) {
        println(this.saldo)
        this.saldo += deposito
        println(this.saldo)
    }

    abstract fun saqueConta(saque: Double)

    fun transferenciaContaParaConta(contaTransferencia: Conta, valor: Double): Boolean {
        when {
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