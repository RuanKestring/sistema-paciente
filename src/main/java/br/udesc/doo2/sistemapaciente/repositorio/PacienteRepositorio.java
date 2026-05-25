/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.udesc.doo2.sistemapaciente.repositorio;

import br.udesc.doo2.sistemapaciente.modelo.Paciente;
import java.util.List;

/**
 * @author 10942445970
 */
public interface PacienteRepositorio {
   
    void salvarPaciente(Paciente paciente);
    
    List<Paciente> recuperarPacientes();
    
}
