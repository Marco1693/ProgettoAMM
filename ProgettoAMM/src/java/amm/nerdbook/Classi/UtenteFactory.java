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
    
    private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
    
    private UtenteFactory() {
        //Creazione utenti
        
        Utente user1 = new Utente();
        user1.setId(0);
        user1.setNome("Ignazio");
        user1.setCognome("meh");
        user1.setUrlFotoProfilo("M2/img/user1.jpeg");
        user1.setFraseDiPresentazione("non so cosa scrivere 123");
        user1.setDataNascita("11/11/1980");
        user1.setPassword("1234");
        
        Utente user2 = new Utente();
        user2.setId(0);
        user2.setNome("Giampaolo");
        user2.setCognome("Pazzini");
        user2.setUrlFotoProfilo("M2/img/user2.jpeg");
        user2.setFraseDiPresentazione("attualmente giocatore dell'Hellas Verona");
        user2.setDataNascita("02/08/1984");
        user2.setPassword("montolivolento");
        
        Utente user3 = new Utente();
        user3.setId(0);
        user3.setNome("Marco");
        user3.setCognome("Brundu");
        user3.setUrlFotoProfilo("M2/img/user3.jpeg");
        user3.setFraseDiPresentazione("mai una gioia");
        user3.setDataNascita("16/10/1993");
        user3.setPassword("Asdlolxd3");
        
       
        listaUtenti.add(user1);
        listaUtenti.add(user2);
        listaUtenti.add(user3);
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
            if(user.getNome().equals(username) && user.getPassword().equals(password)){
                return user.getId();
            }
        }
        return -1;
    }
        
}