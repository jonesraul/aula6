/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Aluno05
 */
public class Usuario {
      String mensagemScesso=" login realizado com sucesso";
      String mensagemErro=" usuario não cadastrado";   
      String login1="jones@jones.com.br";
      String senha2="123";
      String mensagem;
      
    public  String validarLogin(String login,String senha){
        String testelogin=login;
        String testesenha=senha;
        // tem que usar o equals pois a String é um objeto e equals compara o conteudo
       if (testelogin.equals(login1)&&testesenha.equals(senha2)){
           mensagem = mensagemScesso;
       }else{
            mensagem = mensagemErro;
       }
           
      return(mensagem);
    }
    
    public void cadastroUsuario(){
        
    }
    
}
    

