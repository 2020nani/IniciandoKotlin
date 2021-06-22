class Gerente(
    nome: String,
    cpf: String,
    tipoFuncionario: TipoFuncionario,
    senha:Int
) : FuncionarioAdmim (nome = nome, cpf = cpf, tipo=tipoFuncionario, senha = senha)
  , Autenticacao{

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmim>.autentica(senha)
    }

    override fun toString(): String {
        val gerente = "{Nome: $nome, Cpf: $cpf, Salario: $salario, Senha: $senha"
        return gerente
    }
}