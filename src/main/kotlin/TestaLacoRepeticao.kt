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
        testaCondicional(saldo)
    }
    while (j < 10) {
        saldo += j
        testaCondicional(saldo)
        j++
    }
}