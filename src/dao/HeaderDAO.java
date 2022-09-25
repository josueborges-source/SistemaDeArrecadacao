package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import model.Header;

import java.sql.Date;

public class HeaderDAO {

	//private Connection connection;

	public HeaderDAO() {
		// this.connection = new ConnectionFactory().getConnection();
	}

	public static void main(String[] args) throws SQLException 
	{
		HeaderDAO dao = new HeaderDAO();
		
		dao.excluirTabela();
		dao.criarTabela();
		
		Header header = new Header();
		
		header.setIdentificacaoRegistro(Integer.valueOf(1));
		header.setContrato("01000000002022908203774000AC1");
		header.setCodConcessionaria(Integer.valueOf(0001));
		header.setDataEnvio(Calendar.getInstance());
		header.setSiglaMoeda("R$");
		
		//// DAQUI: 
		header.setNumeroSequencialEnvio(Integer.valueOf(00001));
		header.setMotivosRecusa(Integer.valueOf(00));
		header.setNomeClienteContratante("ASSOCIACAO CULTURAL");
		header.setTipoArquivo(Integer.valueOf(2));	
		
		
		dao.adiciona(header);
		
	}
	
	public void excluirTabela() throws SQLException {
		
		Connection con = new ConnectionFactory().getConnection();		

		String sql = "DROP TABLE header";
	
		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.execute();
		stmt.close();
		System.out.println("Tabela Excluida!");
		con.close();	
	}
	
	
	public void criarTabela() throws SQLException {
		
		Connection con = new ConnectionFactory().getConnection();		

		String sql = "CREATE TABLE header (identificacaoRegistro VARCHAR(1), contrato VARCHAR(56) DEFAULT '01000000002022908203774000AC1', codConcessionaria VARCHAR(4) DEFAULT '0001', "
				+ "dataEnvio DATE, siglaMoeda VARCHAR(6) DEFAULT 'R$', numeroSequencialEnvio INT, motivosRecusa VARCHAR(2), nomeClienteContratante VARCHAR(20) DEFAULT 'ASSOCIACAO CULTURAL',"
				+ "tipoArquivo VARCHAR(1), numeroSequencialRegistro INT NOT NULL PRIMARY KEY )";
	
		
		//String sql = "DROP TABLE header";
		PreparedStatement stmt = con.prepareStatement(sql);

		stmt.execute();
		stmt.close();
		System.out.println("Tabela Criada!");
		con.close();	
	}
	

	public void adiciona(Header header) {

		try {
			Connection con = new ConnectionFactory().getConnection();

			String sql = "INSERT into header "
					+ "(identificacaoRegistro, contrato, codConcessionaria, dataEnvio, siglaMoeda, numeroSequencialEnvio, motivosRecusa , nomeClienteContratante, "
					+ "tipoArquivo, numeroSequencialRegistro)" + " values (?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, header.getIdentificacaoRegistro().intValue());
			stmt.setString(2, header.getContrato());
			stmt.setInt(3, header.getCodConcessionaria().intValue());
			stmt.setDate(4, new Date( header.getDataEnvio().getTimeInMillis()));		
			
			stmt.setString(5, header.getSiglaMoeda());
			stmt.setInt(6, header.getNumeroSequencialEnvio().intValue());
			stmt.setInt(7, header.getMotivosRecusa().intValue());
			stmt.setString(8, header.getNomeClienteContratante());
			stmt.setInt(9,header.getTipoArquivo().intValue());		
			stmt.setInt(10,header.getNumeroSequencialRegistro().intValue());	
			
			
			stmt.execute();
			stmt.close();
			System.out.println("Dados adicionados.");
			con.close();
			}
		    catch (SQLException e) {
			throw new RuntimeException(e);
		}

		/*
		 * String sql = "insert	into	contatos	" +
		 * "(nome,email,endereco,dataNascimento)" + "	values	(?,?,?,?)"; try { //
		 * prepared statement para inserção PreparedStatement stmt =
		 * con.prepareStatement(sql); // seta os valores ////
		 * stmt.setString(1,header.getNome());
		 * 
		 * // executa stmt.execute(); stmt.close(); } catch (SQLException e) { throw new
		 * RuntimeException(e); }
		 */

	}

}
