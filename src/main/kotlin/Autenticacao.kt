interface Autenticacao {

    val senha: Int

    fun autentica(senha: Int) : Boolean {
        println("Interface Autenticacao")
        if(this.senha == senha){
            return true
        }
        return false
    }
}