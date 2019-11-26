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
public class No {

private Queimada quei;
private No prox;


    public No(Queimada quei, No prox){
        this.quei = quei;
        this.prox = prox;
    }

    public No(){}

    public Queimada getQueimada() {
        return this.quei;
    }

    public void setQueimada(Queimada quei) {
        this.quei = quei;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
