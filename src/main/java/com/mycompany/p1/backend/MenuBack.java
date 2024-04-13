/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

import java.util.ArrayList;

/**
 *
 * @author marin
 */
public class MenuBack {
    
    public ArrayList<Endereco> listaEndereco = new ArrayList<>();
    public ArrayList<ContatoTelEmail> contatoList = new ArrayList<>();
    public ArrayList<Responsavel> responsavelList = new ArrayList<>();
    public ArrayList<Paciente> listaDePaciente = new ArrayList<>();
    public ArrayList<Medico> listaDeMedicos = new ArrayList<>();
    public ArrayList<Enfermeiro> listaDeEnfermeiros = new ArrayList<>();
    public ArrayList<ConsultaMedica> listaDeConsultaMedica = new ArrayList<>();
     
    public void adicionarEndereco(Endereco endereco) {
    listaEndereco.add(endereco);
    }
    
    public void adicionarContato(ContatoTelEmail contato) {
    contatoList.add(contato);
    }
    
    public void adicionarResponsavel(Responsavel responsavel) {
    responsavelList.add(responsavel);
    }
    
    public void adicionarPaciente(Paciente paciente) {
    listaDePaciente.add(paciente);
    }
    
    public void adicionarMedico(Medico medico) {
    listaDeMedicos.add(medico);
    }
    
    public void adicionarEnfermeiro(Enfermeiro enfermeiro) {
    listaDeEnfermeiros.add(enfermeiro);
    }
    
    public void adicionarConsultaMedica(ConsultaMedica consulta) {
    listaDeConsultaMedica.add(consulta);
    }
    
    public void atualizarPaciente(Paciente paciente, int index) {
    listaDePaciente.set(index, paciente);
    
    }
    
    public void atualizarMedico(Medico medico, int index) {
    listaDeMedicos.set(index, medico);
    
    }
    
    public void atualizarEnfermeiro(Enfermeiro enfermeiro, int index) {
    listaDeEnfermeiros.set(index, enfermeiro);
    
    }
    
    public void excluirPaciente(int index) {
    listaDePaciente.remove(index);
    
    }
    
    public void excluirMedico(int index) {
    listaDeMedicos.remove(index);
    
    }
    
    public void excluirEnfermeiro(int index) {
    listaDeEnfermeiros.remove(index);
    
    }
    
    public ArrayList<Endereco> getLista() {
        return this.listaEndereco;
    }
    
    public ArrayList<Paciente> getListaPaciente() {
        return this.listaDePaciente;
    }
    
    public ArrayList<Medico> getListaMedicos() {
        return this.listaDeMedicos;
    }
    
    public ArrayList<Enfermeiro> getListaEnfermeiro() {
        return this.listaDeEnfermeiros;
    }
    
    public ArrayList<ContatoTelEmail> getListaContato() {
        return this.contatoList;
    }
    
    public ArrayList<Responsavel> getListaResponsavel() {
        return this.responsavelList;
    }
    
}
