/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

/**
 *
 * @author Utente
 */
public class Utente {
    
    private int id;
    private String username;
    private String nome;
    private String cognome;
    private String urlFotoProfilo;
    private String fraseDiPresentazione;
    private String dataNascita;
    private String password;
    
    public Utente(){
        id = 0;
        username= "";
        nome = "";
        cognome= "";
        urlFotoProfilo="";
        fraseDiPresentazione= "";
        dataNascita = "";
        password ="";
    }
    /**
    * @return id utente
    */
    public int getId(){
        return this.id;
    }
    
   
    /**
    * @param id l'id dell'utente da settare
    */
    public void setId(int id){
        this.id = id;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    /**
     * @return nome dell'utente
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * @param nome dell'utente da settare
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    
    /**
     * @return cognome dell'utente
     */
    public String getCognome(){
        return this.cognome;
    }
    
    /**
     * @param cognome dell'utente da settare
     */
    public void setCognome(String cognome){
        this.cognome = cognome;   
    }
    
    /**
     * @return urlFotoProfilo url della foto profilo dell'utente
     */
    public String getUrlFotoProfilo(){
        return this.urlFotoProfilo;
    }
    
    /**
     * @param urlFotoProfilo dell'utente da settare
     */
    public void setUrlFotoProfilo(String urlFotoProfilo){
        this.urlFotoProfilo = urlFotoProfilo;
    }
    
    /**
     * @return fraseDiPresentazione dell'utente
     */
    public String getFraseDiPresentazione(){
        return this.fraseDiPresentazione;
    }
    
    /**
     * @param fraseDiPresentazione dell'utente da settare
     */
    public void setFraseDiPresentazione(String fraseDiPresentazione){
        this.fraseDiPresentazione = fraseDiPresentazione;
    }
    
    /**
    *@return dataNascita dell'utente
    */
    public String getDataNascita(){
        return this.dataNascita;
    }
    
    /**
     * @param dataNascita dell'utente da settare
     */
    public void setDataNascita(String dataNascita){
        this.dataNascita = dataNascita;
    }
    
    /**
     * @return password dell'utente
     */
    public String getPassword(){
        return this.password;
    }
    
    /**
     * @param password setta la password dell'utente
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * @param altroUtente altro utente passato come parametro
     * @return true se l'id di altroUtente è uguale a quello dell'utente corrente
     */
    @Override
    public boolean equals(Object altroUtente) {
        if (altroUtente instanceof Utente)
            if (this.getId() == ((Utente)altroUtente).getId()) return true;
        return false;
    }
}

