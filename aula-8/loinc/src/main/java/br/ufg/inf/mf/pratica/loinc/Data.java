package br.ufg.inf.mf.pratica.loinc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Data {
	
	public static ArrayList<Loinc> getAllData(String whereClause) {
		return getData(whereClause, 0, "", "");
	}
	
	public static ArrayList<Loinc> getDataWithLimit(String whereClause, int limit) {
		return getData(whereClause, limit, "", "");
	}
	
	public static ArrayList<Loinc> getDataWithLimitAndOrder(String whereClause, int limit, String OrderClause) {
		return getData(whereClause, limit, OrderClause, "");
	}
	
	public static ArrayList<Loinc> getDataWithLimitAndSelectedField(String whereClause, int limit, String field) {
		return getData(whereClause, limit, "", field);
	}

	public static ArrayList<Loinc> getDataWithOrder(String whereClause, String orderClause) {
		return getData(whereClause, 0, orderClause, "");
	}
	
	public static ArrayList<Loinc> getDataWithOrderAndSelectedField(String whereClause, String field) {
		return getData(whereClause, 0, "", field);
	}
	
	public static ArrayList<Loinc> getDataWithSelectedField(String whereClause, String field) {
		return getData(whereClause, 0, "", field);
	}
	
	public static ArrayList<Loinc> getDataWithOrderAndLimit(String whereClause, int limit, String orderClause) {
		return getData(whereClause, limit, orderClause, "");
	}
	
	protected static ArrayList<Loinc> getData(String whereClause, int limit, String orderBy, String fieldReturn) {
		
		ArrayList<Loinc> recordData = new ArrayList<Loinc>();

		if (!CarregarDriver("com.mysql.cj.jdbc.Driver")) {}

		String url = "jdbc:mysql://www.db4free.net/mf18loinc?verifyServerCertificate=false&useSSL=true";
		Connection connection = obtemConexao(url, "mf18loinc", "qr3fds#m@s");

		try {

			Statement statement = connection.createStatement();
			String selectClause = (fieldReturn.equals("")) ? "*" : fieldReturn;
			String orderClause = (orderBy.equals("")) ? "" : " order by " + orderBy;
			String limitClause = (limit == 0) ? "" : " limit " + limit;
			String query = "select " + selectClause + " from loinc where " + whereClause + orderClause + limitClause;
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				
				Loinc data = new Loinc();
				data.setClasse(rs.getString("class"));
				data.setClassType(rs.getInt("classtype"));
				data.setComponent(rs.getString("component"));
				data.setExternalCopyrightNotice(rs.getString("external_copyright_notice"));
				data.setLoincNum(rs.getString("loinc_num"));
				data.setLongCommonName(rs.getString("long_common_name"));
				data.setMethodTyp(rs.getString("method_typ"));
				data.setProperty(rs.getString("property"));
				data.setScaleTyp(rs.getString("scale_typ"));
				data.setShortName(rs.getString("shortname"));
				data.setStatus(rs.getString("status"));
				data.setSystems(rs.getString("systems"));
				data.setTimeAspct(rs.getString("time_aspct"));
				data.setVersionFirstReleased(rs.getString("version_first_released"));
				data.setVersionLastChanged(rs.getString("version_last_changed"));
				recordData.add(data);
			}
		} catch (SQLException e) {

		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {

			}
		}

		return recordData;
	}

	public static Connection obtemConexao(String url, String user, String password) {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException sql) {
			return null;
		}
	}

	public static boolean CarregarDriver(String driver) {
		try {
			Class.forName(driver);
			return true;
		} catch (ClassNotFoundException exp) {
			return false;
		}
	}
}
