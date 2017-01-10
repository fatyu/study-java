package com.fatyu.jdbc;

import java.sql.*;

/**
 * 
 * JavaSE.TestJdbc.java
 * 
 * @author Fatyu 2009-9-21
 */
public class TestJdbc {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 获取连接
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Fatyu", "root", "root");
			// 获得操作数据库对象
			st = conn.createStatement();
			// 编写sql语句并使用操作数据库对象执行sql语句
			String sql = "select * from fatyu;";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭占用的资源
				st.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}