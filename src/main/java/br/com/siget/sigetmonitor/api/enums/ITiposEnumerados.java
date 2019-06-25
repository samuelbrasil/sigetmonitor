package br.com.siget.sigetmonitor.api.enums;

import java.io.Serializable;
import java.util.EnumSet;

/**
 * 
 * <br>
 * 
 * @author hemaxol <br>
 */
public interface ITiposEnumerados extends Serializable {

    /**
     * Tipificar a origem de uma ação de log.
     * 
     * <br>
     * 
     * @author hemaxol <br>
     */
    public enum RAC_ORIGEM_ACAO implements Serializable {
	/**
	 * Gerando no servidor, sem relãção com contribuinte ou auditor.
	 */
	SERVIDOR,
	/**
	 * gerado na aplicação por ação do contribuinte ou auditor.
	 */
	APLICACAO;
    }

    /**
     * Tipos de mensagens de log
     * 
     * <br>
     * 
     * @author hemaxol <br>
     */
    public enum TIPO_LOG implements Serializable {
	/**
	 * 0=Erro
	 */
	ERRO,
	/**
	 * 1=Aviso
	 */
	AVISO,
	/**
	 * 2 = Informação
	 */
	INFORMACAO;
    }

    /**
     * Acesso Biom�trico
     * 
     * <br>
     * 
     * @author vcsalmeron <br>
     */
    public enum ACESSO_BIOMETRICO implements Serializable {
	/**
	 * 0=N�o
	 */
	NAO,
	/**
	 * 1=Sim
	 */
	SIM;
    }

    /**
     * Certificado Digital
     * 
     * <br>
     * 
     * @author vcsalmeron <br>
     */
    public enum CERTIFICADO_DIGITAL implements Serializable {
	/**
	 * 0=N�o
	 */
	NAO,
	/**
	 * 1=Sim
	 */
	SIM;
    }

    /**
     * Situa��o Ativa/Inativa
     * 
     * <br>
     * 
     * @author hemaxol <br>
     */
    public enum SITUACAO implements Serializable {
	/**
	 * 0=Inativo
	 */
	INATIVO,
	/**
	 * 1=Ativo
	 */
	ATIVO;
    }

    /**
     * Situa��o Principal/ou não * <br>
     * 
     * @author hemaxol <br>
     */
    public enum PRINCIPAL implements Serializable {
	/**
	 * 0=SIM
	 */
	SIM,
	/**
	 * 1=NAO
	 */
	NAO;
    }

    /**
     * Situação do Macrosseguimento * <br>
     * 
     * @author Vinicius Salmeron <br>
     */
    public enum MACROSSEGUIMENTO implements Serializable {
	/**
	 * 0=NAO
	 */
	NAO,
	/**
	 * 1=SIM
	 */
	SIM;
    }

    /**
     * Tipo de emiss�o da empresa
     * 
     * <br>
     * 
     * @author hemaxol <br>
     */
    public enum TIPO_EMISSOR_EMPRESA implements Serializable {
	/**
	 * 0=N�o definido
	 */
	SEM_USO;
    }

    /**
     * Identificar o emissor da mensagem.
     * 
     * <br>
     * 
     * @author hemaxol <br>
     */
    public enum ORIGEM_MSG_INTERLOCUTOR implements Serializable {
	/**
	 * 0=Contribuinte
	 */
	CONTRIBUINTE,
	/**
	 * 1=Gestor
	 */
	GESTOR;
    }

    /**
     * Defini o tipo de filtro para pesquisa
     * 
     * <br>
     * 
     * @author hemaxol <br>
     */
    public enum FILTRO_PESQUISA implements Serializable {
	/**
	 * C.N.P.J.
	 */
	CNPJ,
	/**
	 * Inscrição Estadual
	 */
	IE,
	/**
	 * CNAE
	 */
	CNAE,
	/**
	 * Razão Social
	 */
	RAZAO_SOCIAL,
	/**
	 * Per�odo com data inicial e final
	 */
	PERIODO;
    }

    /**
     * Tipo de Menu
     * 
     * <br>
     * 
     * @author kalcazar <br>
     */
    public enum TIPO_MENU implements Serializable {
	/**
	 * 1 = Aba
	 */
	ABA,
	/**
	 * 2 = Operacao
	 */
	OPERACAO,
	/**
	 * 3= Relatório
	 */
	RELATORIO,
	/**
	 * 4= Menu
	 */
	MENU;
    }

    /**
     * Dominio
     * 
     * <br>
     * 
     * @author kalcazar <br>
     */
    public enum DOMINIO implements Serializable {
	/**
	 * 1 = XML
	 */
	XML,
	/**
	 * 0 = Binario
	 */
	BINARIO;
    }

    /**
     * Modalidade
     * 
     * <br>
     * 
     * @author kalcazar <br>
     */
    public enum MODALIDADE implements Serializable {
	/**
	 * 0 = Saida
	 */
	SAIDA,
	/**
	 * 1 = ENTRADA
	 */
	ENTRADA;
    }

    /**
     * Grupo CFOP
     * 
     * <br>
     * 
     * @author kalcazar <br>
     */
    public enum GRUPO_CFOP implements Serializable {
	/**
	 * 1 = Dentro do Estado
	 */
	DENTRO_ESTADO,
	/**
	 * 2 = Fora do Estado
	 */
	FORA_ESTADO,
	/**
	 * 3 = Fora do Pais;
	 */
	FORA_PAIS;
    }

