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
public class CriarObjQueimadas{
    
    private String[] dados;

    public CriarObjQueimadas(String[] dados) {
        
        this.dados = dados;
    }
    //Converte os valores de campo da linha.
    public Queimada converterValores()
    {   
        //X
        int i1 = Integer.valueOf(dados[0]);
        
        //Y
        int i2 = Integer.valueOf(dados[1]);
        
        //String month dados[2]
        
        //String day dados[3]
        
        //Double FFMC
        double d1 = Double.valueOf(dados[4]);
        
        //Double DMC
        double d2 = Double.valueOf(dados[5]);
        
        //Double DC
        double d3 = Double.valueOf(dados[6]);
        
        //Double ISI
        double d4 = Double.valueOf(dados[7]);
        
        //Double temp
        double d5 = Double.valueOf(dados[8]);
        
        //int RH
        int i3 = Integer.valueOf(dados[9]);
        
        //Double wind
        double d6 = Double.valueOf(dados[10]);
        
        //Double  rain
        double d7 = Double.valueOf(dados[11]);
        
        //Double area
        double d8 = Double.valueOf(dados[12]);
        
        //Intanciar Queimadas
        return instaciarQueimadas(i1,i2,dados[2],dados[3],d1,d2,d3,d4,d5,i3,d6,d7,d8);
        
    }
    
    //Descobrir o valor de X para criar o objeto queimada especifíco.
    public Queimada instaciarQueimadas(int X, int Y, String month, String day, Double FFMC, Double DMC, Double DC, Double ISI, Double temp, int RH, Double wind, Double rain, Double area)
    {   
        Queimada queimadaX = null;
         
        if(X>=1 && X<=3)
        {
            queimadaX = new QueimadaX1a3(X, Y, month, day, FFMC, DMC, DC, ISI, temp, RH, wind, rain, area);
        }
        else if(X>=4 && X<=6)
        {
            queimadaX = new QueimadaX4a6(X, Y, month, day, FFMC, DMC, DC, ISI, temp, RH, wind, rain, area);
        }
        else if(X>=7 && X<=9)
        {
            queimadaX = new QueimadaX7a9(X, Y, month, day, FFMC, DMC, DC, ISI, temp, RH, wind, rain, area);
        }
        else{}
        
        return queimadaX;
          
    }

    public String[] getDados() {
        return dados;
    }

    public void setDados(String[] dados) {
        this.dados = dados;
    }
    
    
}
