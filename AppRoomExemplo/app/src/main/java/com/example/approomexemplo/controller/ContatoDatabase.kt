package com.example.approomexemplo.controller

import androidx.room.Database
import androidx.room.RoomDatabase


//Criando o banco de dados
@Database(
    entities = [Contato::class],
    version = 1
)

//pegando os comandos Dao com forma de herança
abstract class ContatoDatabase: RoomDatabase() {
    abstract val dao: ContatoDao
}