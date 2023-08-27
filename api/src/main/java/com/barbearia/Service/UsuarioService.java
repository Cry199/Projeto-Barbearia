package com.barbearia.Service;

import com.barbearia.DAO.UsuarioDAO;
import com.barbearia.Model.Usuarios;

public class UsuarioService 
{
    private UsuarioDAO usuarioDAO;
    
    public void inserir(Usuarios usuario) 
    {
        //Validações
        usuarioDAO.inserir(usuario);
    }

    public void atualizar(Usuarios usuario) 
    {
        //Validações
        
        usuarioDAO.atualizar(usuario);
    }

    public void excluir(int id) 
    {
        //Validações

        usuarioDAO.excluir(id);
    }
}
