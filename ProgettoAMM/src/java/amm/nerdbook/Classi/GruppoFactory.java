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
public class GruppoFactory {
    
    private static GruppoFactory singleton;

    public static GruppoFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppoFactory();
        }
        return singleton;
    }
    
    private ArrayList<Gruppo> listaGruppi = new ArrayList<Gruppo>();
    
    private GruppoFactory() {
        //Creazione utenti
        UtenteFactory utenteFactory = UtenteFactory.getInstance();
        
        Gruppo group1 = new Gruppo();
        group1.setId(0);
        group1.setNomeGruppo("MilanGroup");
        group1.addUtenteGruppo(utenteFactory.getUtenteById(0));
      
        Gruppo group2 = new Gruppo();
        group2.setId(1);
        group2.setNomeGruppo("LeagueOLGroup");
        group2.addUtenteGruppo(utenteFactory.getUtenteById(1));
        group2.addUtenteGruppo(utenteFactory.getUtenteById(2));
       
        listaGruppi.add(group1);
        listaGruppi.add(group2);
    }
    
    public Gruppo getGruppoById(int id) {
        for (Gruppo group : this.listaGruppi) {
            if (group.getId() == id) {
                return group;
            }
        }
        return null;
    }
}
