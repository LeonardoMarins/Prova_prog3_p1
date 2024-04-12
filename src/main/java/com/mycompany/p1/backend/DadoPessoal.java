/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

import com.mycompany.p1.backend.Endereco;
import com.mycompany.p1.backend.Genero;
import java.util.Date;

/**
 *
 * @author marin
 */
public class DadoPessoal {
    protected String nomePessoal;
    protected Date dataNascimento;
    protected Endereco endereco;
    protected ContatoTelEmail contato;
    protected Genero genero;

    /**
     * @return the nomePessoal
     */
    public String getNomePessoal() {
        return nomePessoal;
    }

    /**
     * @param nomePessoal the nomePessoal to set
     */
    public void setNomePessoal(String nomePessoal) {
        this.nomePessoal = nomePessoal;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contato
     */
    public ContatoTelEmail getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(ContatoTelEmail contato) {
        this.contato = contato;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
}
