/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thiago
 */
public enum Banco {
    
    SANTANDER("Santander"),
    BANCODOBRASIL("Banco do Brasil"),
    ITAU("Itaú"),
    BRADESCO("Bradesco");
    
    private String nome;
    
    private Banco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
    
}
