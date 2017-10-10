package aulaMenu;


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
     PontosGrafico p;

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
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db?" + "user=root&password=root");
            /*pstmt = conn.prepareStatement("insert into teste values(?,?)");
            
            String aux = "teste";
            int valor = 23;
            
            pstmt.setString(1, aux);
            pstmt.setInt(2, valor);
            pstmt.execute();
            
            pstmt.close();*/
           // conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void inserir(PontosGrafico p){
       
        try{
           this.conectar();
            
           
            pstmt = conn.prepareStatement("INSERT INTO user VALUES(?,?)");
            
            pstmt.setInt(1,p.getX());
            pstmt.setInt(2, p.getY());
            pstmt.execute();
            
           pstmt.close();
           conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public PontosGrafico consultar(String nome){
      
        try{
           this.conectar();
            pstmt = conn.prepareStatement("SELECT * FROM  user WHERE nome =? LIMIT 1");
            
            
            pstmt.setString(1, nome);
            

    
          ResultSet resultado;    
            resultado = pstmt.executeQuery();
      
            p = new PontosGrafico();
            p.setX(resultado.getInt(1));
            p.setY(resultado.getInt(2));
            
           
            pstmt.close();
            conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
       return p ;
    }
    
    public int[] calcularMedia (){
      
        int[] retorno = new int[2]; 
        try{
          
            pstmt = conn.prepareStatement("SELECT sum(idade) as totalIdades,count(1) as totalPessoas FROM  user ");
            
            ResultSet resultado;    
            resultado = pstmt.executeQuery();
            retorno[0] = resultado.getInt("totalIdades");
            retorno[0] = resultado.getInt("totalPessoas");
            
            pstmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }

    public void excluir(String nome) {
       try{
           this.conectar();
            
           
            pstmt = conn.prepareStatement("DELETE FROM user WHERE nome =(?)");
            
            pstmt.setString(1,nome);
            
            pstmt.execute();
            
           pstmt.close();
           conn.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}














