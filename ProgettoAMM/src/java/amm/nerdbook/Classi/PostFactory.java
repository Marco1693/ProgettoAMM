/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.Classi;

import java.util.List;
import java.util.ArrayList;
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
    private ArrayList<Post> listaPost = new ArrayList<Post>();

    private PostFactory() {
        
        UtenteFactory utenteFactory = UtenteFactory.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setContent("Ognuna di quelle vite è quella giusta. Ogni percorso è il giusto percorso. Ogni cosa avrebbe potuto essere un'altra e avrebbe avuto lo stesso profondo significato.(Nemo Nobody)");
        post1.setId(0);
        post1.setUtente(0);
        post1.setText("");
        post1.setPostType(Post.Type.TEXT);

        Post post2 = new Post();
        post2.setContent("img/gol.jpeg");
        post2.setId(1);
        post2.setUtente(1);
        post2.setText("CHE GOOOL DI KAKA'");
        post2.setPostType(Post.Type.IMAGE);

        Post post3 = new Post();
        post3.setContent("https://tinyurl.com/k34etds");
        post3.setId(2);
        post3.setUtente(2);
        post3.setText("non mi ricordo cosa c'era nel link");
        post3.setPostType(Post.Type.URL);
        

        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
  
    }

    public Post getPostById(int id) {
        for (Post post : this.listaPost) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public List getPostList(int utnt) {

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) {
            if (post.getUtente()==utnt){
                listaPost.add(post);
            }
        }
        return listaPost;
    }
}
