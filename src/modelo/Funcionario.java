package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
	//Sexo
	public static final String MASCULINO = "M";
	public static final String FEMININO = "F";
	
	private int codMatricula;
	private String nome;
	private String senha;
	private LocalDate dataNascimento;
	private LocalDate dataAdmissao;
	private String sexo;
	private String endereco;
	private BigDecimal salario;

	public Funcionario(int codMatricula, String nome, String senha, LocalDate dataNascimento, LocalDate dataAdmissao,
			String sexo, String endereco, BigDecimal salario) {
		this.codMatricula = codMatricula;
		this.nome = nome;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
		this.sexo = sexo;
		this.endereco = endereco;
		this.salario = salario;

	}

	public int getCodMatricula() {
		return codMatricula;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public BigDecimal getSalario() {
		return salario;
	}

}