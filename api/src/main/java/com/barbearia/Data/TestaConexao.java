package com.barbearia.Data;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao 
{
    public static void main(String[] args) 
    {
        try 
        {
			Connection connection = new ConnectionBarbers().getConnection();
			connection.close();
            
			System.out.println("Conexão aberta!");
		} 
        catch (SQLException e) 
        {
			e.printStackTrace();
		}    
    }
}