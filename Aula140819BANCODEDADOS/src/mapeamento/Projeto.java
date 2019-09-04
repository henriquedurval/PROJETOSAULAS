package mapeamento;

import java.util.List;

public class Projeto {
	private String nome;
	private String descriao;
	private List<Funcionario> funcionarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescriao() {
		return descriao;
	}

	public void setDescriao(String descriao) {
		this.descriao = descriao;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
