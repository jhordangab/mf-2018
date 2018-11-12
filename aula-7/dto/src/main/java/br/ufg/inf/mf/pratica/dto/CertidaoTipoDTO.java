package br.ufg.inf.mf.pratica.dto;

public class CertidaoTipoDTO {

	private int codigo;
	
	private String descricao;

	public CertidaoTipoDTO(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
