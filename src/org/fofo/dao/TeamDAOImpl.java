/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fofo.dao;

import java.util.List;
import javax.persistence.*;
import org.fofo.entity.Team;

/**
 *
 * @author josepma
 */
public class TeamDAOImpl implements TeamDAO{

   EntityManager em;
   
   public TeamDAOImpl(){
       

       
   }
   
   public void setEM(EntityManager em){
       this.em = em;
   }
   
   public EntityManager getEM(){
       return this.em;
   }

    public EntityManager getEntityManagerFact() {

     try{

         EntityManagerFactory emf = 
           Persistence.createEntityManagerFactory("fofo");
         return emf.createEntityManager();  

     }
     catch(Exception e){
	 e.printStackTrace();
	 return null;
     }

    }


    public void addTeam(Team team){
    

       try{
          em.getTransaction().begin();
          em.persist(team);
          em.getTransaction().commit();
          
       }
       catch (PersistenceException e){
	    e.printStackTrace();
       }
       finally{
         if (em.isOpen()) em.close();
       }
    }
    
    public void removeTeam(String name){
    
    }
    
   
    public List<Team> getTeams(){
        
        return  null;
        
    }
    
    
    public Team findTeamByName(String name){
        
        return null;        
        
    }
    
    public List<Team> findTeamByClub(String name){
        
        return null;
    }
    
    
}
