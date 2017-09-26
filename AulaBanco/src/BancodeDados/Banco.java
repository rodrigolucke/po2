package BancodeDados;


import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rolf
 */
public class Banco {
     Connection conn;
     PreparedStatement pstmt;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPstmt() {
        return pstmt;
    }

    public void setPstmt(PreparedStatement pstmt) {
        this.pstmt = pstmt;
    }
     
     
    
    public void conectar(){
       
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/aula?" + "user=root&password=root");
            /*pstmt = conn.prepareStatement("insert into teste values(?,?)");
            
            String aux = "teste";
            int valor = 23;
            
            pstmt.setString(1, aux);
            pstmt.setInt(2, valor);
            pstmt.execute();
            
            pstmt.close();*/
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void inserir(String nome, int idade){
       
        try{
           this.conectar();
            
           
            pstmt = conn.prepareStatement("INSERT INTO teste VALUES(?,?)");
            
            pstmt.setString(1, nome);
            pstmt.setInt(2, idade);
            pstmt.execute();
            
           pstmt.close();
           conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public void consultar(String nome, int idade){
        Connection conn;
        PreparedStatement pstmt;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/aula?" + "user=root&password=root");
            pstmt = conn.prepareStatement("SELECT * FROM  teste WHERE nome =?");
            
            
            pstmt.setString(1, nome);
            
            
            pstmt.executeQuery();    
            pstmt.close();
            conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void calcularMedia (){
        Connection conn;
        PreparedStatement pstmt;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/aula?" + "user=root&password=root");
            pstmt = conn.prepareStatement("");
            
            
            
            pstmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}














