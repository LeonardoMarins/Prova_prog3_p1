/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

/**
 *
 * @author marin
 */
public class Enfermeiro extends AtendenteHospitalar {
    protected static Long proximoIdEnfermeiro = 0l;
    private Long idEnfermeiro;
    protected boolean treinadoOpRX;
    protected AtendenteHospitalar atendete;
    
    public Enfermeiro(boolean treinadoOpRX, AtendenteHospitalar atendente, DadoPessoal pessoal) {
        super(atendente.setor, atendente.chSemanal, pessoal);
        this.treinadoOpRX = treinadoOpRX;
        this.nomePessoal = pessoal.nomePessoal;
        this.dataNascimento = pessoal.dataNascimento;
        this.endereco = pessoal.endereco;
        this.contato = pessoal.contato;
        this.genero = pessoal.genero;
        this.idEnfermeiro = proximoIdEnfermeiro++;
    }
    
     /**
     * @return the idEnfermeiro
     */
    public Long getIdEnfermeiro() {
        return idEnfermeiro;
    }

    /**
     * @param idEnfermeiro the idEnfermeiro to set
     */
    public void setIdEnfermeiro(Long idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    /**
     * @return the treinadoOpRX
     */
    public boolean isTreinadoOpRX() {
        return treinadoOpRX;
    }

    /**
     * @param treinadoOpRX the treinadoOpRX to set
     */
    public void setTreinadoOpRX(boolean treinadoOpRX) {
        this.treinadoOpRX = treinadoOpRX;
    }

    /**
     * @return the atendete
     */
    public AtendenteHospitalar getAtendete() {
        return atendete;
    }

    /**
     * @param atendete the atendete to set
     */
       
    public void setAtendete(AtendenteHospitalar atendete) {
        this.atendete = atendete;
    }

    public void setContatoTelEmail(ContatoTelEmail contato) {
        this.contato = contato; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
