enum class TipoFuncionario {

    comum {
        override fun bonificacao(valor: Double): Double {
            return valor * 0.1
        }

    },
    gerente {
        override fun bonificacao(valor: Double): Double {
            return valor * 0.2
        }

    },
    diretor {
        override fun bonificacao(valor: Double): Double {
            return valor * 0.3
        }

    };

    abstract fun bonificacao(valor: Double): Double;

}
