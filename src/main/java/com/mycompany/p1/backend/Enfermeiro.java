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
    protected Long idEnfermeiro;
    protected boolean treinadoOpRX;
    protected AtendenteHospitalar atendete;
    
    public Enfermeiro(boolean treinadoOpRX, AtendenteHospitalar atendente) {
        super(atendente.setor, atendente.chSemanal);
        this.treinadoOpRX = treinadoOpRX;
    }
}
