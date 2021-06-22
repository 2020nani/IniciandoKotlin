fun testaContasDiferentes() {
    val contaHernani = ContaCorrente(titular = "hernani", numeroConta = 1)
    contaHernani.depositoConta(deposito = 2000.00)
    println("Saldo atual CC Hernani = ${contaHernani.saldo}")
    contaHernani.saqueConta(saque = 1000.00)
    println("Saldo atual CC Hernani = ${contaHernani.saldo}")

    val contaHernaniPoupanca = ContaPoupanca(titular = "hernani", numeroConta = 2)
    contaHernaniPoupanca.depositoConta(deposito = 2000.00)
    println("Saldo atual CP Hernani = ${contaHernaniPoupanca.saldo}")
    contaHernaniPoupanca.saqueConta(saque = 1000.00)
    println("Saldo atual CP Hernani = ${contaHernaniPoupanca.saldo}")
    println("Saldo Contas antes transferencia, Saldo CC: ${contaHernani.saldo}, Saldo CP: ${contaHernaniPoupanca.saldo}")
    contaHernaniPoupanca.transferenciaContaParaConta(contaTransferencia = contaHernani, valor = 200.0)
    println("Saldo Contas depois transferencia, Saldo CC: ${contaHernani.saldo}, Saldo CP: ${contaHernaniPoupanca.saldo}")
}