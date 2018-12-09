package br.ufg.inf.mf.pratica.dto;

public class Instancia {

	public AreaGeograficaDTO areaGeografica()
	{
		return new AreaGeograficaDTO(231, "Aberto", "Área geográfica estática");
	}
	
	public CertidaoDTO certidao()
	{
		return new CertidaoDTO("KL843", 1, "Hermógenes Prado", 22, 330, 2);
	}
	
	public CertidaoTipoDTO certidaoTipo()
	{
		return new CertidaoTipoDTO(2, "Em aberto");
	}
	
	public ComunicacaoDTO comunicacao()
	{
		return new ComunicacaoDTO("Andrea Maria", 1, "Celular", "Horários comerciais", 1);
	}
	
	public ComunicacaoMeioDTO comunicacaoMeio()
	{
		return new ComunicacaoMeioDTO(90, "Está sem referência", "Sim");
	}
	
	public ComunicacaoPreferenciaDTO comunicacaoPreferencia()
	{
		return new ComunicacaoPreferenciaDTO(239, "Preferência pelo período noturno");
	}
	
	public ComunicacaoUsoDTO comunicacaoUso()
	{
		return new ComunicacaoUsoDTO(310, "Frequente", "Sim");
	}
	
	public CtpsDTO ctps()
	{
		return new CtpsDTO("OA909", 8932, "AC");
	}
	
	public DadoDemograficoDTO dadoDemografico()
	{
		return new DadoDemograficoDTO("Jean Rodrigues", null, "", "", 0, 1, null, "", 0, 1,
			"Leidimar Santos", "Leonaldo Oliveira", 1, 3, "", 82, 764, "MA", 19, null);
	}
	
	public DataSeguimentoDTO dataSeguimento()
	{
		return new DataSeguimentoDTO(20, "Seguimento de entrada");
	}
	
	public EnderecoDTO endereco()
	{
		return new EnderecoDTO("EN994", "Sandra Ribeira", "Maranua", "Cale", 299, "CE",
			"39019332", "CE1929", 82, 2, null, null, null, null);
	}
	
	public EnderecoLinhaDTO enderecoLinha()
	{
		return new EnderecoLinhaDTO("Rua das Aves, Q12, LT9", "Palmeiras", 29);
	}
	
	public EnderecoTipoDTO enderecoTipo()
	{
		return new EnderecoTipoDTO(1, "Endereço Comercial");
	}
	
	public EstadoDTO estado()
	{
		return new EstadoDTO("GO", "Goiás");
	}
	
	public IdentificadorDTO identificador()
	{
		return new IdentificadorDTO("ID91220", "Leandro Albuquerque Alves", "", 39, "SSP", null,
			"CAI");
	}
	
	public IdentificadorTipoDTO identificadorTipo()
	{
		return new IdentificadorTipoDTO(29, "Cadastro de contribuintes");
	}	
	
	public IndividuoDTO individuo()
	{
		return new IndividuoDTO(39012);
	}
	
	public MunicipioDTO municipio()
	{
		return new MunicipioDTO("82", "PA", "Parauapébas");
	}
	
	public NacionalidadeDTO nacionalidade()
	{
		return new NacionalidadeDTO(89, "Argentino");
	}
	
	public NascimentoOrdemDTO nascimentoOrdem()
	{
		return new NascimentoOrdemDTO(23, "Segundo");
	}
	
	public NascimentoPluralidadeDTO nascimentoPluralidade()
	{
		return new NascimentoPluralidadeDTO(9229, "");
	}
	
	public NomeDTO nome()
	{
		return new NomeDTO("LAAL920", "Anna Evelyn", "", "Caetano", "Moura", "", 1, 0);
	}
	
	public NomePreferidoDTO nomePreferido()
	{
		return new NomePreferidoDTO(8298, "Paulo Gustavo");
	}
	
	public NomeUsoDTO nomeUso()
	{
		return new NomeUsoDTO(2, "Carlos Alberto", "0");
	}
	
	public ObitoFonteDTO obitoFonte()
	{
		return new ObitoFonteDTO(1, "IML");
	}
	
	public PaisDTO pais()
	{
		return new PaisDTO(23, "Uruguai");
	}
	
	public RacaDTO raca()
	{
		return new RacaDTO(2, "Parda");
	}
	
	public RelacionamentoTipoDTO relacionamentoTipo()
	{
		return new RelacionamentoTipoDTO(93, "Solteiro");
	}
	
	public RepresentacaoDTO representacao()
	{
		return new RepresentacaoDTO("SO91", "Status", "Aberto");
	}
	
	public SexoDTO sexo()
	{
		return new SexoDTO(1, "Masculino", "");
	}
	
	public SituacaoFamiliarDTO situacaoFamiliar()
	{
		return new SituacaoFamiliarDTO(120, "Não possui");
	}
	
	public TituloEleitoralDTO tituloEleitoral()
	{
		return new TituloEleitoralDTO("AO923", 812, 85);
	}
	
	public UsoCondicionalDTO usoCondicional()
	{
		return new UsoCondicionalDTO(1128, "Escolha do Indivído");
	}
	
	public UtilizacaoDTO utilizacao()
	{
		return new UtilizacaoDTO("Amanda Ribeiro", 0, "TA182", null, null);
	}
	
	public VinculoDTO vinculo()
	{
		return new VinculoDTO("CO812", "Pedro Paulo", 1, null, null);
	}
}
