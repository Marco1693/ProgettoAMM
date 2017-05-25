/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

/**
 *
 * @author Marco_Brundu
 */
public class Post {

    public enum Type {
        TEXT, IMAGE, URL
    };

    protected int id;
    protected int utente;
    private String content;
    private Type postType;
    private String text;


    public Post() {
        id = 0;
        utente = 0;
        content = "";
        postType = Type.TEXT;
        text = "";
 
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the user
     */
    public int getUtente() {
        return utente;
    }

    /**
     * @param utente the user to set
     */
    public void setUtente(int utente) {
        this.utente = utente;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the postType
     */
    public Type getPostType() {
        return postType;
    }

    /**
     * @param postType the postType to set
     */
    public void setPostType(Type postType) {
        this.postType = postType;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
  

}