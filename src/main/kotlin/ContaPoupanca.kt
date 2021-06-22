class ContaPoupanca(
    titular: String,
    numeroConta: Int
) :
    Conta(
        titular = titular,
        numeroConta = numeroConta
    ) {


    override fun saqueConta(saque: Double) {
        when {
            this.saldo == 0.0 -> "Nao ha saldo em conta"
            this.saldo >= saque -> this.saldo -= saque
            else -> println("Saque nao pode ser maior que o saldo em conta")
        }
    }
}