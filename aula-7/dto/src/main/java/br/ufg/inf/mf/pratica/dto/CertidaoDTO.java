package br.ufg.inf.mf.pratica.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CertidaoDTO extends MainDTO {
	
	@XmlElement
	private String identificador;
	
	@XmlElement
	private int tipo;
	
	@XmlElement
	private String cartorio;
	
	@XmlElement
	private int livro;
	
	@XmlElement
	private int folha;
	
	@XmlElement
	private int termo;

	public CertidaoDTO(String identificador, int tipo, String cartorio, int livro, int folha, int termo) {
		super();
		this.identificador = identificador;
		this.tipo = tipo;
		this.cartorio = cartorio;
		this.livro = livro;
		this.folha = folha;
		this.termo = termo;
	}

	public CertidaoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public int getLivro() {
		return livro;
	}

	public void setLivro(int livro) {
		this.livro = livro;
	}

	public int getFolha() {
		return folha;
	}

	public void setFolha(int folha) {
		this.folha = folha;
	}

	public int getTermo() {
		return termo;
	}

	public void setTermo(int termo) {
		this.termo = termo;
	}
}
