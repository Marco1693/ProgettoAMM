/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco_Brundu
 */
public class UtenteFactory {
    private static UtenteFactory singleton;
   
    public static UtenteFactory getInstance() {
        if (singleton == null) {
            singleton = new UtenteFactory();
        }
        return singleton;
    }
    
    private String connectionString;
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    public String getConnectionString(){
	return this.connectionString;
    }
    
    
    private UtenteFactory(){
    }    
    
    public Utente getUtenteById(int id){
        try {
            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "select * from utenti "
                    + "where utente_id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id);
            
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                Utente current = new Utente();
                current.setId(res.getInt("utente_id"));
                current.setUsername(res.getString("username"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setUrlFotoProfilo(res.getString("urlFotoProfilo"));
                current.setFraseDiPresentazione(res.getString("fraseDiPresentazione"));
                current.setDataNascita(res.getString("dataNascita"));

                stmt.close();
                conn.close();
                return current;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String username, String password){
        try {
            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "select utente_id from utenti "
                    + "where username = ? and password = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                int id = res.getInt("utente_id");

                stmt.close();
                conn.close();
                return id;
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public List getListaUtenti() {
        List<Utente> listaUtenti = new ArrayList<Utente>();
        
        try {
            // path, username, password
            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "select * from utenti";
            
            // Prepared Statement
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // Esecuzione query
            ResultSet res = stmt.executeQuery();

            // ciclo sulle righe restituite
            if (res.next()) {
                Utente current = new Utente();
                current.setId(res.getInt("utente_id"));
                current.setUsername(res.getString("username"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setUrlFotoProfilo(res.getString("urlFotoProfilo"));
                current.setFraseDiPresentazione(res.getString("fraseDiPresentazione"));
                current.setDataNascita(res.getString("dataNascita"));
                
                listaUtenti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaUtenti;
    }
    public void modificaDati(Utente utente){
        try {

            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "update utenti (utente_id, username, nome, cognome, password, urlfotoprofilo, frasedipresentazione, datanascita) "
                    + "values (?, ? , ? , ? , ?, ?, ? , ?)";
            

            PreparedStatement stmt = conn.prepareStatement(query);
            

            stmt.setInt(1, utente.getId());

            stmt.setString(2, utente.getUsername());
            
            stmt.setString(3, utente.getNome());
            
            stmt.setString(4, utente.getCognome());
            
            stmt.setString(5, utente.getPassword());
            
            stmt.setString(6, utente.getUrlFotoProfilo());
            
            stmt.setString(7, utente.getFraseDiPresentazione());
            
            stmt.setString(8, utente.getDataNascita());

            
            // Esecuzione query
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public List getListaUtenti(String name) {
        List<Utente> listaUtenti = new ArrayList<Utente>();
        
        try {
            
            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "select * from utenti where name like ?";
            
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
           
            stmt.setString(1, "%" + name + "%");
            
            
            ResultSet res = stmt.executeQuery();

           
            while (res.next()) {
                Utente current = new Utente();
                current.setId(res.getInt("utente_id"));
                current.setUsername(res.getString("username"));
                current.setNome(res.getString("nome"));
                current.setCognome(res.getString("cognome"));
                current.setPassword(res.getString("password"));
                current.setUrlFotoProfilo(res.getString("urlFotoProfilo"));
                current.setFraseDiPresentazione(res.getString("fraseDiPresentazione"));
                current.setDataNascita(res.getString("dataNascita"));
                
                listaUtenti.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaUtenti;
    }
}