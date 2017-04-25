/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.ArrayList;
/**
 *
 * @author Utente
 */
public class Gruppo {
    
    private int id;
    private String nomeGruppo;
    private ArrayList<Utente> listaUtentiGruppo= new ArrayList<Utente>();
    
    public Gruppo(){
       id= 0;
       nomeGruppo = "";
    }

    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNomeGruppo(){
        return nomeGruppo;
    }
    
    public void setNomeGruppo(String nomeGruppo){
        this.nomeGruppo = nomeGruppo;
    }
    
    public void addUtenteGruppo(Utente user){
        listaUtentiGruppo.add(user);
    }
    
    public ArrayList getListaUtenti() {
        
        ArrayList<Utente> listaUt = new ArrayList<Utente>();
        for (Utente utente : this.listaUtentiGruppo) {
            listaUt.add(utente);
        }
        return listaUt;
    }
}
