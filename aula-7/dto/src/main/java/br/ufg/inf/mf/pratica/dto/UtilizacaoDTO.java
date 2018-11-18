package br.ufg.inf.mf.pratica.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UtilizacaoDTO extends MainDTO {

	@XmlElement
	private String nome;
	
	@XmlElement
	private int uso;
	
	@XmlElement
	private String identificador;
	
	@XmlElement
	private Date dataInicial;
	
	@XmlElement
	private Date dataFinal;

	public UtilizacaoDTO(String nome, int uso, String identificador, Date dataInicial, Date dataFinal) {
		super();
		this.nome = nome;
		this.uso = uso;
		this.identificador = identificador;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public UtilizacaoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getUso() {
		return uso;
	}

	public void setUso(int uso) {
		this.uso = uso;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
}