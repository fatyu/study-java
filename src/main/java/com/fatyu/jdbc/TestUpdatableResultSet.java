package com.fatyu.jdbc;

import java.sql.*;

public class TestUpdatableResultSet {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement("select * from fatyu", ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();

			rs.moveToInsertRow();// 将指针加入到缓存
			rs.updateInt(1, 4);
			rs.updateString(2, "1234");
			rs.insertRow();// 将数据插入到数据库
			rs.moveToCurrentRow();// 将指针指向原来的行

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}

			// ------------------------
			rs.beforeFirst();
			System.out.println("------------------------");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.relase(rs, ps, conn);
		}
	}
}
