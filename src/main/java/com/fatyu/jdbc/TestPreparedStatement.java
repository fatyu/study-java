package com.fatyu.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestPreparedStatement {
	public void main(String[] args) {
		Connection conn = JdbcUtil.getConnection();// 获得数据库连接
		PreparedStatement ps = null;
		try {
			ps = conn
					.prepareStatement("insert into fatyu (id,name) values (?,?)");// 通过连接对象创建Ps对象
			for (int i = 0; i < 100; i++) {
				ps.setInt(1, i);// 设置sql的第一个字段
				ps.setString(2, "Fatyu" + i);// 设置sql的第二个字段
				ps.execute();// 执行
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.relase(ps);//关闭资源
			JdbcUtil.relase(conn);//关闭资源
		}
	}
}
