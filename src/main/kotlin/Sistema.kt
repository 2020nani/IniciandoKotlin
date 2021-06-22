class Sistema {

    fun autenticacao(admin: Autenticacao,password: Int): Boolean {
        return admin.autentica(password)
    }

}