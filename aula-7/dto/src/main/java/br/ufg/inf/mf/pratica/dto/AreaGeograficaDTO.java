package br.ufg.inf.mf.pratica.dto;

public class AreaGeograficaDTO {

	private int codigo;
	
	private String alternativo;
	
	private String descricao;

	public AreaGeograficaDTO(int codigo, String alternativo, String descricao) {
		super();
		this.codigo = codigo;
		this.alternativo = alternativo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
