package com.icys.batch.test.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author JDBC辅助类 用于构建数据库连接（采用单例模式）
 */
public final class Test {
	// 该url为缺省方式（省略主机跟端口）
	// 完整为：jdbc:mysql//localhost:3306/test
	static String url = "jdbc:mysql:///test";
	static String name = "root";
	static String password = "sli";
	static Connection conn = null;
	private static Test jdbcUtilSingle = null;

	public static Test getInitJDBCUtil() {
		if (jdbcUtilSingle == null) {
			// 给类加锁 防止线程并发
			synchronized (Test.class) {
				if (jdbcUtilSingle == null) {
					jdbcUtilSingle = new Test();
				}
			}
		}
		return jdbcUtilSingle;
	}

	private Test() {
	}

	// 通过静态代码块注册数据库驱动，保证注册只执行一次
	static {
		try {
			// 注册驱动有如下方式：
			// 1.通过驱动管理器注册驱动，但会注册两次，并且会对类产生依赖。如果该类不存在那就报错了。
			// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 2.与3类似
			// System.setProperty("jdbc.drivers","com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");// 推荐使用方式
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 获得连接
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url,name,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	// 关闭连接
	public void closeConnection(ResultSet rs, Statement statement, Connection con) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (con != null) {
						con.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

