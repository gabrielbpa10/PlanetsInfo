package br.com.gabriel.planetsinfo.model

import java.io.Serializable

class Planeta(
    nome: String,
    tipo: String,
    numeroImagem: Int,
    descricao: String
){

    val nome = nome
    val tipo = tipo
    var descricao = descricao
    val numeroImagem = numeroImagem
}