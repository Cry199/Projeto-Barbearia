package com.barbearia.Service;

import com.barbearia.DAO.AgendaDAO;
import com.barbearia.Model.Agenda;

public class AgendaService 
{
    private AgendaDAO agendaDAO;

    public void inserir(Agenda agenda) 
    {
        //Validações
        agendaDAO.inserir(agenda);
    }

    public void atualizar(Agenda agenda) 
    {
        //Validações
        
        agendaDAO.atualizar(agenda);
    }

    public void excluir(int id) 
    {
        //Validações

        agendaDAO.excluir(id);
    }
}
