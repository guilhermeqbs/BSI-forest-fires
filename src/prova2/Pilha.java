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
public class Pilha implements PilhaTAD{
  
    private No top;

    @Override
    public void empilhar(Queimada quei) {
        No novo = new No();
        novo.setQueimada(quei);
        novo.setProx(top);
        top = novo;
    }

    @Override
    public void desempilhar() throws ExecoesPilha {
        if (!vazio()) {
            top = top.getProx();
        } else {
            throw new ExecoesPilha("Pilha Vazia !!!");
        }
    }

    @Override
    public boolean vazio() {
        return top == null;
    }

    @Override
    public int size() {
        No p;
        p = top;
        int cont = 0;        

            while (p != null) {
                p = p.getProx();
                cont++;
            }

        return cont;
    }

    @Override
    public No top() throws ExecoesPilha {
        if (vazio()) {
            throw new ExecoesPilha("Pilha Vazia !!!");
        } else {
            return top;
        }
    }

    @Override
    public void imprimir() throws ExecoesPilha{

        if (!vazio()) {
            
            No p;
            p = top;
            
            while (p != null) {
              
                System.out.println("X = " + p.getQueimada().getX()
                                  + " Y = " +p.getQueimada().getY()
                                  + " Month = "+p.getQueimada().getMonth()
                                  + " Day = "+p.getQueimada().getDay()
                                  + " FFMC = "+p.getQueimada().getFFMC()
                                  + " DMC = "+p.getQueimada().getDMC()
                                  + " DC = "+p.getQueimada().getDC()
                                  + " ISI = "+p.getQueimada().getISI()
                                  + " Temp = "+p.getQueimada().getTemp()
                                  + " RH = "+p.getQueimada().getRH()
                                  + " Wind = "+p.getQueimada().getWind()
                                  + " Rain = "+p.getQueimada().getRain()
                                  + " Area = "+p.getQueimada().getArea()
                ); 
                p = p.getProx(); 
            }
        } 
        else {
            throw new ExecoesPilha("Pilha Vazia !!!");
        }
    }
}

