package com.fatyu.jdbc;

import java.sql.*;

public class MetaDataTest {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement("select * from fatyu order by id desc;");
			rs = ps.executeQuery();
			rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.println(rsmd.getColumnName(i) + ": " + rs.getString(i));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.relase(rs);
			JdbcUtil.relase(ps);
			JdbcUtil.relase(conn);
		}
	}
}
