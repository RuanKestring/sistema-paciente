package br.udesc.doo2.sistemapaciente.dao;

import br.udesc.doo2.sistemapaciente.modelo.Paciente;
import br.udesc.doo2.sistemapaciente.repositorio.PacienteRepositorio;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 10942445970
 */
public class PacienteDAO implements PacienteRepositorio {
    
    private List<Paciente> pacientes = new ArrayList<>();

    @Override
    public void salvarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    
    @Override
    public List<Paciente> recuperarPacientes() {
        return pacientes;
    }

}
