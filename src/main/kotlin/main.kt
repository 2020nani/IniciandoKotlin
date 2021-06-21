fun main() {
    val conta1 = Conta(titular = "hernani", numeroConta = 1)
    val conta2 = Conta(titular = "junior", numeroConta = 2)

    conta1.depositoConta(1000.0)
    conta2.depositoConta(2000.0)
    conta1.saqueConta(100.0)
    conta2.saqueConta(100.0)
    var x = conta1.transferenciaContaParaConta( contaTransferencia = conta2, valor = 900.00)
    println(x)
    println(conta1)
    println(conta2)


}

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


fun criandoClasses() {
    val conta1 = Conta("hernani", 1)
    val conta2 = Conta("junior", 2)
    println(conta1.toString())
    println(conta2.toString())
}

fun testaLaçoRepetiçao() {
    val titular = "hernani"
    val numeroConta = 1000
    var saldo = 0.0
    var j = 0

    for (i in 5 downTo 1) {
        if (i == 4) {
            continue
        }

        saldo = 1.0 - i
        testacondicional(saldo)
    }
    while (j < 10) {
        saldo += j
        testacondicional(saldo)
        j++
    }
}

fun testacondicional(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("Conta Neutra")
        else -> println("Conta Negativa")
    }
    /*ou
    if(saldo > 0.0){
        println("conta é positiva")
    } else if (saldo == 0.0){
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
    */
}