package br.com.gabriel.planetsinfo.model

class Planeta(
    nome: String,
    tipo: String,
    nomeImagem: String,
    descricao: String
) {

    private val nome = nome
    private val tipo = tipo
    private var descricao = descricao
    private val nomeImagem = nomeImagem

    fun getNome(): String {return this.nome}

    fun getTipo(): String {return this.tipo}

    fun getDescricao(): String {return this.descricao }

    fun getNomeImagem(): String{return this.nomeImagem}
}