    /**
     * Modalidade
     * 
     * <br>
     * 
     * @author kalcazar <br>
     */
    public enum MOVIMENTO implements Serializable {
	/**
	 * 0 = Saida
	 */
	SAIDA,
	/**
	 * 1 = Entrada
	 */
	ENTRADA,
	/**
	 * 2 = Saldos
	 */
	SALDOS;
    }

    /**
     * Tipo do Código da receita: 1 = ICMS, 2 = IPVA, 3 = ITCD, 4 = ENCARGO, 5 = RESTITUICAO, 6 = RESSARCIMENTO, 7 =
     * CONTRIBUICAO, 8 = TAXA, 9 = MULTA e 99 = OUTRA
     * 
     * @author Mateus Carmo
     */
    public enum TIPO_RECEITA implements Serializable {
	/**
	 * 1 = ICMS
	 */
	ICMS(1),
	/**
	 * 2 = IPVA
	 */
	IPVA(2),
	/**
	 * 3 = ITCD
	 */
	ITCD(3),
	/**
	 * 4 = ENCARGO
	 */
	ENCARGO(4),
	/**
	 * 5 = RESTITUICAO
	 */
	RESTITUICAO(5),
	/**
	 * 6 = RESSARCIMENTO
	 */
	RESSARCIMENTO(6),
	/**
	 * 7 = CONTRIBUICAO
	 */
	CONTRIBUICAO(7),
	/**
	 * 8 = TAXA
	 */
	TAXA(8),
	/**
	 * 9 = MULTA
	 */
	MULTA(9),
	/**
	 * 99 = Outra
	 */
	OUTRA(99);

	/**
	 * Construtor
	 * 
	 * @param valor
	 *            - int valor numérico do código
	 */
	private TIPO_RECEITA(int valor) {
	    valorIcTipoReceita = valor;
	}

	/**
	 * Encontra o enum a partir do valor numérico do mesmo
	 * 
	 * @param valor
	 *            - int valor cujo enum deve ser encontrado
	 * 
	 * @return Enum com o valor recebido ou null
	 */
	public static TIPO_RECEITA getValue(int valor) {
	    for (TIPO_RECEITA ic : TIPO_RECEITA.values()) {
		if (ic.valorIcTipoReceita == valor)
		    return ic;
	    }
	    return null;
	}

	/**
	 * Encontra o enum a partir do nome do mesmo
	 * 
	 * @param valor
	 *            - String valor cujo enum deve ser encontrado
	 * 
	 * @return Enum com o nome recebido ou null
	 */
	public static TIPO_RECEITA getValue(String valor) {
	    for (TIPO_RECEITA ic : TIPO_RECEITA.values()) {
		if (ic.name().equals(valor))
		    return ic;
	    }
	    return null;
	}

	/**
	 * Get do valor numérico
	 * 
	 * @return int - valor numérico do enum
	 */
	public int getValue() {
	    return valorIcTipoReceita;
	}

	private int valorIcTipoReceita;
    }

    public enum MOVIMENTO_FINANCEIRO implements Serializable {
	/**
	 * 0 = Crédito
	 */
	CREDITO,
	/**
	 * 1 = Débito
	 */
	DEBITO,
    }

    public enum ENVIA_CE implements Serializable {
	/**
	 * 0 = Não
	 */
	NAO,
	/**
	 * 1 = Sim
	 */
	SIM,
    }

    public enum REFERENCIA implements Serializable {
	/**
	 * 0 = Cadastral
	 */
	CADASTRAL,
	/**
	 * 1 = Nf-e
	 */
	NFE,
	/**
	 * 2 = Sped Fiscal
	 */
	SPED_FISCAL,
	/**
	 * 3 = Apuração
	 */
	APURACAO,
	/**
	 * 4 = Obrigação Acessória
	 */
	OBRIGACAO_ACESSORIA,
	/**
	 * 5 = Obrigação Principal
	 */
	OBRIGACAO_PRINCIPAL,
    }

    public enum AVALIACAO implements Serializable {
	/**
	 * 0 = Péssimo
	 */
	PESSIMO,
	/**
	 * 1 = Ruim
	 */
	RUIM,
	/**
	 * 2 = Adequado
	 */
	ADEQUADO,
	/**
	 * 3 = Bom
	 */
	BOM,
	/**
	 * 4 = Excelente
	 */
	EXCELENTE,
    }

