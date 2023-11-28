package com.example.approomaula.model

import com.example.approomaula.controller.Contato
import com.example.approomaula.controller.Tipos

data class Contato(
    val contato: List<Contato> = emptyList(),
    val nome: String = "",
    val sobrenome: String = "",
    val telefone: String = "",
    val cpf: String = "",
    val rg: String = "",
    val rg: Int = 0,
    val adicionarContato: Boolean = false,
    val tipos: Tipos = Tipos.nome
)
