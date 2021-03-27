package br.com.gabriel.planetsinfo.model

import java.io.Serializable

class Planeta(
    nome: String,
    tipo: String,
    nomeImagem: String,
    descricao: String
): Serializable {

    val nome = nome
    val tipo = tipo
    var descricao = descricao
    val nomeImagem = nomeImagem
}