    public enum TIPOS_ENUMERADOS implements Serializable {
	COFINS_CST {
	    @Override
	    public String column() {
		return "CD_CONFINS_CST";
	    }

	    @Override
	    public String table() {
		return "TB_COFINS_CST";
	    }
	},
	ORIGEM_MERCADORIA {
	    @Override
	    public String column() {
		return "CD_ORIGEM_MERCADORIA";
	    }

	    @Override
	    public String table() {
		return "TB_ORIGEM_MERCADORIA";
	    }
	},
	NF_FINALIDADE {
	    @Override
	    public String column() {
		return "CD_NF_FINALIDADE";
	    }

	    @Override
	    public String table() {
		return "TB_NF_FINALIDADE";
	    }
	},
	FORMA_PAGAMENTO {
	    @Override
	    public String column() {
		return "CD_FORMA_PAGAMENTO";
	    }

	    @Override
	    public String table() {
		return "TB_FORMA_PGTO";
	    }
	},
	MUNICIPIO_IBGE {
	    @Override
	    public String column() {
		return "CD_MUNICIPIO_IBGE";
	    }

	    @Override
	    public String table() {
		return "TB_MUNICIPIO_IBGE";
	    }
	},
	UF_IBGE {
	    @Override
	    public String column() {
		return "CD_UF_IBGE";
	    }

	    @Override
	    public String table() {
		return "TB_UF_IBGE";
	    }
	},
	REGIAO_IBGE {
	    @Override
	    public String column() {
		return "CD_REGIAO_IBGE";
	    }

	    @Override
	    public String table() {
		return "TB_REGIAO_IBGE";
	    }
	},
	TIPO_TRIBUTACAO {
	    @Override
	    public String column() {
		return "CD_TIPO_TRIBUTACAO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_TRIBUTACAO";
	    }
	},
	PIS_CST {
	    @Override
	    public String column() {
		return "CD_PIS_CST";
	    }

	    @Override
	    public String table() {
		return "TB_PIS_CST";
	    }
	},
	TIPO_ENDERECO {
	    @Override
	    public String column() {
		return "CD_TIPO_ENDERECO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_ENDERECO";
	    }
	},
	TIPO_AUT_USO {
	    @Override
	    public String column() {
		return "CD_TIPO_AUT_USO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_AUTORIZA_USO";
	    }
	},
	ISSQN_SERVICOS {
	    @Override
	    public String column() {
		return "CD_SERVICO";
	    }

	    @Override
	    public String table() {
		return "TB_ISSQN_SERVICOS";
	    }
	},
	ICMS_MODALIDADE {
	    @Override
	    public String column() {
		return "CD_MODALIDADE";
	    }

	    @Override
	    public String table() {
		return "TB_ICMS_MODALIDADE";
	    }
	},
	ICMS_MODAL_CSTST {
	    @Override
	    public String column() {
		return "CD_MOD_CSTST";
	    }

	    @Override
	    public String table() {
		return "TB_ICMS_MODAL_CSTST";
	    }
	},
	CFOP {
	    @Override
	    public String column() {
		return "CD_CFOP";
	    }

	    @Override
	    public String table() {
		return "TB_CFOP";
	    }
	},
	GRUPO_CFOP {

	    @Override
	    public String column() {
		return "CD_GRUPO_CFOP";
	    }

	    @Override
	    public String table() {
		return "TB_GRUPO_CFOP";
	    }
	},
	PAIS_BACEN {

	    @Override
	    public String column() {
		return "CD_PAIS";
	    }

	    @Override
	    public String table() {
		return "TB_PAIS_BACEN";
	    }
	},
	SITUACAO_EMPRESA {

	    @Override
	    public String column() {
		return "CD_SITUACAO";
	    }

	    @Override
	    public String table() {
		return "TB_SITUACAO_EMPRESA";
	    }
	},
	CODIGO_RECEITA {
	    @Override
	    public String column() {
		return "CD_RECEITA";
	    }

	    @Override
	    public String table() {
		return "TB_COD_RECEITA";
	    }
	},
	TIPO_APURACAO_ICMS {
	    @Override
	    public String column() {
		return "CD_TB_TIPO_ICMS_NORMAL";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_ICMS_NORMAL";
	    }
	},
	TIPO_APURACAO_OUTROS_ICMS {
	    @Override
	    public String column() {
		return "CD_TIPO_OUT_ICMS";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_AP_OUT_ICMS";
	    }
	},
	TIPO_APURACAO_OUTROS_CREDITOS_DEBITOS {
	    @Override
	    public String column() {
		return "CD_TIPO_OUT_C_D";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_AP_OUT_C_D";
	    }
	},
	TIPO_SITUACAO_DEBITO {
	    @Override
	    public String column() {
		return "ID_TIPO_SITUACAO_DEBITO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_SITUACAO_DEBITO";
	    }
	},
	TIPO_SITUACAO_RECOLHIMENTO {
	    @Override
	    public String column() {
		return "ID_TIPO_SITUACAO_RECOLHIMENTO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_SITUACAO_RECOLHIMENTO";
	    }
	},
	NIVEL_AGRUPAMENTO {
	    @Override
	    public String column() {
		return "CD_NIVEL_AGRUPAMENTO";
	    }

	    @Override
	    public String table() {
		return "TB_NIVEL_AGRUPAMENTO";
	    }
	},
	NIVEL_VISUALIZACAO {
	    @Override
	    public String column() {
		return "CD_NIVEL_VISUALIZACAO";
	    }

	    @Override
	    public String table() {
		return "TB_NIVEL_VISUALIZACAO";
	    }
	},
	SETORIAL {
	    @Override
	    public String column() {
		return "CD_SETORIAL";
	    }

	    @Override
	    public String table() {
		return "TB_SETORIAL";
	    }
	},
	TIPO_DEPARTAMENTO {
	    @Override
	    public String column() {
		return "CD_TIPO_DEPARTAMENTO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_DEPARTAMENTO";
	    }
	},
	TIPO_EMPRESA {
	    @Override
	    public String column() {
		return "CD_TIPO_EMPRESA";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_EMPRESA";
	    }
	},
	TIPO_OPERACAO_VEICULO {
	    @Override
	    public String column() {
		return "CD_TIPO_OPER_VEIC";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_OPERA_VEICULO";
	    }
	},
	ESPECIE_VEICULO {
	    @Override
	    public String column() {
		return "CD_ESPECIE_VEICULO";
	    }

	    @Override
	    public String table() {
		return "TB_ESPECIE_VEICULO";
	    }
	},
	TIPO_COMBUSTIVEL_VEICULO {
	    @Override
	    public String column() {
		return "CD_TIPO_COMBUSTIVEL";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_COMBUSTIVEL_VEICULO";
	    }
	},
	TIPO_VEICULO {
	    @Override
	    public String column() {
		return "CD_TIPO_VEICULO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_VEICULO";
	    }
	},
	TIPO_RESTRICAO_VEICULO {
	    @Override
	    public String column() {
		return "CD_RESTRICAO_VEIC";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_RESTRICAO_VEIC";
	    }
	},
	TIPO_COR {
	    @Override
	    public String column() {
		return "CD_COR";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_COR";
	    }
	},
	TIPO_INCONS_PERM {
	    @Override
	    public String column() {
		return "CD_TIPO_INCONS_PERM";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_INCONS_PERM";
	    }
	},
	TIPO_INCONS_PROVIDENCIA {
	    @Override
	    public String column() {
		return "CD_PROVIDENCIA";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_INCONS_PROVIDENCIA";
	    }
	},
	TIPO_OPERA_SN {
	    @Override
	    public String column() {
		return "CD_CSOSN";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_OPERA_SN";
	    }
	},
	MENU {
	    @Override
	    public String column() {
		return "CD_MENU";
	    }

	    @Override
	    public String table() {
		return "TB_MENU";
	    }
	},
	TIPO_CAMPOS {
	    @Override
	    public String column() {
		return "CD_REL_CAMPO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_CAMPOS";
	    }
	},
	TIPO_FILTRO_RELATORIOS {
	    @Override
	    public String column() {
		return "CD_FILTRO_RELATO";
	    }

	    @Override
	    public String table() {
		return "TB_TIPO_FILTRO_RELATO";
	    }
	},
	DEPARTAMENTO {
	    @Override
	    public String column() {
		return "CD_ID_DEPARTAMENTO";
	    }

	    @Override
	    public String table() {
		return "TB_DEPARTAMENTO";
	    }
	},
	DEPARTAMENTO_SETORIAL {
	    @Override
	    public String column() {
		return "CD_SETORIAL";
	    }

	    @Override
	    public String table() {
		return "TB_DEPART_SETORIAL";
	    }
	},
	REGIME_TRIBUTARIO {
	    @Override
	    public String column() {
		return "CD_EMP_REG_TRIB";
	    }

	    @Override
	    public String table() {
		return "TB_EMP_REG_TRIBUTARIO";
	    }
	};

