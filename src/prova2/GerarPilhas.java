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
public enum GerarPilhas {
    jan(0), feb(1), mar(2), apr(3), may(4), jun(5), jul(6), aug(7), sep(8), oct(9), nov(10), dec(11);
    
    int valor;

    GerarPilhas(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
     
}
