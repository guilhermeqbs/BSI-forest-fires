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
public interface PilhaTAD {
    
    public void empilhar(Queimada quei)throws ExecoesPilha;

    public void desempilhar()throws ExecoesPilha;

    public boolean vazio();

    public int size();

    public No top()throws ExecoesPilha;
    
    public void imprimir()throws ExecoesPilha;
}