	public abstract String column();

	public abstract String table();
    }

    /**
     * Tipo Situacao Regime de Recolhimento
     * 
     * @author kalcazar
     * 
     */
    enum TIPO_SITUACAO_RECOLHIMENTO implements Serializable {
	VENCER(0), PAGO_INTEGRAL(1), PAGO_MENOR(2), PAGO_MAIOR(3), VENCIDO(4), CANCELADO(5), DIVIDA_ATIVA(6);

	private int codigo;

	TIPO_SITUACAO_RECOLHIMENTO(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_OP_ACOMPANHAMENTO_MONITORAMENTO implements Serializable {
	ENVIADO_COMUNICADO_PARA_CONTRIBUINTE(1), ENVIADO_PARA_CONTRIBUINTE_MANDADO_MONITORAMENTO_FISCAL(2), ENVIADO_PAM_PARA_AGENTE_FISCAL(3), CIENTE_CONTRIBUINTE_MANDADO_MONITORAMENTO_FISCAL_PELO_AGENTE_FISCAL(4), CIENTE_CONTRIBUINTE_MANDADO_MONITORAMENTO_FISCAL_PELO_PORTAL(5), INICIO_MANDADO_MONITORAMENTO_FISCAL(6), ENVIADO_PARA_CONTRIBUINTE_TERMO_NOTIFICACAO(
		7), ENVIAR_RELATORIO_MENSAL_PARA_SUPERVISOR_ORIENTADOR(8), CONFIRMAR_DESIGNACAO_CONTRIBUINTE_PELO_AGENTE_FISCAL(9), ENVIAR_MANDADO_MONITORAMENTO_FISCAL_PARA_CONTRIBUINTE(10), RECEBIDO_COMUNICADO_CONTRIBUINTE(11), AUTORIZADA_SOLICITAÇÃO_MEDIDA_GESTAO(12), CONTRIBUINTE_PARTICIPA_PLANEJAMENTO_GERAL(13), AGENTE_FISCAL_REJEITOU_DESIGNACAO(
		14), CIENTE_CONTRIBUINTE_TERMO_NOTIFICACAO_PELO_AGENTE_FISCAL(15), CIENTE_CONTRIBUINTE_TERMO_NOTIFICACAO_PELO_PORTAL(16), CIENTE_CONTRIBUINTE_TERMO_INTIMACAO_PELO_AGENTE_FISCAL(17), CIENTE_CONTRIBUINTE_TERMO_INTIMACAO_PELO_PORTAL(18), ENVIADO_PARA_CONTRIBUINTE_TERMO_INTIMACAO(19), ENVIADO_PARA_CONTRIBUINTE_TERMO_ENCERRAMENTO(20), CIENTE_CONTRIBUINTE_TERMO_ENCERRAMENTO_PELO_PORTAL(
		24), CIENTE_CONTRIBUINTE_TERMO_ENCERRAMENTO_PELO_AGENTE_FISCAL(25), CIENTE_TERMO_ENCERRAMENTO_AUTOMATICA(32), CANCELAMENTO_TERMO_ENCERRAMENTO(26), EDITADA_CIENCIA_MANDADO_MONITORAMENTO(27), RETIRADA_CIENCIA(28), EDITADA_CIENCIA_TERMO_INTIMACAO(29), EDITADA_CIENCIA_TERMO_NOTIFICACAO(30), EDITADA_CIENCIA_TERMO_ENCERRAMENTO(31);

	private int codigo;

	TIPO_OP_ACOMPANHAMENTO_MONITORAMENTO(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_MENSAGEM_ELETRONICA implements Serializable {
	GERAL(0), MANDADO_MONITORAMENTO(1), TERMO_NOTIFICACAO(2), TERMO_INTIMACAO(3), TERMO_ENCERRAMENTO(4);

	private int codigo;

	TIPO_MENSAGEM_ELETRONICA(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum SITUACAO_EMPRESA_MONITORAMENTO implements Serializable {
	PLANEJADA((short) 1), DESIGNADA((short) 2), DEVOLVIDA((short) 3), EM_EXECUCAO((short) 4), VETADA((short) 5), ANULADA((short) 6), VENCIDA((short) 7), CONCLUIDA((short) 8), PENDENTE((short) 9), EM_ABERTO((short) 10), HOMOLOGADA((short) 11);

	private short codigo;

	SITUACAO_EMPRESA_MONITORAMENTO(short codigo) {
	    this.codigo = codigo;
	}

	public short getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_ICMS_CST implements Serializable {
	TRIBUTADA_INTEGRALMENTE(0), TRIBUTADA_COM_COBRANCA(10), COM_REDUCAO_BASE_CALCULO(20), ISENTA_NAO_TRIBUTADA(30), ISENTA(40), NAO_TRIBUTADA(41), SUSPENSAO(50), DIFERIMENTO(51), ICMS_COBRADO_ANTERIORMENTE(60), COM_REDUCAO_BASE_CALCULO_COBRANCA_ICMS(70), OUTRAS(90), OUTRAS_COM_PARTILHA_ICMS(91);

	private int codigo;

	TIPO_ICMS_CST(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_ICMS_NORMAL implements Serializable {
	DEBITOS_SAIDAS(0), DEBITOS_AJUSTE_DOCUMENTOS_FISCAIS(1), OUTROS_DEBITOS(2), ESTORNO_CREDITOS(3), TOTAL_DEBITOS(99), CREDITOS_ENTRADAS(100), CREDITOS_AJUSTES_DOCUMENTOS_FISCAIS(101), OUTROS_CREDITOS(102), ESTORNO_DEBITOS(103), SALDO_CREDOR_PERIODO_ANTERIOR(104), TOTAL_CREDITOS(999), SALDO_DEVEDOR(1000), PROVIN_FDI(1001), FECOP_ICMS_NORMAL(
		1002), INCENTIVO_FISCAL(1003), OUTROS(1004), ICMS_RECOLHER(1199), SALDO_CREDOR_PERIODO_SEGUINTE(9999);

	private int codigo;

	TIPO_ICMS_NORMAL(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_APURACAO_OUTROS_CREDITO_DEBITO implements Serializable {
	DEBITO_RESERVA_TRANSFERENCIA_CREDITO(1, "CE000001"), DEBITO_DIF_ALIQUOTA_IMOBILIZADO(2, "CE000002"), DEBITO_TRANSFERENCIA_CREDITO(3, "CE000003"), DEBITO_COMPENSACAO_DEBITO_DIVIDA_ATIVA(4, "CE000004"), DEBITO_FECOP_ICMS_NORMAL(5, "CE000005"), DEBITO_DIF_ALIQUOTA_CONSUMO(6, "CE000006"), DEBITO_FATURAMENTO_TERMO_ACORDO_3591(7, "CE000007"), DEBITOS_OUTROS(
		8, "CE000008"), ESTORNO_CREDITO_SAIDAS_ISENTAS_NAO_TRIBUTADAS(10, "CE010001"), ESTORNO_CREDITO_BEAN_ATIVO_SAIDAS_NAO_TRIBUTADAS(11, "CE010002"), ESTORNO_CREDITO_SUFRAMA(12, "CE010003"), ESTORNO_CREDITO_BENS_ATIVO_BAIXA(13, "CE010004"), ENTRADAS_ENERGIA_ELETRICA_EMPRESA_COMUNICACAO(14, "CE010005"), ESTORNO_CREDITOS_OUTROS(15,
		"CE010006"), CREDITO_PRESUMIDO(16, "CE020001"), CREDITO_ANTECIPADO(17, "CE020002"), CREDITO_DIF_ALIQUOTA(18, "CE020003"), CREDITO_TRANSF_CREDITO(19, "CE020004"), CREDITO_BENS_ATIVO_IMOBLIZADO(20, "CE020005"), CREDITO_RESTITUICAO_INDEBITO(21, "CE020006"), CREDITO_ICMS_MAIS_DUPLICIDADE(22, "CE020007"), CREDITO_ICMS_IMPORTACAO_DIFERIDO(
		23, "CE020008"), CREDITO_DECORRENTE_AUTO_INFRACAO(24, "CE020009"), CREDITO_EXTEMPORANEOS(25, "CE020010"), CREDITO_OUTROS(26, "CE020011"), ESTORNO_DEBITO_REVERSAO_RESERVA_TRANSFERENCIA(27, "CE030001"), ESTORNO_DEBITO_FATURAMENTO_ENERGIA(28, "CE030002"), ESTORNO_DEBITO_FATURAMENTO_COMUNICACAO(29, "CE030003"), ESTORNO_DEBITO_OUTROS(
		30, "CE030004");

	private Integer codigo;
	private String valorE111;

	TIPO_APURACAO_OUTROS_CREDITO_DEBITO(Integer codigo, String valorE111) {
	    this.codigo = codigo;
	    this.valorE111 = valorE111;
	}

	public Integer getCodigo() {
	    return codigo;
	}

	public String getValorE111() {
	    return valorE111;
	}
    }

    enum CODIGO_RECEITA implements Serializable {
	EMISSAO_NFE(1, 1015), ICMS_FECOP(2, 2020), ICMS_ANTECIPADO_1023(3, 1023), ICMS_SUBST_ENTRADA_INTERESTADUAL_1031(4, 1031), ICMS_DIF_ALIQUOTA_1(5, 1090), ICMS_CARGA_LIQUIDA(6, 1120), ICMS_AUTO_INFRACAO_1040(7, 1040), ICMS_AUTO_INFRACAO_3034(8, 3034), ICMS_AUTO_INFRACAO_4030(9, 4030), MULTAS_OBRIGACOES_ACESSORIAS(10, 7030), ICMS_DIVIDA_ATIVA_1066(
		11, 1066), ICMS_DIVIDA_ATIVA_3042(12, 3042), ICMS_DIVIDA_ATIVA_4049(13, 4049), MULTAS_OBRIGACOES_ACESSORIAS_DIVIDA_ATIVA(14, 7048), ADICIONAL_ICMS_FECOP_DIVIDA_ATIVA(15, 2038), ICMS_PARCELAMENTO(16, 1074), IPVA_PARCELAMENTO(17, 3026), ITCD_PARCELAMENTO(18, 4022), ITCD(19, 4014), IPVA_VISTA_PARCELAMENTO(20, 3018), ICMS_MENSAL_SIMPLES_NACIONAL(
		21, 1155), ICMS_SUBST_TRIB_SAIDA(22, 1058), ICMS_SUBST_ENTRADA_INTERNA(23, 1104), ICMS_DIF_ALIQUOTA_2(24, 1090), ICMS_REGIME_ESPECIAL(25, 1015), ICMS_REGIME_MENSAL_APURACAO(1015, 1015), ICMS_ANTECIPADO_1031(1023, 1023), ICMS_SUBST_ENTRADA_INTERESTADUAL_1104(1031, 1031), ICMS_SUBST_SAIDA(1058, 1058), ICMS_IMPORTACAO(1082, 1082), ICMS_DIF_ALIQUOTA_3(
		1090, 1090), ICMS_SUBST_ENTRADA_INTERNA_1104(1104, 1104), ICMS_ESTOQUE_FINAL(1112, 1112), ICMS_OUTROS_CARGA_LIQUIDA(1120, 1120), ICMS_FECOP_2020(2020, 2020), TAXA_ADMINISTRACAO_FAZENDARIA(6017, 6017), TAXA_SEGURANCA_PUBLICA(6025, 6025), TAXA_ANUAL_SEGURANCA_INCENDIO(6033, 6033), TAXA_APROVACAO_PROJETOS_CONSTRUCAO(6041, 6041), TAXA_SAUDE(
		6050, 6050), TAXA_EDUCACAO(6068, 6068), TAXA_INSP_INDL_SANITARIA(6076, 6076), TAXA_BINGO(6084, 6084), TAXA_SERVICO_GRAFICO(6092, 6092), TAXA_SEMACE(6106, 6106);

	private int codigoReceita;
	private int codigoContabil;

	CODIGO_RECEITA(int codigoReceita, int codigoContabil) {
	    this.codigoReceita = codigoReceita;
	    this.codigoContabil = codigoContabil;
	}

	public int getCodigoReceita() {
	    return codigoReceita;
	}

	public int getCodigoContabil() {
	    return codigoContabil;
	}
    }

    enum TIPO_SITUACAO_DEBITO implements Serializable {
	EM_DEBITO(1), QUITADO(2), PARCELADO(3), ENVIADO_PRA_DIVIDA(4), INSCRITO_PRA_DIVIDA(5), NAO_SE_APLICA(6);

	private int codigo;

	TIPO_SITUACAO_DEBITO(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_APURACAO_OUTROS_ICMS implements Serializable {
	ICMS_NORMAL(0), ICMS_ANTECIPADO(1), ICMS_SUBST_TRIB_ENTRADA_INTERESTADUAL(2), ICMS_DIF_ALIQUOTA(3), ICMS_SUBST_TRIB_ENTRADA_INTERNA(4), ICMS_SUBST_TRIB_SAIDA_INTERNA(5), ICMS_OUTROS(6), FECOP_NORMAL(7), FECOP_SUBST_TRIB_ENTRADA_INTERESTADUAL(8), FECOP_SUBST_TRIB_ENTRADA_INTERNA(9), FECOP_SUBST_TRIB_SAIDA_INTERNA(10);

	private int codigo;

	TIPO_APURACAO_OUTROS_ICMS(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}

    }

    /**
     * Representa os sistemas existentes utilizados
     * 
     * @author Luiz Daniel Soares
     */
    /*
     * os códigos sao os mesmos da tabela TB_SISTEMA
     */
    enum SISTEMA implements Serializable {

	MONITORAMENTO(0, "Monitoramento"), PORTAL_CONTRIBUINTE(1, "Portal Contribuinte"), POSTO_FISCAL(2, "Posto Fiscal"), INFORME(3, "Informe"), COMUNICADO_ELETRONICO(4, "Comunicado Eletrônico"), EMISSOR_NFE(5, "Emissor NF-e"), SIGET_JOB(6, "Siget Job"), ATENDENTE(8, "Atendente"), SIAF(9, "SIAF"), SIGET_MONITORAMENTO(10, "Siget Monitoramento"), SIGET_PORTAL(11, "Siget Portal");

	private int codigo;
	private String descricao;

	SISTEMA(int codigo, String descricao) {
	    this.codigo = codigo;
	    this.descricao = descricao;
	}

	public int getCodigo() {
	    return codigo;
	}

	public String getDescricao() {
	    return descricao;
	}

	private static EnumSet<SISTEMA> eSet = EnumSet.allOf(SISTEMA.class);

	public static SISTEMA getSistemaPorCodigo(int codigoSistema) {
	    for (SISTEMA sis : eSet) {
		if (sis.getCodigo() == codigoSistema) {
		    return sis;
		}
	    }
	    return null;
	}

    }

    enum TIPO_EVENTO implements Serializable {
	CONFIRMACAO_OPERACAO(210200), CIENCIA_OPERACAO(210210), DESCONHECIMENTO_OPERACAO(210220), OPERACAO_NAO_REALIZADA(210240);

	private int codigo;

	TIPO_EVENTO(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_VINCULO implements Serializable {
	SOCIO(1, "SOCIO"), DEPENDENTE_SOCIO(2, "DEPENDENTE DE SOCIO"), CONTADOR(3, "CONTADOR"), DEPENDENTE_CONTADOR(4, "DEPENDENTE DE CONTADOR"), DEPENDENTE_REF_SOCIO_CONCESSIONARIAS(6, "DEPENDENTE REF SOCIO/CONCESSIONARIAS"), DEPENDENTE_REF_SOCIO_CREDENCIADA_ECF(7, "DEPENDENTE REF SOCIO/CREDENCIADA ECF"), ORGAO_PUBLICO_MESTRE(33,
		"ORGAO PUBLICO - MESTRE"), ORGAO_PUBLICO_DEPENDENTE(34, "ORGAO PUBLICO - DEPENDENTE"), TABELIAO(70, "TABELIAO"), ADVOGADO(71, "ADVOGADO"), INSTITUICAO_ARRECADADORA(73, "INSTITUICAO ARRECADADORA"), ADMINISTRADORA_CARTAO(74, "ADMINISTRADORA DE CARTAO"), DESENVOLVEDOR_PAF_ECF(75, "DESENVOLVEDOR PAF-ECF"), EMISSOR_NOTAS_FISCAIS_AVULSAS(
		76, "EMISSOR DE NOTAS FISCAIS AVULSAS"), REPRESENTANTE_DIEF_ESTADUAL(77, "REPRESENTANTE DIEF ESTADUAL"), REPRESENTANTE_DIEF_MUNICIPAL(78, "REPRESENTANTE DIEF MUNICIPAL"), REVENDEDOR_ECF(79, "REVENDEDOR ECF"), EMISSOR_NOTA_FISCAL_ELETRONICA(80, "EMISSOR DE NOTA FISCAL ELETRONICA");

	private int codigo;
	private String descricao;

	TIPO_VINCULO(int codigo, String descricao) {
	    this.codigo = codigo;
	    this.descricao = descricao;
	}

	public int getCodigo() {
	    return codigo;
	}

	public String getDescricao() {
	    return descricao;
	}
    }

    enum TIPO_ORIGEM_DEBITO implements Serializable {
	SITRAM_1031(10, 1031), SITRAM_1023(10, 1023), SITRAM_1090(10, 1090), SITRAM_1120(10, 1120), SITRAM_2020(10, 2020), ICMS_NORMAL_DIEF_SPED(1, 1), ICMS_ESPECIAL_CADASTRO_UFIRCE(2, 25), ICMS_FECOP_DIEF_SPED(3, 2), COMETA_ICMS_ANTECIPADO_3(4, 3), COMETA_ICMS_ANTECIPADO_4(4, 4), COMETA_ICMS_ANTECIPADO_5(4, 5), COMETA_ICMS_ANTECIPADO_6(4, 6), COMETA_ICMS_ANTECIPADO_2(
		4, 2), CAF_ICMS_AUTO_INFRAÇÃO_7(5, 7), CAF_ICMS_AUTO_INFRAÇÃO_8(5, 8), CAF_ICMS_AUTO_INFRAÇÃO_9(5, 9), CAF_ICMS_AUTO_INFRAÇÃO_10(5, 10), DIVIDA_ICMS_DIVIDA_ATIVA_11(6, 11), DIVIDA_ICMS_DIVIDA_ATIVA_12(6, 12), DIVIDA_ICMS_DIVIDA_ATIVA_13(6, 13), DIVIDA_ICMS_DIVIDA_ATIVA_14(6, 14), DIVIDA_ICMS_DIVIDA_ATIVA_15(6, 15), ICMS_PARCELAMENTO_ESPONTANEO_16(
		7, 16), ICMS_PARCELAMENTO_ESPONTANEO_17(7, 17), ICMS_PARCELAMENTO_ESPONTANEO_18(7, 18), ICMS_PARCELAMENTO_ESPONTANEO_10(7, 10), DIVIDA_PARCELAMENTO_ICMS_DIVIDA_ATIVA_11(8, 11), DIVIDA_PARCELAMENTO_ICMS_DIVIDA_ATIVA_12(8, 12), DIVIDA_PARCELAMENTO_ICMS_DIVIDA_ATIVA_13(8, 13), DIVIDA_PARCELAMENTO_ICMS_DIVIDA_ATIVA_14(8, 14), ITCD(9,
		19), IPVA(10, 20), PGDAS_CONTRIBUINTES_SIMPLES_NACIONAL(11, 21), SPED_CONTRIBUINTES_SUBSTITUTO_TRIBUTARIO(12, 22), GIA_ST(13, 22), DIEF_SPED_OUTROS_DEBITOS_22(14, 22), DIEF_SPED_OUTROS_DEBITOS_23(14, 23), DIEF_SPED_OUTROS_DEBITOS_4(14, 4), DIEF_SPED_OUTROS_DEBITOS_3(14, 3), DIEF_SPED_OUTROS_DEBITOS_24(14, 24);

	private int codigoReceita;
	private int codigoOrigem;

	TIPO_ORIGEM_DEBITO(int codigoOrigem, int codigoReceita) {
	    this.codigoReceita = codigoReceita;
	    this.codigoOrigem = codigoOrigem;
	}

	public int getCodigoReceita() {
	    return codigoReceita;
	}

	public int getCodigoOrigem() {
	    return codigoOrigem;
	}
    }

    enum MES implements Serializable {
	JANEIRO(1, "Janeiro", "JAN"), FEVEREIRO(2, "Fevereiro", "FEV"), MARCO(3, "Mar\u00E7o", "MAR"), ABRIL(4, "Abril", "ABR"), MAIO(5, "Maio", "MAI"), JUNHO(6, "Junho", "JUN"), JULHO(7, "Julho", "JUL"), AGOSTO(8, "Agosto", "AGO"), SETEMBTO(9, "Setembro", "SET"), OUTUBRO(10, "Outubro", "OUT"), NOVEMBRO(11, "Novembro", "NOV"), DEZEMBRO(12,
		"Dezembro", "DEZ");

	private int codigo;
	private String descricao;
	private String descricaoAbreviada;

	MES(int codigo, String descricao, String descricaoAbreviada) {
	    this.codigo = codigo;
	    this.descricao = descricao;
	    this.descricaoAbreviada = descricaoAbreviada;
	}

	public int getCodigo() {
	    return codigo;
	}

	public String getDescricao() {
	    return descricao;
	}

	public String getNomeAbreviado() {
	    return descricaoAbreviada;
	}

	private static EnumSet<MES> eSet = EnumSet.allOf(MES.class);

	public static String getMesPorCodigo(int codigo) {
	    for (MES mes : eSet) {
		if (mes.getCodigo() == codigo) {
		    return mes.getDescricao();
		}
	    }
	    return null;
	}

	public static short getMesPorDescricao(String descricao) {
	    for (MES mes : eSet) {
		if (mes.getDescricao().equals(descricao)) {
		    return Short.valueOf(String.valueOf(mes.getCodigo()));
		}
	    }
	    return 0;
	}
    }

    enum TIPO_SITUACAO_EMPRESA implements Serializable {
	ATIVO(1), BAIXADO_A_PEDIDO(3), BAIXA_DE_OFICIO(5), CASSADO(7), ATIVO_EM_EDITAL(8), EXCLUIDO(9), EM_PROCESSO_DE_BAIXA(10), CANCELADO(11), SUSPENSO(12), NAO_HOMOLOGADO(13), ANULADO(24), BAIXADO_CNPJ_NIRE(25), ANULADO_CNPJ_NIRE(26);

	private int codigo;

	TIPO_SITUACAO_EMPRESA(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TB_TIPO_SITUACAO_PLAN implements Serializable {
	EM_DESENVOLVIMENTO(1), AGUARDANDO_APROVACAO(2), NAO_APROVADO(3), ATIVO(4), FINALIZADO(5), EM_DESENVOLVIMENTO_SELECAO(6), EM_DESENVOLVIMENTO_EXCLUSAO(7), EM_DESENVOLVIMENTO_REFINAMENTO(8), CANCELADO(9), A_HOMOLOGAR(11);

	private int codigo;

	TB_TIPO_SITUACAO_PLAN(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}

    }

    // 2// Enviado o Mandado de Monitoramento Fiscal para o Contribuinte
    // 3 = código da ação - Enviado o PAM para o Agente_Fiscal
    // 10 = Enviar Mandado de Monitoramento Fiscal para o contribuinte
    enum ACOMPANHAMENTO implements Serializable {

	ENVIO_MANDADO((short) 2), ENVIO_AGENTE_FISCAL((short) 3), ENVIAR_MANDADO((short) 10);
	private short codigo;

	ACOMPANHAMENTO(short codigo) {
	    this.codigo = codigo;
	}

	public short getCodigo() {
	    return codigo;
	}

    }

    enum TIPO_OPERACAO implements Serializable {
	NFE(1), DIEF(2), SPED(3), TIPOGRAFICO(4), ESCRITURACAO_MANUAL(5);

	private int codigo;

	TIPO_OPERACAO(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }

    enum TIPO_EXPORTAR implements Serializable {
	PDF(0), EXCEL(1), CSV(2), PDF_EMAIL(3), EXCEL_EMAIL(4), CSV_EMAIL(5);

	private int codigo;

	TIPO_EXPORTAR(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}

	public void setCodigo(int cod) {
	    this.codigo = cod;
	}
    }

    enum CONSULTA_RELATORIO implements Serializable {
	NFE_RECEBIDA(1), NFE_EMITIDA(2), NFE_RECEBIDA_OUTROS(3), NFE_EMITIDA_OUTROS(4);

	private int codigo;

	CONSULTA_RELATORIO(int codigo) {
	    this.codigo = codigo;
	}

	public int getCodigo() {
	    return codigo;
	}
    }
    
    /**
     * Tipos de Ambientes
     * 
     * @author 008076C5
     */
    public enum Ambiente {
	PRODUCAO(1), HOMOLOGACAO(2), DESENVOLVIMENTO(3), LOCAL(4);

	private final int codigo;

	Ambiente(int codigo) {
	    this.codigo = codigo;
	}

	/**
	 * Método que retorna o código ambiente.
	 * 
	 * @return 1 para PRODUCAO, 2 para HOMOLOGACAO, 3 para DESENVOLVIMENTO e 4 para LOCAL;
	 */
	public int getCodigo() {
	    return codigo;
	}

    }
}