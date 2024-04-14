/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

import java.util.ArrayList;
import java.util.UUID;

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
    
     public void atualizarPaciente(Paciente pacienteAtualizado, UUID idPaciente) {
        // Encontra o paciente com base no UUID fornecido e atualiza seus dados
        for (int i = 0; i < listaDePaciente.size(); i++) {
            Paciente paciente = listaDePaciente.get(i);
            if (paciente.getIdPaciente().equals(idPaciente)) {
                listaDePaciente.set(i, pacienteAtualizado);
                break;
            }
        }
    }
    
    public void atualizarMedico(Medico medicoParaAtualizar, UUID idMedico) {
        // Encontra o paciente com base no UUID fornecido e atualiza seus dados
        for (int i = 0; i < listaDeMedicos.size(); i++) {
            Medico medico = listaDeMedicos.get(i);
            if (medico.getIdMedico().equals(idMedico)) {
                listaDeMedicos.set(i, medicoParaAtualizar);
                break;
            }
        }
    
    }
    
    public void atualizarEnfermeiro(Enfermeiro enfermeiro, int index) {
    listaDeEnfermeiros.set(index, enfermeiro);
    
    }
    
    public void atualizarConsulta(ConsultaMedica consulta, int index) {
    listaDeConsultaMedica.set(index, consulta);
    
    }
    
    public void excluirPaciente(UUID idPaciente) {
        // Encontra o paciente com base no UUID fornecido e o remove da lista
        Paciente pacienteParaExcluir = null;
        for (Paciente paciente : listaDePaciente) {
            if (paciente.getIdPaciente().equals(idPaciente)) {
                pacienteParaExcluir = paciente;
                break;
            }
        }
        if (pacienteParaExcluir != null) {
            listaDePaciente.remove(pacienteParaExcluir);
        }
    }
    
    public void excluirMedico(UUID idMedico) {
    // Encontra o paciente com base no UUID fornecido e o remove da lista
        Medico medicoParaExcluir = null;
        for (Medico medico : listaDeMedicos) {
            if (medico.getIdMedico().equals(idMedico)) {
                medicoParaExcluir = medico;
                break;
            }
        }
        if (medicoParaExcluir != null) {
            listaDeMedicos.remove(medicoParaExcluir);
        }
    
    }
    
    public void excluirEnfermeiro(int index) {
    listaDeEnfermeiros.remove(index);
    
    }
    
    public void excluirConsulta(int index) {
    listaDeConsultaMedica.remove(index);
    
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
    
    public ArrayList<ConsultaMedica> getListaConsultaMedicas() {
        return this.listaDeConsultaMedica;
    }
    
    public ArrayList<ContatoTelEmail> getListaContato() {
        return this.contatoList;
    }
    
    public ArrayList<Responsavel> getListaResponsavel() {
        return this.responsavelList;
    }
    
}
