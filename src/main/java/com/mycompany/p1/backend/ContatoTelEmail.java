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
    
    protected String telefone;
    protected String celular;
    protected String email;
    
    public ContatoTelEmail(String telefone, String celular, String email) {
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public String getCelular() {
        return this.celular;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
