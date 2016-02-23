package com.fatyu.jdbc;

import java.sql.*;

public class TestBatchProcess {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement("insert into fatyu values (?,?);");

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 50; j++) {
					ps.setInt(1, i * 100 + j);
					ps.setString(2, "Fatyu" + (i * 100 + j));
					ps.addBatch();
				}
ps.executeBatch();
			}
			
			JdbcUtil.relase(ps);

			ps = conn.prepareStatement("select * from fatyu");
			rs = ps.executeQuery();
			System.out.print(JdbcUtil.printRS(rs));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.relase(rs, ps, conn);
		}
	}
}
