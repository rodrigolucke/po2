/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladoTracer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author m78172
 */
public class Banco {
    
    Connection conn;
    PreparedStatement pstmt;
    ResultSet resultado;

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
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Class.forName("com.mysql.jdbc.Driver");
           // conn = DriverManager.getConnection("jdbc:mysql://localhost/dicionario?" + "user=root&password=root");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dicionario?user=root&password=root");
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String consultar(String palavra){
        String consulta = "";
        try{
            this.conectar();
            String sql = "SELECT palavra FROM  palavras WHERE palavra LIKE '" + palavra + "%' ORDER BY score DESC  LIMIT 4";
            pstmt = conn.prepareStatement(sql);
               
            resultado = pstmt.executeQuery();
            int i = 0;
            while(resultado.next() && i < 4) {
                i++;
                consulta += resultado.getString("palavra") + " ";
            }
            pstmt.close();
            conn.close();   
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return consulta;
    }
    
    
    public String consultarIdPalavra(String palavra){
        String consulta = "";
        try{
            this.conectar();
            String sql = "SELECT id FROM  palavras WHERE palavra = '" + palavra + "'";
            pstmt = conn.prepareStatement(sql);
               
            resultado = pstmt.executeQuery();
            resultado = pstmt.executeQuery();
            int i = 0;
            while(resultado.next() && i < 4) {
                i++;
                consulta += resultado.getString("id") + " ";
            }
            pstmt.close();
            conn.close();   
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return consulta;
    }
    
    
    public String consultarScorePalavra(String idPalavra){
        String consulta = "";
        try{
            this.conectar();
            String sql = "SELECT score FROM  palavras WHERE id = '" + idPalavra + "'";
            pstmt = conn.prepareStatement(sql);
               
           resultado = pstmt.executeQuery();
            int i = 0;
            while(resultado.next() && i < 4) {
                i++;
                consulta += resultado.getString("score") + " ";
            }
            pstmt.close();
            conn.close();   
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return consulta;
    }
    
    public void salvar(String palavra){
        String consulta = "";
        String idPalavra[] = new String[1];
        String consulta2 = "";
        String scorePalavra[] = new String[1];
        
        
        try{
            this.conectar();
            consulta = this.consultarIdPalavra(palavra);
            idPalavra = consulta.split(" ");
            
            consulta2 = this.consultarScorePalavra(idPalavra[0]);
            scorePalavra = consulta2.split(" ");
            String s= scorePalavra[0];
            int score = Integer.parseInt(s);
            score++;
            s = Integer.toString(score);
            
           String sql = "UPDATE palavras SET score = ? WHERE id = ? ";
           pstmt = conn.prepareStatement(sql);
            // set the preparedstatement parameters
            pstmt.setString(1,s);
            pstmt.setString(2,idPalavra[0]);
           

            // call executeUpdate to execute our sql update statement
            pstmt.executeUpdate();
           
            
         
           resultado = pstmt.executeQuery();
            int i = 0;
            while(resultado.next() && i < 4) {
                i++;
                consulta += resultado.getString("palavra") + " ";
            }
            pstmt.close();
            conn.close();   
        }
        catch(Exception e) {
            e.printStackTrace();
        }
       
    }
    
}
