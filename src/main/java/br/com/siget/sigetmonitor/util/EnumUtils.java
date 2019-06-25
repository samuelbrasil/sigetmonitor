package br.com.siget.sigetmonitor.util;

import java.util.LinkedHashMap;

import br.com.siget.sigetmonitor.api.enums.ITiposEnumerados;



public class EnumUtils {
	static String[]naosimLabels={"Não","Sim"};
	static String[]naosim={"NAO","SIM"};
	static String[]situacaoLabel={"Inativo","Ativo"};
	static String[]situacao={"INATIVO","ATIVO"};
	static String[]	IReferenciaLabels ={"Cadastral","NF-e","Sped Fiscal","Apuração","Obrigação Acessória","Obrigação Principal"};
	static String[]	IReferencia={"CADASTRAL","NFE","SPED_FISCAL","APURACAO","OBRIGACAO_ACESSORIA","OBRIGACAO_PRINCIPAL"};
	
	public static int  getIntValue(ITiposEnumerados.REFERENCIA val){
		return getIntValue(val, IReferencia);
	}

	public static int  getIntValue(ITiposEnumerados.ENVIA_CE val){
		return getIntValue(val,naosim);
	}
	public static int  getIntValue(ITiposEnumerados.SITUACAO val){
		return getIntValue(val,situacao);
	}
	@SuppressWarnings("rawtypes")
	public static LinkedHashMap getMapSitucao(){
		return getMap(ITiposEnumerados.SITUACAO.ATIVO,situacao,situacaoLabel);
	}
	public static ITiposEnumerados.REFERENCIA getValueReferencia(int i){
		return (ITiposEnumerados.REFERENCIA)getValue(i,ITiposEnumerados.REFERENCIA.CADASTRAL,IReferencia);
	}
	public static ITiposEnumerados.SITUACAO getValueSitucao(int i){
		return (ITiposEnumerados.SITUACAO)getValue(i,ITiposEnumerados.SITUACAO.ATIVO,situacao);
	}
	public static ITiposEnumerados.ENVIA_CE getValueEnviaCE(int i){
		return (ITiposEnumerados.ENVIA_CE)getValue(i,ITiposEnumerados.ENVIA_CE.SIM,naosim);
	}
	public static Enum getValue(int i,Enum m,String [] valores){
		if(i>=0&&i<valores.length){
		return	m.valueOf(m.getClass(), valores[i]);
		}
		return null;
	}
	public static LinkedHashMap getEnviaCEMap(){
		return getMap(ITiposEnumerados.ENVIA_CE.SIM,naosim,naosimLabels);
	}
	public static LinkedHashMap getReferenciaMap(){
		return getMap(ITiposEnumerados.REFERENCIA.APURACAO,IReferencia,IReferenciaLabels);
	}
	public static LinkedHashMap getMap(Enum enuma,String[] Valores,String labels[]){
		LinkedHashMap<Enum,String > map=new LinkedHashMap<Enum,String >(); 
		for(int i=0;i<Valores.length;i++){
			Enum m=getValue(i,enuma,Valores);
			map.put(m, labels[i]);
		}
		return map;
	}
	public static int getIntValue(Enum name,String[] valores){
		if(name!=null){
		String name1=name.toString();
		for(int i=0;i<valores.length;i++){
			if(valores[i].equals(name1)) return i;
		}
		}
		return -1;
	}
}
