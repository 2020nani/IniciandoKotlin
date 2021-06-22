
abstract class FuncionarioAdmim(
    nome: String,
    cpf: String,
    tipo: TipoFuncionario,
    var senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    tipo = tipo
) {
    open fun autentica(senha: Int): Boolean {
        println("Funcionario Admin")
        if(this.senha == senha){
            return true
        }
        return false
    }

    override fun toString(): String {
        val funcionario = "{Nome: $nome, Cpf: $cpf, Salario: $salario, Senha: ${senha}"
        return funcionario
    }
}