package com.fatyu.jdbc;

import java.sql.*;

/**
 * 
 * JavaSE.JdbcUtil.java
 * 
 * @author Fatyu 2009-9-22
 */
public class JdbcUtil {
	/**
	 * 只初始化一次的注册驱动
	 */
	// 1.注册驱动程序[singlton Dp]
	static {// static块在运行期间只初始化一次
		try {
			Class.forName("com.mysql.jdbc.Driver");// 注册mysql数据库的驱动
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 建立数据库连接
	 * 
	 * @return Connection对象
	 */
	// 2.连接数据库
	public static Connection getConnection() {
		Connection conn = null;// 声明连接对象
		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/fatyu","root","root");
// 由驱动管理器创建连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭所有的数据库资源
	 * 
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	// 3.关闭数据库资源
	public static void relase(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 根据传递的参数类型关闭对应的数据库资源
	 * 
	 * @param obj
	 */
	public static void relase(Object obj) {
		try {
			if (obj instanceof ResultSet) {
				((ResultSet) obj).close();
			}else
			if (obj instanceof Statement) {
				((Statement) obj).close();
			}else
			if (obj instanceof Connection) {
				((Connection) obj).close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 这样一个类的设计就完成了 类的设计就是抽象-->封装-->供其他类调用或者继承
	 * 程序设计要实现的最终目标：面向结构编程
	 * */



	 //添加打印结果集元数据方法
public static String printRS(ResultSet rs){
		
		if(rs==null)
			return "请输入结果集对象作为参数.";
		StringBuffer sb = new StringBuffer();
		try{
				
				ResultSetMetaData rsmd = rs.getMetaData();
				int columnCount = rsmd.getColumnCount();
				while(rs.next()){
					for(int i = 1; i <= columnCount ; i++){
						sb.append(rsmd.getColumnName(i)+rs.getString(i)+"\t");
					}
					sb.append("\n");
				}
				
				
				
			}catch(SQLException e){
				e.printStackTrace();
			}
	return new String(sb);
}

}
