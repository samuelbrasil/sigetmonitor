package br.com.siget.sigetmonitor.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
		/*sqlQuery.append("INSERT INTO ").append(owner).append(".TB_ASSUNTO_ATENDIMENTO AST ");
		sqlQuery.append(
				"(AST.AST_CD_ASSUNTO_ATENDIMENTO, AST.AST_DS_ASSUNTO_ATENDIMENTO, AST.AST_DT_INCLUSAO, AST.AST_ST_ASSUNTO_ATENDIMENTO, AST.AST_TEMPO_RESOLUCAO) ");
		sqlQuery.append("VALUES(?, ?, ?, ?, ?) ");*/
		
		//MySql
		sqlQuery.append("INSERT INTO ").append("TB_ASSUNTO_ATENDIMENTO ");
		sqlQuery.append(
				"(AST_CD_ASSUNTO_ATENDIMENTO, AST_DS_ASSUNTO_ATENDIMENTO, AST_DT_INCLUSAO, AST_ST_ASSUNTO_ATENDIMENTO, AST_TEMPO_RESOLUCAO) ");
		sqlQuery.append("VALUES(?, ?, ?, ?, ?) ");
		
  
		List<Object> params = new ArrayList<>();
		params.add(assuntoAtendimento.getiAssuntosEscolhido());
		params.add(assuntoAtendimento.getDsAssuntosAtendimento());
		params.add(new java.sql.Date(assuntoAtendimento.getDtInclusao().getTime()));
		params.add(EnumUtils.getIntValue(assuntoAtendimento.getIcAtivo()));
		params.add(assuntoAtendimento.getiTempoResolucao());
 
		return jdbcTemplate.update(sqlQuery.toString(), params.toArray()) > 0;

	}
	
	public List<AssuntosAtendimento> listaAssuntoAtendimento() {
		StringBuffer sqlQuery = new StringBuffer();
		/*sqlQuery.append("SELECT ");
		sqlQuery.append(
				"AST.AST_CD_ASSUNTO_ATENDIMENTO, AST.AST_DS_ASSUNTO_ATENDIMENTO, AST.AST_DT_INCLUSAO, AST.AST_ST_ASSUNTO_ATENDIMENTO, AST.AST_TEMPO_RESOLUCAO ");
		sqlQuery.append("FROM ").append(owner).append(".TB_ASSUNTO_ATENDIMENTO AST ");
		sqlQuery.append("ORDER BY AST_CD_ASSUNTO_ATENDIMENTO");*/
		
		//MySql
		sqlQuery.append("SELECT ");
		sqlQuery.append(
				"AST.AST_CD_ASSUNTO_ATENDIMENTO, AST.AST_DS_ASSUNTO_ATENDIMENTO, AST.AST_DT_INCLUSAO, AST.AST_ST_ASSUNTO_ATENDIMENTO, AST.AST_TEMPO_RESOLUCAO ");
		sqlQuery.append("FROM ").append("TB_ASSUNTO_ATENDIMENTO AST ");
		sqlQuery.append("ORDER BY AST_CD_ASSUNTO_ATENDIMENTO");
		
		return jdbcTemplate.query(sqlQuery.toString(), new ResultSetExtractor<List<AssuntosAtendimento>>() {
			
			@Override
			public List<AssuntosAtendimento> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<AssuntosAtendimento> assuntosAtendimento = new ArrayList<>();
				
				while(rs.next()) {
					AssuntosAtendimento assuntoAtendimento = new AssuntosAtendimento();
					assuntoAtendimento.setiAssuntosEscolhido(rs.getInt("AST_CD_ASSUNTO_ATENDIMENTO"));
					assuntoAtendimento.setDsAssuntosAtendimento(rs.getString("AST_DS_ASSUNTO_ATENDIMENTO"));
					assuntoAtendimento.setDtInclusao(new Date(rs.getDate("AST_DT_INCLUSAO").getTime()));
					assuntoAtendimento.setIcAtivo(EnumUtils.getValueSitucao(rs.getInt("AST_ST_ASSUNTO_ATENDIMENTO")));
					assuntoAtendimento.setiTempoResolucao(rs.getInt("AST_TEMPO_RESOLUCAO"));
					assuntosAtendimento.add(assuntoAtendimento);
				}
				
				return assuntosAtendimento;
			}
		});
	}
	
	public Boolean alteraAssuntoAtendimento(AssuntosAtendimento assuntoAtendimento) {
		
			StringBuffer sqlQuery = new StringBuffer();
		    /*sqlQuery.append("UPDATE ").append(owner).append(".TB_ASSUNTO_ATENDIMENTO AST ");
		    sqlQuery.append("SET AST.AST_DS_ASSUNTO_ATENDIMENTO = ?, AST.AST_ST_ASSUNTO_ATENDIMENTO = ?, AST.AST_TEMPO_RESOLUCAO = ? ");
		    sqlQuery.append("WHERE AST.AST_CD_ASSUNTO_ATENDIMENTO = ?");*/
			
			//MySql
		    sqlQuery.append("UPDATE ").append("TB_ASSUNTO_ATENDIMENTO AST ");
		    sqlQuery.append("SET AST.AST_DS_ASSUNTO_ATENDIMENTO = ?, AST.AST_ST_ASSUNTO_ATENDIMENTO = ?, AST.AST_TEMPO_RESOLUCAO = ? ");
		    sqlQuery.append("WHERE AST.AST_CD_ASSUNTO_ATENDIMENTO = ?");
		    

		    List<Object> params = new ArrayList<>();
			params.add(assuntoAtendimento.getDsAssuntosAtendimento());
			params.add(EnumUtils.getIntValue(assuntoAtendimento.getIcAtivo()));
			params.add(assuntoAtendimento.getiTempoResolucao());
			
			params.add(assuntoAtendimento.getiAssuntosEscolhido());
			return jdbcTemplate.update(sqlQuery.toString(), params.toArray()) > 0;
	}
	

}
