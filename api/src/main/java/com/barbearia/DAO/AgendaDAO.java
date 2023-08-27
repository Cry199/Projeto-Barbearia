package com.barbearia.DAO;

import java.util.List;

import com.barbearia.Model.Agenda;

public class AgendaDAO 
{
    public void inserir(Agenda agenda) 
    {
        // abre conexão 
        // insert SQL 
        // agenda.setId(chave gerada)
    }

    public void atualizar(Agenda agenda) 
    {
        // update SQL
    }

    public void excluir(int id) 
    {
        // delete SQL 
    }

    public Agenda buscarPorId(int id) 
    {
        // select SQL 
        // cria objeto Agenda e retorna

        return null;
    }
  
    public List<Agenda> buscarPorFuncionario(int funcionarioId) 
    {
        // select SQL filtrando por funcionarioId
        // cria lista de Agenda

        return null;
    }    
}
