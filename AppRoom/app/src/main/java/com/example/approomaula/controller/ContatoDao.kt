package com.example.approomaula.controller

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContatoDao {

    @Upsert
    suspend fun upsertContato(contato: Contato)

    @Delete
    suspend fun deleteContato(contato: Contato)

    @Query("SELECT * FROM Clientes ORDER BY nome ASC")
    fun getContatoOrdenadoPeloNome(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY sobrenome ASC")
    fun getContatoOrdenadoPeloSobrenome(): Flow<List<Contato>>

    @Query("SELECT * FROM Clientes ORDER BY telefone ASC")
    fun getContatoOrdenadoPeloTelefone(): Flow<List<Contato>>

}