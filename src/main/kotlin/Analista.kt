class Analista(
    nome: String,
    cpf: String,
    tipoFuncionario: TipoFuncionario,


) : Funcionario (nome = nome, cpf = cpf, tipo=tipoFuncionario){

    override fun toString(): String {
        val gerente = "{Nome: $nome, Cpf: $cpf, Salario: $salario"
        return gerente
    }
}