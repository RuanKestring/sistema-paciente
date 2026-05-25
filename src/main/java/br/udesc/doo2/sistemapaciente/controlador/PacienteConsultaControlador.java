package br.udesc.doo2.sistemapaciente.controlador;

import br.udesc.doo2.sistemapaciente.modelo.Paciente;
import br.udesc.doo2.sistemapaciente.repositorio.PacienteRepositorio;
import br.udesc.doo2.sistemapaciente.visao.PacienteConsultaVisao;
import br.udesc.doo2.sistemapaciente.visao.PacienteManutencaoVisao;

/**
 * @author ruanc
 */
public class PacienteConsultaControlador {
    
    private PacienteConsultaVisao pacienteVisao;
    private Paciente pacienteModelo;
    private PacienteRepositorio pacienteRepositorio;
    
    public PacienteConsultaControlador(PacienteConsultaVisao pacienteVisao, PacienteRepositorio pacienteRepositorio) {
        this.pacienteVisao = pacienteVisao;
        this.pacienteRepositorio = pacienteRepositorio;
        adicionarAcoes();
    }
    
    private void adicionarAcoes() {
        pacienteVisao.adicionarAcaoBtnCadastrar(e -> cadastrarPaciente());
        pacienteVisao.adicionarAcaoBtnAlterar(e -> alterarPaciente());
        pacienteVisao.adicionarAcaoBtnExcluir(e -> excluirPaciente());
    }
    
    public void apresentarTela() {
        pacienteVisao.apresentar();
    }
    
//    Processos
    public void apresentarPacientes() {
        
    }
    
    public void excluirPaciente() {
        
    }
    
    public void alterarPaciente() {
        
    }
    
    public void cadastrarPaciente() {
        PacienteManutencaoVisao pacienteManutencaoVisao = new PacienteManutencaoVisao();
        
        PacienteManutencaoControlador pacienteControlador = new PacienteManutencaoControlador(pacienteManutencaoVisao, pacienteRepositorio, this::apresentarTela);
        
        pacienteControlador.apresentarTela();
        this.pacienteVisao.esconder();
    }
    
}
