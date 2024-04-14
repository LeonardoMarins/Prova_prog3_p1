/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

/**
 *
 * @author marin
 */
public class ContatoTelEmail {
    
    protected int telefone;
    protected int celular;
    protected String email;
    
    public ContatoTelEmail(int telefone, int celular, String email) {
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        
        if (celular == 0 || telefone == 0) {
            throw new IllegalArgumentException("O celular e o telefone não pode ser nulo");
        }
    }
    
    public int getTelefone() {
        return this.telefone;
    }
    
    public int getCelular() {
        return this.celular;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
