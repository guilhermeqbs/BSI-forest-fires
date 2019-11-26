/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import java.io.FileNotFoundException;

/**
 *
 * @author Guilherme
 */
public class Prova2 {
     
    /**
     * @param args
     * @throws prova2.ExecoesPilha
     */
    
    public static void main(String[] args)throws ExecoesPilha{
        // TODO code application logic here
        
       try
        {   //Uso de auxiliares para facilitar a leitura.
            String[] aux1;
            Queimada aux2;
        
            LerArquivo arq;
            
            arq = new LerArquivo("forestfires.csv");//Abrir arquivo.
            arq.getLeitor().nextLine();
            
            
            
            CriarObjQueimadas criadorQueimadas;
            
            
            //Criar 12 pilhas
            Pilha[] p;
            p = new Pilha[12];
            
            for(int i=0; i<12; i++)
            {
                p[i] = new Pilha();
            }
            
              
            
            int j=0;
            //Percore todo o arquivo
            while(arq.tamArquivo()>j)
            {   
                //Lê todas linha 
                aux1 = arq.tratarDados();
                
                criadorQueimadas = new CriarObjQueimadas(aux1);
                
                //Converte os valores de campo da linha e cria os objetos
                aux2 = criadorQueimadas.converterValores();  
                
                //Envia o mes de cada Queimada para o Enum que retorna a posição correspondente para o vetor de pilhas.
                p[GerarPilhas.valueOf(aux2.getMonth()).getValor()].empilhar(aux2);
                
                j++;
            }
            
            //Imprimi as dozes pilhas.
            imprirPilhas(p);
            
        }catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
      
      }  
    
   public static void imprirPilhas(Pilha[] p) throws ExecoesPilha
   {
       for(int i=0; i<12; i++)
       {    
           System.out.println(" \n");
           System.out.println("Pilha do mês de " + p[i].top().getQueimada().getMonth() + ":");
           System.out.println(" \n");
           
           p[i].imprimir();
       }
   
   }
}
