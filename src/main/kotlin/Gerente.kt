class Gerente(
    nome: String,
    cpf: String,
    tipoFuncionario: TipoFuncionario,
    val senha: Int,

) : Funcionario (nome = nome, cpf = cpf, tipo=tipoFuncionario){

    fun autenticacao(password: Int): Boolean {
        if (this.senha == password) {
            return true
        }
        return false
    }

    override fun toString(): String {
        val gerente = "{Nome: $nome, Cpf: $cpf, Salario: $salario, Senha: $senha"
        return gerente
    }
}