package br.udesc.doo2.sistemapaciente.controlador;

import br.udesc.doo2.sistemapaciente.excecoes.PacienteException;
import br.udesc.doo2.sistemapaciente.modelo.Paciente;
import br.udesc.doo2.sistemapaciente.repositorio.PacienteRepositorio;
import br.udesc.doo2.sistemapaciente.visao.PacienteManutencaoVisao;

/**
 * @author 10942445970
 */
public class PacienteManutencaoControlador {
    
    private PacienteManutencaoVisao pacienteVisao;
    private Paciente pacienteModelo;
    private PacienteRepositorio pacienteRepositorio;
    private Runnable acaoVoltar;
    
    public PacienteManutencaoControlador(PacienteManutencaoVisao pacienteVisao, PacienteRepositorio pacienteRepositorio, Runnable acaoVoltar) {
        this.pacienteVisao = pacienteVisao;
        this.pacienteRepositorio = pacienteRepositorio;
        this.acaoVoltar = acaoVoltar;
        
        adicionarAcoes();
    }
    
    private void adicionarAcoes() {
        pacienteVisao.adicionarAcaoBtnSalvar(e -> cadastrarPaciente());
        pacienteVisao.adicionarAcaoBtnVoltar(e -> voltar());
    }
    
    public void apresentarTela() {
        pacienteVisao.apresentar();
    }
    
//    Processos
    public void cadastrarPaciente() {
        try {
            String nomePaciente = pacienteVisao.getNomePaciente();
            pacienteModelo = new Paciente(nomePaciente);
            pacienteRepositorio.salvarPaciente(pacienteModelo);
            pacienteVisao.exibirMensagem("Paciente " + pacienteModelo.getNome() + " cadastrado com sucesso!");
            pacienteVisao.limparTela();
        } catch (PacienteException ex) {
            String mensagem = ex.getMessage();
            pacienteVisao.exibirMensagem("Não foi possível cadastrar paciente: " + mensagem);
        }
    }
    
    public void voltar() {
        pacienteVisao.esconder();
        
        if(acaoVoltar != null) {
            acaoVoltar.run();
        }
    }
}
