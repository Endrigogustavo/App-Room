package com.example.approomexemplo.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

//aqui onde os comandos sql acontecem
@Dao
interface ContatoDao {
    // update/insert
    @Upsert
    suspend fun upsertContato(contato: Contato)

    //Delete
    @Delete
    suspend fun deleteContato(contato: Contato)

    //Select precisa ser feito a mão
    
    @Query("SELECT * FROM Clientes ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY sobrenome ASC")
    fun getContatoOrdenadoPeloSobrenome(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY telefone ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY rg ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY cpf ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY nascimento ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>
}