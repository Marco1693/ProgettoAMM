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

public class PostFactory {
    private static PostFactory singleton;
    
    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
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
    

    private PostFactory() {
    }

    public Post getPostById(int id) {
       UtenteFactory utenteFactory = UtenteFactory.getInstance();
        
        try {
            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "select * from posts "
                    + "join posttype on posts.type = posttype.posttype_id "
                    + "where post_id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, id);
            
            ResultSet res = stmt.executeQuery();

            if (res.next()) {
                Post current = new Post();
                //imposto id del post
                current.setId(res.getInt("post_id"));
                
                //impost il contenuto del post
                current.setContent(res.getString("content"));
                current.setText(res.getString("text"));
                
                //imposto il tipo del post
                current.setPostType(this.postTypeFromString(res.getString("posttype_name")));
                
                //imposto l'autore del post
                Utente autore = utenteFactory.getUtenteById(res.getInt("author"));
                current.setUtente(autore.getId());

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
    public List getPostList(Utente user) {
        List<Post> listaPost = new ArrayList<Post>();
        
        try {
            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "select * from posts "
                    + "join posttype on posts.type = posttype.posttype_id "
                    + "where author = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, user.getId());
            
            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                
                Post current = new Post();
                current.setId(res.getInt("post_id"));
                
                current.setContent(res.getString("content"));
                
                current.setPostType(this.postTypeFromString(res.getString("posttype_name")));

                //imposto l'autore del post
                current.setUtente(user.getId());
                
                current.setText(res.getString("text"));
                
           
                listaPost.add(current);
            }

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPost;
    }
    
    public void addNewPost(Post post){
        try {

            Connection conn = DriverManager.getConnection(connectionString, "marko123", "asdasd");
            
            String query = 
                      "insert into posts (post_id, content, type, author, text) "
                    + "values (default, ? , ? , ? , ?)";
            

            PreparedStatement stmt = conn.prepareStatement(query);
            

            stmt.setString(1, post.getContent());

            stmt.setInt(2, this.postTypeFromEnum(post.getPostType()));
            
            stmt.setInt(3, post.getUtente());
            
            stmt.setString(4, post.getText());
            

            
            // Esecuzione query
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    private Post.Type postTypeFromString(String type){
        
        if(type.equals("IMAGE"))
            return Post.Type.IMAGE;
        if(type.equals("URL"))
            return Post.Type.URL;
        
        return Post.Type.TEXT;
    }
   
    private int postTypeFromEnum(Post.Type type){
        if(type == Post.Type.TEXT)
                return 1;
            else
                if(type == Post.Type.IMAGE)
                    return 2;
        return 3;
    }
}
