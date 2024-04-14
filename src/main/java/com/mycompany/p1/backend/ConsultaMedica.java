/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1.backend;

/**
 *
 * @author marin
 */
public class ConsultaMedica {
    protected static Long idConsulta = 0l;
    protected Long idPaciente; 
    protected Long idMedico;
    protected String exameQueixa;
    protected String diagnostico;
    protected String prescricao;
    protected boolean indicacaoCirurgica;
    
    public ConsultaMedica(Paciente paciente, Medico medico, String exame,
            String diagnostico, String prescricao, boolean indicacaoCirurgica) {
        this.idPaciente = paciente.getIdPaciente();
        this.idMedico = medico.getIdMedico();
        this.exameQueixa = exame;
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.indicacaoCirurgica = indicacaoCirurgica;
        idConsulta++;
        
        if (exame == null || exame.isEmpty()) {
            throw new IllegalArgumentException("A queixa do paciente não pode ficar vazia");
        }
    }
    /**
     * @return the idConsulta
     */
    public Long getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param aIdConsulta the idConsulta to set
     */
    public void setIdConsulta(Long aIdConsulta) {
        idConsulta = aIdConsulta;
    }

    /**
     * @return the idPaciente
     */
    public Long getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the idMedico
     */
    public Long getIdMedico() {
        return idMedico;
    }

    /**
     * @param idMedico the idMedico to set
     */
    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    /**
     * @return the exameQueixa
     */
    public String getExameQueixa() {
        return exameQueixa;
    }

    /**
     * @param exameQueixa the exameQueixa to set
     */
    public void setExameQueixa(String exameQueixa) {
        this.exameQueixa = exameQueixa;
    }

    /**
     * @return the diagnostico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the prescricao
     */
    public String getPrescricao() {
        return prescricao;
    }

    /**
     * @param prescricao the prescricao to set
     */
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    /**
     * @return the indicacaoCirurgica
     */
    public boolean isIndicacaoCirurgica() {
        return indicacaoCirurgica;
    }

    /**
     * @param indicacaoCirurgica the indicacaoCirurgica to set
     */
    public void setIndicacaoCirurgica(boolean indicacaoCirurgica) {
        this.indicacaoCirurgica = indicacaoCirurgica;
    }
}
