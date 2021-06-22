fun testaComportamentoConta() {
    val conta1 = ContaCorrente(titular = "hernani", numeroConta = 1)
    val conta2 = ContaCorrente(titular = "junior", numeroConta = 2)

    conta1.depositoConta(1000.0)
    conta2.depositoConta(2000.0)
    conta1.saqueConta(100.0)
    conta2.saqueConta(100.0)
    var x = conta1.transferenciaContaParaConta( contaTransferencia = conta2, valor = 900.00)
    println(x)
    println(conta1)
    println(conta2)


}