class ContaCorrente(
    titular: String,
    numeroConta: Int,

    ) :
    Conta(
        titular = titular,
        numeroConta = numeroConta,

        ) {

    override fun saqueConta(saque: Double) {
        when {
            this.saldo == 0.0 -> "Nao ha saldo em conta"
            this.saldo >= saque + (saque * 0.01) -> this.saldo -= saque + (saque * 0.01)
            else -> println("Saque nao pode ser maior que o saldo em conta")
        }

    }
}