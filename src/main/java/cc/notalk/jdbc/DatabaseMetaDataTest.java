package cc.notalk.jdbc;

import java.sql.*;

public class DatabaseMetaDataTest {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			DatabaseMetaData dbmd = conn.getMetaData();
			String[] types = new String[1];
			types[0] = "Table";
			ResultSet rs = dbmd.getTables(null, "root", "%", types);
			System.out.println(JdbcUtil.printRS(rs));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.relase(conn);
		}
	}
}