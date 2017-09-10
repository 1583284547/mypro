package cn.jbit.epet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 数据库
 */
public class BaseDao {
	// 数据库驱动字符串
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	// 连接URL字符串
	private String url = "jdbc:sqlserver://localhost:1433;DatabaseName=epet";
	private String user = "sa";
	private String password = "645519523";
	protected Connection conn = null;
	/**
	 * 获取数据库连接对象
	 */
	public Connection getConnection(){
		if(conn==null){
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		return conn;
	}
	/**
	 * 关闭数据库连接
	 * @param conn 数据库连接
	 * @param stmt Statement对象
	 * @param rs 结果集
	 */
	public void closeAll(Connection conn,Statement stmt,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 增、删、改的操作
	 * @param sql预编译的SQL语句
	 * @param param参数的字符串数组
	 * @return 影响的行数
	 */
	public int exceuteUpate(String preparedSql,Object[] param){
		int num=0;
		PreparedStatement pstmt=null;
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(preparedSql);
			if(param!=null){
				for (int i = 0; i < param.length; i++) {
				  pstmt.setObject(i+1, param[i]);			  
				}
			}
			num=pstmt.executeUpdate();
	        conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
		
		
	}
}
