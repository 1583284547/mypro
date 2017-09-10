package cn.jbit.epet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * ���ݿ�
 */
public class BaseDao {
	// ���ݿ������ַ���
	private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	// ����URL�ַ���
	private String url = "jdbc:sqlserver://localhost:1433;DatabaseName=epet";
	private String user = "sa";
	private String password = "645519523";
	protected Connection conn = null;
	/**
	 * ��ȡ���ݿ����Ӷ���
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
	 * �ر����ݿ�����
	 * @param conn ���ݿ�����
	 * @param stmt Statement����
	 * @param rs �����
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
	 * ����ɾ���ĵĲ���
	 * @param sqlԤ�����SQL���
	 * @param param�������ַ�������
	 * @return Ӱ�������
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
