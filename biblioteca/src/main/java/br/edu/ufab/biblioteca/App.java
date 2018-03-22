package br.edu.ufab.biblioteca;

import biblioteca.conexao.Conexao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*Testando base de dados*/
        Conexao con = new Conexao(); 
        con.getConnection();
        
    }	
}
