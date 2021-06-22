
open class Funcionario(
    val nome: String,
    val cpf: String,
    var tipo: TipoFuncionario
) {
    var salario = 0.0
        private set

    fun pagamentoSalario(pagamento: Double) {
        this.salario += pagamento + this.tipo.bonificacao(pagamento)
    }

    override fun toString(): String {
        val funcionario = "{Nome: $nome, Cpf: $cpf, Salario: $salario"
        return funcionario
    }
}