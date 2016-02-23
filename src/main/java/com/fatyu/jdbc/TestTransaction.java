package com.fatyu.jdbc;

import java.sql.*;

public class TestTransaction {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			ps = conn
					.prepareStatement("insert into fatyu (id,name) values(?,?);");
			for (int i = 1; i <= 5; i++) {
				ps.setInt(1, i);
				ps.setString(2, "Fatyu" + i);
				ps.execute();
			}

			ps = conn.prepareStatement("select * from fatyu where id>=1;");

			rs = ps.executeQuery();
			System.out.println(JdbcUtil.printRS(rs));
			// conn.rollback();
			// System.out.println("---------------------------commit executed!---------------------");
			conn.commit();
			System.out
					.println("---------------------------commit executed!---------------------");
			ps = conn.prepareStatement("select * from fatyu where id>=1;");

			rs = ps.executeQuery();
			System.out.println(JdbcUtil.printRS(rs));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.relase(rs, ps, conn);
		}
	}
}