fun testaCondicional(saldo: Double) {
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