package com.fatyu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestScroll {
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConnection();
			ps = conn.prepareStatement("select * from fatyu", ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}

			if (rs.isAfterLast()) {
				System.out.println("cursor is end!");
			}
			while (rs.next()) {// 测试指针指向了终点 不会调用此方法
				System.out.println("invoke the second while method");
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
			rs.beforeFirst();
			System.out.println("cursor is begin!");

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