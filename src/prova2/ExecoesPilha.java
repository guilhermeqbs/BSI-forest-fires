/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author Guilherme
 */
public class ExecoesPilha extends Exception{

   public ExecoesPilha(){
      super();
   }
   //Exeção para Vazio
   public ExecoesPilha(String msg){
      super(msg);
   }
}

