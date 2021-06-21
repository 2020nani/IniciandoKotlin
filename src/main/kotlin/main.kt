fun main() {
    val titular = "hernani"
    val numeroConta = 1000
    var saldo = 0.0
    var j = 0

    for (i in 5 downTo 1) {
        if(i == 4){
            continue
        }

        saldo = 1.0 - i
        testacondicional(saldo)
    }
    while(j < 10){
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