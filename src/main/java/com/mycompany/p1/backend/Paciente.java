/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

import com.mycompany.p1.backend.Responsavel;
import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marin
 */
public class Paciente extends DadoPessoal {
    private static Long idPaciente = 0l;
    private int idade;
    private Date dataCadastro = new Date(); 
    private String obsGeral;
    private ConsultaMedica historicoConsultaMedica;
    private Responsavel contatoResponsavel;
    
    public Paciente(String nome, ContatoTelEmail contato, Genero genero, Date dataDeNascimento,
            Endereco endereco, int idade, Date dataCadastro, Responsavel responsavel, String obsGeral) {
         
        this.nomePessoal = nome;
        this.dataNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.genero = genero;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
        this.contatoResponsavel = responsavel;
        this.obsGeral = obsGeral;
        Paciente.idPaciente++;
    }

    /**
     * @return the idPaciente
     */
    public Long getIdPaciente() {
        return Paciente.idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(Long idPaciente) {
        Paciente.idPaciente = idPaciente;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the obsGeral
     */
    public String getObsGeral() {
        return obsGeral;
    }

    /**
     * @param obsGeral the obsGeral to set
     */
    public void setObsGeral(String obsGeral) {
        this.obsGeral = obsGeral;
    }

    /**
     * @return the historicoConsultaMedica
     */
    public ConsultaMedica getHistoricoConsultaMedica() {
        return historicoConsultaMedica;
    }

    /**
     * @param historicoConsultaMedica the historicoConsultaMedica to set
     */
    public void setHistoricoConsultaMedica(ConsultaMedica historicoConsultaMedica) {
        this.historicoConsultaMedica = historicoConsultaMedica;
    }

    /**
     * @return the contatoResponsavel
     */
    public Responsavel getContatoResponsavel() {
        return contatoResponsavel;
    }

    /**
     * @param contatoResponsavel the contatoResponsavel to set
     */
    public void setContatoResponsavel(Responsavel contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }


    public void setContatoTelEmail(ContatoTelEmail contato) {
        this.contato = contato;
    }
    
}
