package br.com.siget.sigetmonitor.api.dao;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.siget.sigetmonitor.api.enums.ITiposEnumerados.SITUACAO;
import br.com.siget.sigetmonitor.api.model.AssuntosAtendimento;


@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("test")
public class AssuntoAtendimentoDaoTest {
	
	@Autowired
	private AssuntoAtendimentoDao assuntoAtendimentoDao; 
	
	@Before
	public void setUp() {
		
		
	}
	
	@After
	public final void tearDown() {
		
	}
	
	@Test
	public void testCadastrarAssuntoAtendimento() {
		AssuntosAtendimento assunto = new AssuntosAtendimento();
		assunto.setiAssuntosEscolhido(3);
		assunto.setDsAssuntosAtendimento("Assunto de teste 3");
		assunto.setDtInclusao(new Date());
		assunto.setIcAtivo(SITUACAO.ATIVO);
		assunto.setiTempoResolucao(4);
		boolean result = assuntoAtendimentoDao.insereAssuntoAtendimento(assunto);
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void testListarAssuntoAtendimento() {
		List<AssuntosAtendimento> listaAssuntos = assuntoAtendimentoDao.listaAssuntoAtendimento();
		for(AssuntosAtendimento assunto : listaAssuntos) {
			System.out.println("id Assunto: " + assunto.getiAssuntosEscolhido());
			System.out.println("Ds Assunto: " + assunto.getDsAssuntosAtendimento());
			System.out.println("Data Assunto: " + assunto.getDtInclusao());
			System.out.println("Ativo Assunto: " + assunto.getIcAtivo());
			System.out.println("Tempo de resolucao: " + assunto.getiTempoResolucao());
			System.out.println("----------------------: ");
			
		}
		System.out.println("Tamanho da lista: " + listaAssuntos.size());
		Assert.assertNotEquals(0, listaAssuntos.size());
	}
	
	@Test
	public void testAlterarAssuntoAtendimento() {
		AssuntosAtendimento assunto = new AssuntosAtendimento();
		assunto.setiAssuntosEscolhido(3);
		assunto.setDsAssuntosAtendimento("Assunto de teste atualizado 3");
		assunto.setDtInclusao(new Date());
		assunto.setIcAtivo(SITUACAO.INATIVO);
		assunto.setiTempoResolucao(4);
		
		assuntoAtendimentoDao.alteraAssuntoAtendimento(assunto);
	}
	
	
}
