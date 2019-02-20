package br.com.devmedia.curso.domain;

public class Usuario {
	private long id;
	private String nome;
	private String sobrenome;
	
	public Usuario() {
		super();
	}

	public Usuario(long id, String nome, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
	
	

}
