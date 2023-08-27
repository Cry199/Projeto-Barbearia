package com.barbearia.DAO;

import java.util.List;

import com.barbearia.Enum.TipoUsuario;
import com.barbearia.Model.Usuarios;

public class UsuarioDAO 
{
    public void inserir(Usuarios usuario) 
    {
        // insere usuario no bd
    }
    
    public void atualizar(Usuarios usuario) 
    {
        // atualiza no bd
    }

    public void deletar(int id) 
    {
        // deleta pelo id
    }

    public Usuarios buscarPorId(int id) 
    {
        // busca usuario por id
        // retorna objeto Usuario

        return null;
    }

    public List<Usuarios> buscarPorTipo(TipoUsuario tipo) 
    {
        // busca por tipo 
        // retorna lista de Usuarios

        return null;
    }
    
}
