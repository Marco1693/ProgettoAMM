/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;

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
    
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
    
    private UtenteFactory() {
        //Creazione utenti
        
        Utente user1 = new Utente();
        user1.setId(1);
        user1.setUsername("igna123");
        user1.setNome("Ignazio");
        user1.setCognome("Meh");
        user1.setUrlFotoProfilo("M2/img/user1.jpeg");
        user1.setFraseDiPresentazione("non so cosa scrivere 123");
        user1.setDataNascita("11/11/1980");
        user1.setPassword("123");
        
        Utente user2 = new Utente();
        user2.setId(2);
        user2.setUsername("giampy123");
        user2.setNome("Giampaolo");
        user2.setCognome("Pazzini");
        user2.setUrlFotoProfilo("M2/img/user2.jpeg");
        user2.setFraseDiPresentazione("attualmente giocatore dell'Hellas Verona");
        user2.setDataNascita("02/08/1984");
        user2.setPassword("123");
        
        Utente user3 = new Utente();
        user3.setId(3);
        user3.setUsername("marko123");
        user3.setNome("Marco");
        user3.setCognome("Brundu");
        user3.setUrlFotoProfilo("M2/img/user3.jpeg");
        user3.setFraseDiPresentazione("mai una gioia");
        user3.setDataNascita("16/10/1993");
        user3.setPassword("123");
        
        Utente incompleto = new Utente();
        incompleto.setId(4);
        incompleto.setUsername("missing123");
        incompleto.setNome(null);
        incompleto.setCognome(null);
        incompleto.setUrlFotoProfilo("");
        incompleto.setFraseDiPresentazione("esd");
        incompleto.setDataNascita("01/01/1999");
        incompleto.setPassword("123");

       
        listaUtenti.add(user1);
        listaUtenti.add(user2);
        listaUtenti.add(user3);
        listaUtenti.add(incompleto);
    }
    
    public ArrayList<Utente> getListaUtenti(){
        return listaUtenti;
    }
    
    public Utente getUtenteById(int id) {
        for (Utente user : this.listaUtenti) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String username, String password){
        for(Utente user : this.listaUtenti){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user.getId();
            }
        }
        return -1;
    }
        
}