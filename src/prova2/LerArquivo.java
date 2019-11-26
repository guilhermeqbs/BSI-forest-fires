/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
 
//Leitura do arquivo.
public class LerArquivo {
    
    private File arquivoCSV;
    private Scanner leitor;
    
    public LerArquivo(String adress) throws FileNotFoundException {
        this.arquivoCSV = new File(adress);
        this.leitor = new Scanner(arquivoCSV);//cria um scanner para ler o arquivo.
    }
    
    //Quebra cada linha do arquivo e separa cada campo da linha.
    public String[] tratarDados()
    {   
        //variavel que armazenara as linhas do arquivo.
        String linhasDoArquivo = new String();
               
        //recebe cada linha do arquivo.
        linhasDoArquivo = leitor.nextLine();
                
        //separa os campos entre as virgulas de cada linha.
        String[] campoEntreVirgulas = linhasDoArquivo.split(",");
            
        return campoEntreVirgulas;
          
               
    }
    
    public int tamArquivo() throws FileNotFoundException
    {   
        int tam = 0;
        
        //cria um scanner para ler o arquivo
        Scanner contador = new Scanner(arquivoCSV);
        
        //ignora a primeira linha do arquivo
        contador.nextLine();
            
        //percorre todo o arquivo
        while(contador.hasNext()){
            contador.nextLine();
            tam++;
        }
        
        return  tam;
    }
    public File getArquivoCSV() {
        return arquivoCSV;
    }

    public void setArquivoCSV(File arquivoCSV) {
        this.arquivoCSV = arquivoCSV;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }
    
    
}
