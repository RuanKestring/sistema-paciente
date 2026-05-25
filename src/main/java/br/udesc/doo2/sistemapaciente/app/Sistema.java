/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.doo2.sistemapaciente.app;

import br.udesc.doo2.sistemapaciente.controlador.PacienteConsultaControlador;
import br.udesc.doo2.sistemapaciente.dao.PacienteDAO;
import br.udesc.doo2.sistemapaciente.repositorio.PacienteRepositorio;
import br.udesc.doo2.sistemapaciente.visao.PacienteConsultaVisao;

/**
 * @author 10942445970
 */
public class Sistema {
    public static void main(String[] args) {
        PacienteConsultaVisao pacienteVisao = new PacienteConsultaVisao();
        PacienteRepositorio pacienteRepositorio = new PacienteDAO();
        
        PacienteConsultaControlador pacienteControlador = new PacienteConsultaControlador(pacienteVisao, pacienteRepositorio);
        
        pacienteControlador.apresentarTela();
    }
}
