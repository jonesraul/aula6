/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Aluno05
 */
public class UsuarioDAO {
     
    
    String emailCadastrado="jones@bol.com";
    String senhaCadastrada="sss";
   
    
    public boolean cadastrar(String email, String senha){
        
      //  if(senha.length()<6 || senha.length()>15){
       //    return false;  
     //   }
        return emailCadastrado.equals(email)&&senhaCadastrada.equals(senha);
    }
    



 public void Login(){
        
    }
 
}