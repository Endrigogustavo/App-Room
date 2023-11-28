package com.example.approomexemplo.controller

import androidx.room.Entity
import androidx.room.PrimaryKey

//Criando banco de dados com as dependencias do gradle
@Entity(tableName = "Clientes")

//Informaçoes das tabelas
data class Contato(
    //Id auto incremento
    @PrimaryKey(autoGenerate = true)

    //Campos
    val id: Int = 0,
    val nome: String,
    val sobrenome: String,
    val telefone: String
    val cpf: String
    val rg: String
    val nascimento: String
)
