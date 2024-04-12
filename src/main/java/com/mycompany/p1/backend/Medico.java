/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

import java.util.Date;

/**
 *
 * @author marin
 */
public class Medico extends AtendenteHospitalar {

   protected static Long idMedico = 0l;
   protected int numeroCRM;
   protected String areasEspecialidade;
   protected boolean cirurgiao;
   protected AtendenteHospitalar atendente;
   
   public Medico(String nomePessoal,Date dataNascimento, Endereco endereco, 
           ContatoTelEmail contato, Genero genero, int numeroCRM, 
           String areaEspciealidade, boolean cirurgiao, AtendenteHospitalar atendente) {
       super(atendente.setor, atendente.chSemanal);
       this.nomePessoal = nomePessoal;
       this.dataNascimento = dataNascimento;
       this.endereco = endereco;
       this.contato = contato;
       this.genero = genero;
       this.numeroCRM = numeroCRM;
       this.areasEspecialidade = areaEspciealidade;
       this.cirurgiao = cirurgiao;
       idMedico++;
   }
   
   /**
     * @return the idMedico
     */
    public Long getIdMedico() {
        return idMedico;
    }

    /**
     * @return the numeroCRM
     */
    public int getNumeroCRM() {
        return numeroCRM;
    }

    /**
     * @param numeroCRM the numeroCRM to set
     */
    public void setNumeroCRM(int numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    /**
     * @return the areasEspecialidade
     */
    public String getAreasEspecialidade() {
        return areasEspecialidade;
    }

    /**
     * @param areasEspecialidade the areasEspecialidade to set
     */
    public void setAreasEspecialidade(String areasEspecialidade) {
        this.areasEspecialidade = areasEspecialidade;
    }

    /**
     * @return the cirurgiao
     */
    public boolean isCirurgiao() {
        return cirurgiao;
    }

    /**
     * @param cirurgiao the cirurgiao to set
     */
    public void setCirurgiao(boolean cirurgiao) {
        this.cirurgiao = cirurgiao;
    }

    /**
     * @return the atendente
     */
    public AtendenteHospitalar getAtendente() {
        return atendente;
    }

    /**
     * @param atendente the atendente to set
     */
    public void setAtendente(AtendenteHospitalar atendente) {
        this.atendente = atendente;
    }
    
    public void setContatoTelEmail(ContatoTelEmail contato) {
        this.contato = contato;
    }
   
   
}
