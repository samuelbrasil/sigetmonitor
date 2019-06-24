package br.com.siget.sigetmonitor.api.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.siget.sigetmonitor.api.model.AssuntosAtendimento;
import br.com.siget.sigetmonitor.util.EnumUtils;

@Repository
public class AssuntoAtendimentoDao {
	
	@Value("${database.owner}")
	private String owner;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AssuntoAtendimentoDao(final DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Boolean insereAssuntoAtendimento(AssuntosAtendimento assuntoAtendimento)  {

		StringBuilder sqlQuery = new StringBuilder();
		sqlQuery.append("INSERT INTO ").append(owner).append(".TB_ASSUNTO_ATENDIMENTO AST ");
		sqlQuery.append(
				"(AST.AST_CD_ASSUNTO_ATENDIMENTO, AST.AST_DS_ASSUNTO_ATENDIMENTO, AST.AST_DT_INCLUSAO, AST.AST_ST_ASSUNTO_ATENDIMENTO, AST.AST_TEMPO_RESOLUCAO) ");
		sqlQuery.append("VALUES(?, ?, ?, ?, ?) ");
		
		/*pstQuery.setInt(1, bean.getiAssuntosEscolhido());
	    pstQuery.setString(2, bean.getMapAssuntos().get(String.valueOf(bean.getiAssuntosEscolhido())));
	    pstQuery.setDate(3, new java.sql.Date(bean.getDtInclusao().getTime()));
	    pstQuery.setInt(4, EnumUtils.getIntValue(bean.getIcAtivo()));
	    pstQuery.setInt(5, bean.getiTempoResolucao());

	    return pstQuery.executeUpdate() > 0;*/

		List<Object> params = new ArrayList<>();
		params.add(assuntoAtendimento.getiAssuntosEscolhido());
		params.add(assuntoAtendimento.getDsAssuntosAtendimento());
		params.add(new java.sql.Date(assuntoAtendimento.getDtInclusao().getTime()));
		params.add(EnumUtils.getIntValue(assuntoAtendimento.getIcAtivo()));
		params.add(assuntoAtendimento.getiTempoResolucao());

		return jdbcTemplate.update(sqlQuery.toString(), params.toArray()) > 0;

	}

}
