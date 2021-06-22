fun testaAutenticacao() {
    val admim = Gerente(
        nome = "Hernani", cpf = "333.333.333.33",
        tipoFuncionario = TipoFuncionario.gerente, senha = 123456
    )
    val admim2 = Cliente(
        nome = "Jose", cpf = "444.444.444-44",
        senha = 654321
    )
    val admim3 = Diretor(
        nome = "Hernani", cpf = "333.333.333.33",
        tipoFuncionario = TipoFuncionario.diretor, senha = 123456
    )
    if (Sistema().autenticacao(admin = admim, password = 123456)) {
        println("Seja bem vindo ao Banco DIgital")
    } else {
        println("Senha invalida")
    }
    if (Sistema().autenticacao(admin = admim2, password = 654321)) {
        println("Seja bem vindo ao Banco DIgital")
    } else {
        println("Senha invalida")
    }
    if (Sistema().autenticacao(admin = admim3, password = 123456)) {
        println("Seja bem vindo ao Banco DIgital")
    } else {
        println("Senha invalida")
    }
    testaFuncionario()
}