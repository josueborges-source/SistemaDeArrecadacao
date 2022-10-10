package dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DetailConveniado;

public class DetailConveniadoDAO {

	Connection connection;

	public DetailConveniadoDAO() {
		connection = new ConnectionFactory().getConnection();
	}

	public void Salvar(DetailConveniado detailConveniado) {

		// connection = new ConnectionFactory().getConnection();
		try {
			String sql = "INSERT into detailConveniado "
					+ "(coberturaOcorrencia, complementoCNPJ, NumeroSequencialRegistro, dataGeracaoRegistro,"
					+ " valorLancamento, cnpjCliente, cpfCliente , codigoContaGerencial, "
					+ "codigoUnidadeConsumidora, comandoMovimento, descricaoCoberturaOcorrencia, numeroSequenciaRegistro,"
					+ "tipoRegistro, valorLancamento)" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setInt(1, detailConveniado.getCoberturaOcorrencia());
			stmt.setInt(2, detailConveniado.getComplementoCNPJ());
			stmt.setInt(3, detailConveniado.getNumeroSequencialRegistro());
			stmt.setInt(4, detailConveniado.getTipoRegistro());
			stmt.setInt(5, detailConveniado.getDataGeracaoRegistro());
			stmt.setInt(6, detailConveniado.getValorLancamento());
			stmt.setLong(7, detailConveniado.getCnpjCliente());
			stmt.setLong(8, detailConveniado.getCpfCliente());
			stmt.setString(9, detailConveniado.getCodigoContaGerencial());
			stmt.setLong(10, detailConveniado.getCodigoUnidadeConsumidora());
			stmt.setString(11, detailConveniado.getComandoMovimento());
			stmt.setBigDecimal(12, new BigDecimal(detailConveniado.getDescricaoCoberturaOcorrencia()));
			stmt.setBigDecimal(13, new BigDecimal(detailConveniado.getNumeroSequencialRegistro()));
			stmt.setInt(14, detailConveniado.getTipoRegistro());
			stmt.setInt(15, detailConveniado.getValorLancamento());

			stmt.execute();
			stmt.close();

			System.out.println("Dados adicionados:");
			System.out.println("Detail Conveniado: " + detailConveniado);

			connection.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<DetailConveniado> resgatarLista() {
		
		List<DetailConveniado> listaDeDetailConveniado = new ArrayList<DetailConveniado>();

		try {
			List<DetailConveniado> detailConveniadoLista = new ArrayList<DetailConveniado>();
			PreparedStatement stmt = this.connection.prepareStatement("select *	from contatos");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {

				DetailConveniado detailConveniado = new DetailConveniado();

				stmt.setInt(1, detailConveniado.getCoberturaOcorrencia());
				stmt.setInt(2, detailConveniado.getComplementoCNPJ());
				stmt.setInt(3, detailConveniado.getNumeroSequencialRegistro());
				stmt.setInt(4, detailConveniado.getTipoRegistro());
				stmt.setInt(5, detailConveniado.getDataGeracaoRegistro());
				stmt.setInt(6, detailConveniado.getValorLancamento());
				stmt.setLong(7, detailConveniado.getCnpjCliente());
				stmt.setLong(8, detailConveniado.getCpfCliente());
				stmt.setString(9, detailConveniado.getCodigoContaGerencial());
				stmt.setLong(10, detailConveniado.getCodigoUnidadeConsumidora());
				stmt.setString(11, detailConveniado.getComandoMovimento());
				stmt.setBigDecimal(12, new BigDecimal(detailConveniado.getDescricaoCoberturaOcorrencia()));
				stmt.setBigDecimal(13, new BigDecimal(detailConveniado.getNumeroSequencialRegistro()));
				stmt.setInt(14, detailConveniado.getTipoRegistro());
				stmt.setInt(15, detailConveniado.getValorLancamento());

				detailConveniado.setCoberturaOcorrencia(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setComplementoCNPJ(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setNumeroSequencialRegistro(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setDataGeracaoRegistro(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setValorLancamento(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setCnpjCliente(Long.getLong(rs.getString("coberturaOcorrencia")));
				detailConveniado.setCpfCliente(Long.getLong(rs.getString("coberturaOcorrencia")));
				detailConveniado.setCodigoUnidadeConsumidora(Long.getLong(rs.getString("coberturaOcorrencia")));
				detailConveniado.setComandoMovimento(rs.getString("coberturaOcorrencia"));
				detailConveniado.setDescricaoCoberturaOcorrencia(new BigInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setNumeroSequencialRegistro(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				detailConveniado.setValorLancamento(Integer.getInteger(rs.getString("coberturaOcorrencia")));
				
				
				detailConveniadoLista.add(detailConveniado);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return listaDeDetailConveniado;
	}
}
