package com.example.approomexemplo.controller

//metodos Set para as variaveis do banco
sealed interface ContatoAcoes{

    //erdando a variaval para a prorpia classe
    data class SetNome(val nome: String): ContatoAcoes
    data class SetSobrenome(val sobrenome: String): ContatoAcoes
    data class SetTelefone(val telefone: String): ContatoAcoes
    data class SetCpf(val cpf: String): ContatoAcoes
    data class SetRg(val rg: String): ContatoAcoes
    data class SetNascimento(val nascimento: String): ContatoAcoes
}